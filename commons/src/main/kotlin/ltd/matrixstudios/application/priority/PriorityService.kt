package ltd.matrixstudios.application.priority

object PriorityService {

    val priorities = hashMapOf<String, Int>()

    fun registerNewPriority(permission: String, priority: Int) {
        priorities[permission] = priority
    }

}