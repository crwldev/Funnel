package ltd.matrixstudios.funnel.commands

import co.aikar.commands.BaseCommand
import co.aikar.commands.annotation.CommandAlias
import co.aikar.commands.annotation.Name
import ltd.matrixstudios.funnel.FunnelSpigotPlugin
import ltd.matrixstudios.application.queues.QueueService
import org.bukkit.ChatColor
import org.bukkit.entity.Player

object JoinQueueCommand : BaseCommand() {

    @CommandAlias("joinqueue")
    fun joinQueue(player: Player, @Name("queue")queue: String) {
        val actualQueue = QueueService.findQueue(queue).get()

        if (actualQueue == null) {
            player.sendMessage("${ChatColor.RED}No queue with this name exists")
            return
        }

        if (QueueService.findQueueByPlayer(player.uniqueId).get() != null) {
            player.sendMessage("${ChatColor.RED}You are already in a queue")
            return
        }

        player.sendMessage("${ChatColor.GREEN}You have been added to the queue")
        QueueService.addPlayerToQueue(actualQueue, player.uniqueId, FunnelSpigotPlugin.instance.getPriorityForPlayer(player))
    }
}