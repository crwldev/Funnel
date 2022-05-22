package ltd.matrixstudios.application

import ltd.matrixstudios.application.thread.QueueThread

class FunnelApplication {

    companion object {
        lateinit var instance: FunnelApplication
    }

    init {
        QueueThread().start()
    }

    @JvmStatic
    fun main(args: Array<String>) {
        instance = FunnelApplication()
    }


}