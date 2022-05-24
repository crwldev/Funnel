package ltd.matrixstudios.funnel.recipient

import ltd.matrixstudios.application.queues.QueueService
import ltd.matrixstudios.funnel.FunnelSpigotPlugin
import ltd.matrixstudios.funnel.util.BungeeUtil
import org.bukkit.Bukkit
import org.bukkit.ChatColor
import org.bukkit.scheduler.BukkitRunnable
import redis.clients.jedis.JedisPubSub
import java.util.*
import java.util.concurrent.TimeUnit

class JedisBukkitSubscription : JedisPubSub() {

    override fun onMessage(channel: String?, message: String?) {
        val packetMessageSplit = message!!.indexOf("|")
        val packetType = message.substring(0, packetMessageSplit)
        val extraMeta = message.substring(packetMessageSplit + "|".length)

        when (packetType) {
            "SEND_PLAYER" -> {
                object : BukkitRunnable() {
                    override fun run() {
                        val player = Bukkit.getPlayer(UUID.fromString(extraMeta))
                        val queue = QueueService.findQueueByPlayer(player.uniqueId).get()
                        if (queue != null) {
                            if (player != null) {
                                player.sendMessage("${ChatColor.GREEN}You are being sent!")
                                BungeeUtil.send(player, queue.destination)

                                queue.remove(player.uniqueId)

                                queue.save()
                            }


                        } else {
                            return
                        }
                    }
                }.runTask(FunnelSpigotPlugin.instance)
            }
            "CHECK_QUEUE" -> {
                object : BukkitRunnable() {
                    override fun run() {

                       QueueService.findQueue(extraMeta).thenApply {
                            if (it == null) {
                                Bukkit.getLogger().severe("Tried to check queue but it was null")

                                return@thenApply
                            }



                           for (player in it.players) {
                               val bukkitPlayer = Bukkit.getPlayer(player.uuid)

                               if (bukkitPlayer != null) {
                                   player.lastUpdated = System.currentTimeMillis()

                               }

                               if (bukkitPlayer == null) {
                                   if (System.currentTimeMillis().minus(player.lastUpdated) >= 15000L) {
                                       it.remove(player.uuid)
                                   }
                               }


                           }

                           it.save()
                        }
                    }
                }.runTask(FunnelSpigotPlugin.instance)
            }
        }
    }
}