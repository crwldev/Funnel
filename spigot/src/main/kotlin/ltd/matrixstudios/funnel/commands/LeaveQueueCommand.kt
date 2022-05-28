package ltd.matrixstudios.funnel.commands

import co.aikar.commands.BaseCommand
import co.aikar.commands.annotation.CommandAlias
import ltd.matrixstudios.application.queues.QueueService
import org.bukkit.ChatColor
import org.bukkit.entity.Player

object LeaveQueueCommand : BaseCommand() {

    @CommandAlias("leavequeue|lq")
    fun leaveQueue(player: Player) {
        QueueService.findQueueByPlayer(player.uniqueId).thenApply {
            if (it == null) {
                player.sendMessage("${ChatColor.RED}You are not currently in a queue")

                return@thenApply
            }

            it.remove(player.uniqueId)
            player.sendMessage("${ChatColor.GREEN}You have left the queue!")

            it.save()
        }
    }
}