package ltd.matrixstudios.funnel

import co.aikar.commands.PaperCommandManager
import ltd.matrixstudios.application.FunnelCommons
import ltd.matrixstudios.funnel.commands.JoinQueueCommand
import ltd.matrixstudios.funnel.commands.PauseQueueCommand
import ltd.matrixstudios.funnel.commands.QueueDebug
import ltd.matrixstudios.application.priority.PriorityService
import ltd.matrixstudios.funnel.recipient.JedisBukkitSubscription
import org.bukkit.entity.Player
import org.bukkit.plugin.java.JavaPlugin
import kotlin.concurrent.thread


class FunnelSpigotPlugin : JavaPlugin() {

    companion object {
        lateinit var instance: FunnelSpigotPlugin
    }

    override fun onEnable() {
        saveDefaultConfig()
        instance = this

        createQueue()
        loadPriorities()

        thread {
            FunnelCommons.pubsubJedisResource.use {
                it.subscribe(JedisBukkitSubscription(), "Funnel:bukkit")
            }
        }

        val commandHandler = PaperCommandManager(this).apply {
            this.registerCommand(QueueDebug)
            this.registerCommand(JoinQueueCommand)
            this.registerCommand(PauseQueueCommand)
        }
    }

    fun getPriorityForPlayer(player: Player) : Int {
        return PriorityService.priorities.entries.sortedBy { it.value }.reversed().firstOrNull() { player.hasPermission(it.key) }?.value ?: 0
    }

    fun createQueue() {
        FunnelCommons.start(
            config.getString("jedisURI").lowercase(),
            config.getString("queueName"),
            config.getString("queueDestination"),
            false
        )
    }

    fun loadPriorities() {
        for (entry in config.getConfigurationSection("priorities").getKeys(false)) {
            val priority = config.getInt("priorities.$entry.priority")
            val permission = config.getString("priorities.$entry.permission")

            PriorityService.registerNewPriority(permission, priority)
        }
    }
}