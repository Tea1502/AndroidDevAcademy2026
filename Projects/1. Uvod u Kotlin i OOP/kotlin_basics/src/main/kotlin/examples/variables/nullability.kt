package examples.variables

fun runNullableExample() {
    val name: String = "John"      //non-nullable
    val nickname: String? = null   // nullable

    println(name.length)
    println(nickname?.length)

    //execute code only if it's not null
    nickname?.let {
        println("Nickname defined: $it")
    }
}
fun runNullExample() {
    val nickname: String? = null

    val length = if(nickname != null) nickname.length else 0
    val lengthElvis = nickname?.length ?: 0 // Elvis operator ?:

    println(length)
    println(lengthElvis)
    println(nickname!!.length) // not-null assertion operator
}
