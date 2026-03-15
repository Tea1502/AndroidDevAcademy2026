package examples.variables

const val PI_VALUE = 3.14159

fun runVariablesExample() {
    val name: String = "Jane Doe"
    var age = 26
    println("Current age: $age")
    age += 1
    println("After one year, $name will be $age years old.")
    println("The value of PI is: $PI_VALUE")
}
