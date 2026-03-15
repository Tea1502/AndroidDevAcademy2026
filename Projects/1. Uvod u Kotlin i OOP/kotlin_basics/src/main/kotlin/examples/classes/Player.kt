package examples.classes

/*
class Player2(
    val name: String,
    var lives: Int,
    var score: Int
) {

    fun showStatus() {
        println("Player: $name")
        println("Lives: $lives")
        println("Score: $score")
        println()
    }

    fun addPoints(points: Int) {
        score += points
        println("$name earned $points tasks.getPoints!")
    }

    fun takeDamage(damage: Int) {
        if (damage > 50) {
            lives--
            println("$name lost a life!")
        } else {
            println("$name survived the attack!")
        }
    }

    fun isAlive(): Boolean {
        return lives > 0
    }
}*/
/*
class Player(
    val name: String,
   initialLives: Int
) {
    //public get, private set
    var score: Int = 0
        private set

    var level: Int = 1
        private set

    var lives: Int = initialLives
    private set

    fun addPoints(points: Int) {
        score += points
        if (score >= 100) {
            levelUp()
        }
    }
    fun takeDamage(damage: Int) {
        if (damage > 50) {
            lives--
        }
    }

    fun isAlive(): Boolean = lives > 0

    override fun toString(): String {
        return """
            Player: $name
            Lives: $lives
            Level: $level
            Score: $score
        """.trimIndent()
    }
    private fun levelUp() {
        level++
        println("$name leveled up to level $level!")
    }
}*/

class Player(
    val name: String,
    var lives: Int,
    initialScore: Int
) {
    var score: Int = 0
        private set

    var level: Int = 1
        private set

    // INIT block runs after primary constructor
    init {
        println("Creating player: $name")
        if (lives <= 0) {
            println("Lives cannot be 0 or negative. Setting to 1.")
            lives = 1
        }
        score = if (initialScore >= 0) initialScore else 0
    }
    // Secondary constructor
    constructor(name: String) : this(name, 3, 0) {
        println("Secondary constructor used (default player).")
    }

    fun addPoints(points: Int) {
        score += points
        if (score >= 100) level++
    }

    override fun toString(): String {
        return "Player(tasks.getName='$name', lives=$lives, tasks.getLevel=$level, score=$score)\n"
    }
}
/*
class Player(val name: String) {

    var score = 0
        private set

    fun addPoints(points: Int) {
        score += points
        updateHighScore(this)
    }

    companion object {

        var highScore = 0
            private set

        var bestPlayer: String = "None"
            private set

        private fun updateHighScore(player: Player) {
            if (player.score > highScore) {
                highScore = player.score
                bestPlayer = player.tasks.getName
            }
        }

        fun showBestHighScore() {
            println("High Score: $highScore by $bestPlayer")
        }
    }
}

fun runCompanionObjectExample() {
    val p1 = Player("Alex")
    val p2 = Player("Bob")

    p1.tasks.addPoints(50)
    p2.tasks.addPoints(100)

    Player.showBestHighScore()
}*/
