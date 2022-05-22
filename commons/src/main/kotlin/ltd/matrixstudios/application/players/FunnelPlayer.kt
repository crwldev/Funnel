package ltd.matrixstudios.application.players

import java.util.*

data class FunnelPlayer(
    var uuid: UUID,
    var priority: Int,
    var inserted: Long
) {

   fun compareTo(item: Any): Int {
        var result = 0
        if (item is FunnelPlayer) {
            val otherPlayer: FunnelPlayer = item as FunnelPlayer
            result = this.priority - otherPlayer.priority
            if (result == 0) {
                return if (inserted < otherPlayer.inserted) {
                    -1
                } else {
                    1
                }
            }
        }
        return result
    }
}