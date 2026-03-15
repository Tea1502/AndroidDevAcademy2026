import examples.classes.Player

fun runConstructorExample() {
    println("---- Primary Constructor ----")
    val player1 = Player("Alex", 5, 20)
    println(player1)

    println("---- Secondary Constructor ----")
    val player2 = Player("Bob")
    println(player2 )

    println("---- Testing Validation ----")
    val player3 = Player("Eve", -2, -50)
    println(player3)
}