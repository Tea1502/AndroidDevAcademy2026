package tasks

fun runTask2() {
    val name: String = readln()
    var numberOfLives = 3
    var points = 0
    var level = 1

    points += 50
    println("Points: $points")

    numberOfLives -= 1
    println("Lives: $numberOfLives")

    val bonus = 2
    points *= bonus

    if(points > 100) {
        level += 2
    } else if(points < 100 && points > 50) {
        level += 1
    } else {
        println("Same tasks.getLevel, not enough tasks.getPoints.")
    }

    val isGameOver = if(numberOfLives == 0) "Game Over!" else "Continue"

    println("$name has $numberOfLives lives and earned $points tasks.getPoints.")
}