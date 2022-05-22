package ltd.matrixstudios.application.thread


import ltd.matrixstudios.application.FunnelCommons
import ltd.matrixstudios.application.queues.QueueService

class QueueThread : Thread() {
    override fun run() {
        while (true) {
            for (queue in QueueService.getAllQueues().get()) {
                if (!queue.paused) {
                    val nextToSend = queue.players.poll()

                    if (nextToSend != null) {
                        FunnelCommons.runRedisCommand {
                            it.publish(
                                "Funnel:bukkit",
                                "SEND_PLAYER|${nextToSend.uuid}"
                            )
                        }
                    }
                }
            }
            try {
                sleep(50L)
            } catch (e: InterruptedException) {
                e.printStackTrace()
            }
        }
    }

}
