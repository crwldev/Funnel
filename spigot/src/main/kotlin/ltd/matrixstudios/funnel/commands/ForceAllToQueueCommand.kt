package ltd.matrixstudios.funnel.commands

import co.aikar.commands.BaseCommand
import co.aikar.commands.annotation.CommandAlias
import co.aikar.commands.annotation.CommandPermission
import co.aikar.commands.annotation.Name
import ltd.matrixstudios.application.queues.QueueService
import org.bukkit.Bukkit
import org.bukkit.ChatColor
import org.bukkit.entity.Player

object ForceAllToQueueCommand : BaseCommand() {

    @CommandAlias("queueforceall")
    @CommandPermission("funnel.queue.forceall")
    fun forceAll(player: Player, @Name("queue")queueId: String) {
        val queue = QueueService.findQueue(queueId).get()

        if (queue == null) {
            player.sendMessage("${ChatColor.RED}Queue does not exist")
            return
        }

        Bukkit.getOnlinePlayers().forEach {
            QueueService.addPlayerToQueue(queue, it.uniqueId, 0)
        }
    }
}