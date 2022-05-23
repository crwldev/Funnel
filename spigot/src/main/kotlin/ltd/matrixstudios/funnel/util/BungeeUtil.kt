package ltd.matrixstudios.funnel.util

import ltd.matrixstudios.funnel.FunnelSpigotPlugin
import org.bukkit.Bukkit
import org.bukkit.entity.Player
import java.io.ByteArrayOutputStream
import java.io.DataOutputStream
import java.io.IOException


object BungeeUtil {

    fun send(player: Player, server: String?) {
        val b = ByteArrayOutputStream()
        val out = DataOutputStream(b)
        try {
            out.writeUTF("Connect")
            out.writeUTF(server)
        } catch (ignored: IOException) {
        }
        player.sendPluginMessage(FunnelSpigotPlugin.instance, "BungeeCord", b.toByteArray())
    }

    fun sendAll(server: String?) {
        val b = ByteArrayOutputStream()
        val out = DataOutputStream(b)
        try {
            out.writeUTF("Connect")
            out.writeUTF(server)
        } catch (ignored: IOException) {
        }
        for (player in Bukkit.getOnlinePlayers()) {
            player.sendPluginMessage(FunnelSpigotPlugin.instance, "BungeeCord", b.toByteArray())
        }
    }
}