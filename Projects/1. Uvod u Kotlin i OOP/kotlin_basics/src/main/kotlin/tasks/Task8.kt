package tasks

import java.lang.Exception

fun runTask8() {
    val user = UserAccount("Marko", "marko@gmail.com")
    val userJ = UserAccount("Jack", "jack@gmail.com")
    val userS = UserAccount("Sara", "sara@gmail.com", 13)
    val userH = try{
        UserAccount("Henry:henry@gmail.com:12")
    } catch (e: Exception) {
        println("Account can't be created, underage.")
    }
    user.verifyEmail()
}

class UserAccount(
    val username: String,
    val email: String,
    val age: Int
) {
    var isVerified = false
        private set

    val isAdult = age >= 18

    init {
        if(age < 13) throw Exception("Underage")

        println("Korisnik je kreiran: $username")
    }

    constructor(username: String, email: String): this(username = username, email = email, age = 18) {
        if (email.contains("@")) {
            println("Email contains @")
        }
        else {
            println("No @ sign, recheck email")
        }
    }

    fun verifyEmail() {
        isVerified = true
        println("Email is verified!")
    }

    constructor(userData: String): this(
        username = userData.split(":")[0],
        email = userData.split(":")[1],
        age = userData.split(":")[2].toInt()
    )

}