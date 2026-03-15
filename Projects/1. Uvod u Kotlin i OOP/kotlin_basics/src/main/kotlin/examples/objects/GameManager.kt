package examples.objects

object GameManager {

    var totalPlayers = 0
        private set

    var totalScore = 0
        private set

    fun registerPlayer() {
        totalPlayers++
        println("Player registered. Total players: $totalPlayers")
    }

    fun addGlobalScore(points: Int) {
        totalScore += points
    }

    fun showGameStats() {
        println("=== Game Stats ===")
        println("Total players: $totalPlayers")
        println("Total score: $totalScore")
    }
}