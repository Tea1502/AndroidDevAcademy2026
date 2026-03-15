package examples.functions

fun runFunctionsExample() {
    greet("Jane")
    println(multiply(6, 4))
    orderCoffee(sugar = 2, size = "Large")
}

fun greet(name: String) {
    println("Hey $name, welcome to Kotlin!")
}
fun multiply(a: Int, b: Int) = a * b

fun orderCoffee(size: String = "Medium", sugar: Int = 1) {
    println("You ordered a $size coffee with $sugar sugar(s)")
}

fun getWeatherReport(): String {
    return """
        Daily Weather Forecast
        ----------------------
        1. Zagreb: 15°C, Light Rain
        2. Osijek: 18°C, Partly Cloudy
        3. Split: 22°C, Sunny
    """.trimIndent()
}