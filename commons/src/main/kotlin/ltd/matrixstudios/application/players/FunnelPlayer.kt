package ltd.matrixstudios.application.players

import java.util.*

data class FunnelPlayer(
    var uuid: UUID,
    var priority: Int,
    var inserted: Long
) : Comparable<FunnelPlayer> {


    override fun compareTo(other: FunnelPlayer): Int {
        var result = 0
        result = this.priority - other.priority
        if (result == 0) {
            return if (inserted < other.inserted) {
                -1
            } else {
                1
            }
        }
        return result
    }
}