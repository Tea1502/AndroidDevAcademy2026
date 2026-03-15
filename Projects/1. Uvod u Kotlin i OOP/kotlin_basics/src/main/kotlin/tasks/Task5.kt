package tasks

fun runTask5() {
    val input = readln()
    var numA = 0
    var i = input.length

    while (i > 1) {
        if(input[i-1] == 'a') {
            numA += 1
        }
        i--
    }
    println(numA)
}


fun countCharA() {
    val sentence = "banana is a tasty and amazing fruit"
    var count = 0

    for (char in sentence) {
        if (char.lowercaseChar() == 'a') {
            count++
        }
    }

    println("Letter 'a' appears $count times")
}

fun countCharAWithWhileLoop() {
    val sentence = "banana is a tasty and amazing fruit"
    var count = 0
    var index = 0

    while (index < sentence.length) {
        if (sentence[index] == 'a') {
            count++
        }
        index++
    }

    println("Letter 'a' appears $count times")
}
