package ltd.matrixstudios.application

import ltd.matrixstudios.application.thread.QueueThread

class FunnelApplication {

    companion object {
        lateinit var instance: FunnelApplication

        @JvmStatic
        fun main(args: Array<String>) {
            instance = FunnelApplication()
        }
    }

    init {
        FunnelCommons.start("redis://172.18.0.1:6379/0", "none", "none", true)

        QueueThread().start()
    }



}