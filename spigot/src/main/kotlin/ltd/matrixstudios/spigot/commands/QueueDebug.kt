package ltd.matrixstudios.spigot.commands

import co.aikar.commands.BaseCommand
import co.aikar.commands.annotation.CommandAlias
import ltd.matrixstudios.application.queues.QueueService
import org.bukkit.entity.Player

object QueueDebug : BaseCommand() {

    @CommandAlias("queuedebug")
    fun queueDebug(player: Player) {
        QueueService.findQueueByPlayer(player.uniqueId).thenAccept {
            if (it != null) {
                player.sendMessage(it.id)
                player.sendMessage("${it.getPosition(player.uniqueId)}/${it.getTotalPlayersQueued()}")
                player.sendMessage(it.paused.toString())
            }
        }

    }
}