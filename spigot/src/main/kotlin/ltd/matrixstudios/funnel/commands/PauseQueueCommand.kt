package ltd.matrixstudios.funnel.commands

import co.aikar.commands.BaseCommand
import co.aikar.commands.annotation.CommandAlias
import co.aikar.commands.annotation.CommandPermission
import co.aikar.commands.annotation.Name
import ltd.matrixstudios.application.queues.QueueService
import org.bukkit.ChatColor
import org.bukkit.command.CommandSender

object PauseQueueCommand : BaseCommand() {

    @CommandAlias("pausequeue")
    @CommandPermission("funnel.queue.pause")
    fun pauseQueue(sender: CommandSender, @Name("queue")queueId: String) {
        val queue = QueueService.findQueue(queueId).get()

        if (queue == null) {
            sender.sendMessage("${ChatColor.RED}Queue does not exist")
            return
        }

        queue.paused = !queue.paused

        queue.save()
        sender.sendMessage("${ChatColor.GREEN}Updated the paused status of ${ChatColor.WHITE}$queueId ${ChatColor.GREEN}to ${queue.paused}")
    }
}