package examples.objects

fun runObjectExample() {
    Logger.printLog("The application has started.")
    Logger.isEnabled = false
    Logger.printLog("Show log message.")
}


fun runGameManagerObjectExample() {
    GameManager.registerPlayer()
    GameManager.registerPlayer()

    GameManager.addGlobalScore(100)

    GameManager.showGameStats()
}