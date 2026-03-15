package examples.loops

fun runForExample() {
    val fruits = listOf("Apple", "Banana", "Cherry")

    for (fruit in fruits) {
        println(fruit)
    }
    for (i in 1..5) {
        println("$i is ${if (i % 2 == 0) "even" else "odd"}")
    }
    for (i in 1 until 5) {
        println(i)
    }
    for (i in (10 downTo 0 step 2)) {
        println("$i is ${if (i % 2 == 0) "even" else "odd"}")
    }
}

fun runWhileExample() {
    var i = 1

    while (i <= 5) {
        println(i)
        i++
    }
}

fun runDoWhileExample() {
    var d = 1

    println("Do while:")
    do {
        println(d)
        d++
    } while (d % 2 == 0)
}
