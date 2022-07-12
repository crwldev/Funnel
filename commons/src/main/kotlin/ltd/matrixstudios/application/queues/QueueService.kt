package ltd.matrixstudios.application.queues

import ltd.matrixstudios.application.FunnelCommons
import ltd.matrixstudios.application.players.FunnelPlayer
import java.util.*
import java.util.concurrent.CompletableFuture

object QueueService {


    fun addPlayerToQueue(queue: Queue, player: UUID, priority: Int) {
        queue.players.add(FunnelPlayer(player, priority, System.currentTimeMillis(), System.currentTimeMillis()))


        queue.save()
    }
    

    fun findQueueByPlayer(player: UUID) : CompletableFuture<Queue?> {
        return CompletableFuture.supplyAsync {
            getAllQueues().get().firstOrNull { it.containsPlayer(player) }
        }
    }


    fun getAllQueues() : CompletableFuture<Collection<Queue>> {
        return CompletableFuture.supplyAsync {
            return@supplyAsync FunnelCommons.runRedisCommand { jedis ->
                val redisStrings = jedis.hgetAll("Funnel:queues:")

                val queues = mutableListOf<Queue>()

                for (value in redisStrings.values) {
                    val deserialized = FunnelCommons.gson.fromJson(value, Queue::class.java)

                    queues.add(deserialized)
                }

                return@runRedisCommand queues
            }
        }
    }

    fun findQueue(queueId: String) : CompletableFuture<Queue?> {
        return CompletableFuture.supplyAsync {
            return@supplyAsync FunnelCommons.runRedisCommand {
                val id = queueId.lowercase()
                val exists = it.hexists("Funnel:queues:", id)

                if (exists)
                {

                    return@runRedisCommand FunnelCommons.gson.fromJson(
                        it.hget("Funnel:queues:", id),
                        Queue::class.java
                    )
                } else {
                    return@runRedisCommand null
                }
            }
        }

    }
}