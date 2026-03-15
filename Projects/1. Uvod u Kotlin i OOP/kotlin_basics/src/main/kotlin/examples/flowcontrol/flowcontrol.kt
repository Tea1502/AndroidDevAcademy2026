package examples.flowcontrol

fun runIfElseExample() {
    var age = 15

    // Traditional usage
    if (age >= 18) {
        println("Adult")
    } else {
        println("Minor")
    }

    //Expression
    age = 5
    val status = if (age >= 18) "Adult" else "Minor"
    val status2 = if (age >= 18) "Adult" else if (age < 7) "Junior" else "Minor"
    println(status2)
}

fun runWhenExample() {
    val day = "Friday"

    val message = when (day) {
        "Monday" -> "Start of the work week!"
        "Friday" -> "Almost weekend!"
        "Saturday", "Sunday" -> "It's the weekend!"
        else -> "Midweek day"
    }

    println(message)
}


fun runExample() {
    val x = readln()
    hasPrefix(x)
}
fun hasPrefix(x: Any) = when(x) {
    is String -> x.startsWith("prefix")
    else -> false
}