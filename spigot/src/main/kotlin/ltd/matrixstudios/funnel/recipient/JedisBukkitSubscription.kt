package ltd.matrixstudios.funnel.recipient

import ltd.matrixstudios.application.queues.QueueService
import ltd.matrixstudios.funnel.FunnelSpigotPlugin
import ltd.matrixstudios.funnel.util.BungeeUtil
import org.bukkit.Bukkit
import org.bukkit.ChatColor
import org.bukkit.scheduler.BukkitRunnable
import redis.clients.jedis.JedisPubSub
import java.util.*

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
                            }

                            queue.remove(player.uniqueId)

                            queue.save()

                        } else {
                            return
                        }
                    }
                }.runTask(FunnelSpigotPlugin.instance)
            }
        }
    }
}