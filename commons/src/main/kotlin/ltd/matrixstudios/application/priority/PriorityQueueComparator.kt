package ltd.matrixstudios.application.priority

import ltd.matrixstudios.application.players.FunnelPlayer

class PriorityQueueComparator : Comparator<FunnelPlayer> {

    override fun compare(o1: FunnelPlayer?, o2: FunnelPlayer?): Int {
        return o1!!.compareTo(o2!!)
    }
}