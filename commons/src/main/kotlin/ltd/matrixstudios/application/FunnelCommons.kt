package ltd.matrixstudios.application

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.google.gson.LongSerializationPolicy
import ltd.matrixstudios.application.priority.PriorityQueueComparator
import ltd.matrixstudios.application.queues.Queue
import redis.clients.jedis.Jedis
import redis.clients.jedis.JedisPool
import java.net.URI
import java.util.*


object FunnelCommons {

    lateinit var instance: FunnelCommons

    var gson: Gson = GsonBuilder()
        .serializeNulls()
        .setPrettyPrinting()
        .setLongSerializationPolicy(LongSerializationPolicy.STRING)
        .create()

    lateinit var globalJedis: JedisPool
    lateinit var globalJedisResource: Jedis

    lateinit var pubsubJedisPool: JedisPool
    lateinit var pubsubJedisResource: Jedis

    lateinit var globalQueueForInstance: Queue

    fun start(jedisURI: String, queueId: String, destination: String, console: Boolean) {
        instance = this

        globalJedis = JedisPool(URI(jedisURI))
        globalJedisResource = globalJedis.resource

        pubsubJedisPool = JedisPool(URI(jedisURI))
        pubsubJedisResource = pubsubJedisPool.resource


        if (!console) {
            runRedisCommand {
                val exists = it.hexists("Funnel:queues:", queueId)

                if (exists) {
                    val redisFetchedData = it.hget("Funnel:queues:", queueId)

                    val queue = gson.fromJson(redisFetchedData, Queue::class.java)

                    globalQueueForInstance = queue

                }

                if (!exists) {
                    val queue =
                        Queue(queueId.lowercase(), PriorityQueue(PriorityQueueComparator()), destination, queueId, true)

                    queue.save()
                }
            }
        }
    }

    fun <T> runPubsubRedisCommand(lambda: (Jedis) -> T): T {
        if (globalJedis == null || globalJedis.isClosed) {
            throw IllegalStateException("A connection to the redis server couldn't be established or has been forcefully closed")
        }

        try {
            globalJedis.resource.use { jedis -> return lambda(jedis) }
        } catch (e: Exception) {
            throw RuntimeException("Could not use resource and return", e)
        }
    }

    fun <T> runRedisCommand(lambda: (Jedis) -> T): T {
        if (globalJedis == null || globalJedis.isClosed) {
            throw IllegalStateException("A connection to the redis server couldn't be established or has been forcefully closed")
        }

        try {
            globalJedis.resource.use { jedis -> return lambda(jedis) }
        } catch (e: Exception) {
            throw RuntimeException("Could not use resource and return", e)
        }
    }
}