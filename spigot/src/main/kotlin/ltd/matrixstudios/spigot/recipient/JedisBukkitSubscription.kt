package ltd.matrixstudios.spigot.recipient

import ltd.matrixstudios.spigot.FunnelSpigotPlugin
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

        when (packetType)
        {
            "SEND_PLAYER" -> {
                object : BukkitRunnable() {
                    override fun run() {
                        val player = Bukkit.getPlayer(UUID.fromString(extraMeta))
                        if (player != null) {
                            player.sendMessage("${ChatColor.GREEN}You would have been sent")
                        } else {
                            return
                        }
                    }
                }.runTask(FunnelSpigotPlugin.instance)
            }
        }
    }
}