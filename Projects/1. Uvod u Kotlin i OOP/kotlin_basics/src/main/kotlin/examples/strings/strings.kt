package examples.strings


fun runStringExample() {
    val name = "John"
    val lastName = "Doe"
    val fullName = name + lastName
    println(fullName)
    val nameWithTemplate = "$name $lastName"
    print(nameWithTemplate)
}
