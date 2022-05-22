package ltd.matrixstudios.application.queues

import ltd.matrixstudios.application.FunnelCommons
import ltd.matrixstudios.application.players.FunnelPlayer
import java.util.*


data class Queue(
    var id: String,
    var players: PriorityQueue<FunnelPlayer>,
    var destination: String,
    var fancyName: String,
    var paused: Boolean
){

    fun save() {
        FunnelCommons.runRedisCommand {
            it.hset("Funnel:queues:", id, FunnelCommons.gson.toJson(this))
        }
    }

    fun containsPlayer(uuid: UUID?): Boolean {
        for (player in players) {
            if (player.uuid == uuid) {
                return true
            }
        }
        return false
    }

    fun getPosition(uuid: UUID?): Int {
        if (!this.containsPlayer(uuid)) {
            return 0
        }
        val queue: PriorityQueue<FunnelPlayer> = PriorityQueue(players)
        var position = 0
        while (!queue.isEmpty()) {
            val player: FunnelPlayer = queue.poll()
            if (player.uuid == uuid) {
                break
            }
            position++
        }
        return position + 1
    }

    fun getTotalPlayersQueued() : Int {
        return players.size
    }


}
