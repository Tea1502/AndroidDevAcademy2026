package tasks

fun runTask4() {
    val n = readln().toInt()
    var sum = 0
    for (num in  0..n) {
        sum += num
    }
    println(sum)
}
