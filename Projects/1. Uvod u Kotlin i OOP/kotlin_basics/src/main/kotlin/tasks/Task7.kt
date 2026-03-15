package tasks

fun runTask7() {
 val password = readln()
    println(isStrongPassword(password))
}

fun isStrongPassword(password: String): Boolean {
    val hasUpperCase = password.any { char -> char.isUpperCase() }
    val hasDigit = password.any { char -> char.isDigit() }
    val isLongEnough = password.length >= 8

    return hasUpperCase && hasDigit && isLongEnough
}

