package tasks

fun runTask1() {
    val name: String = "Mark"
    var numberOfLives = 3
    var points = 0

    points += 50
    println("Points: $points")

    numberOfLives -= 1
    println("Lives: $numberOfLives")

    val bonus = 2
    points *= bonus

    println("$name has $numberOfLives lives and earned $points tasks.getPoints.")
}
