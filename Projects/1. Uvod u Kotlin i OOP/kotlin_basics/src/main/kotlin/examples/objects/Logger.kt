package examples.objects

object Logger {
    var isEnabled: Boolean = true

    fun printLog(message: String) {
        if(isEnabled) {
            println("[LOG] $message")
        }
    }
}