package tasks

val name: String = readln()
var numberOfLives = 3
var points = 0
var level = 1

fun runTask6() {

   addPoints(10)
    println("Ponts: $points")
    println(isAlive())
    println(getPlayerStats())
    println(listActions())

}
fun addPoints(value: Int) {
    points += value
}

fun getPlayerStats() = "$name has $numberOfLives lives, $points tasks.getPoints and is on tasks.getLevel $level"
fun isAlive() = numberOfLives > 0
fun listActions(): String {
    return """
            1 - collect super power
            2 - play hide and seek
            3 - defeat monster
            4 - collect health
        """.trimIndent()
}