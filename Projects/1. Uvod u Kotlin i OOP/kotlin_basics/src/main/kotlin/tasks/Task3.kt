package tasks

fun runTask3() {
    val name: String = readln()
    var numberOfLives = 3
    var points = 0
    var level = 1
    val action = readln()

    when(action) {
        "collect super power" -> {
            points += 10
        }
        "play hide and seek" -> {
            points += 2
        }
        "defeat monster" -> {
            level += 1
            points += 100
        }
        "collect health" ->  {
            if(numberOfLives < 3) {
                numberOfLives += 1
            }
        }
    }

    println("$action - $name has $numberOfLives lives and earned $points tasks.getPoints, tasks.getLevel $level.")
}