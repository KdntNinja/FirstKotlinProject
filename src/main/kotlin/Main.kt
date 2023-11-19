import kotlin.math.sqrt

fun isEven(x: Int): Boolean = x % 2 == 0

fun isOdd(x: Int): Boolean = x % 2 != 0

fun isPrime(x: Int): Boolean {
    if (x < 2) return false
    for (i in 2..sqrt(x.toDouble()).toInt()) {
        if (x % i == 0) return false
    }
    return true
}

fun main() {
    while (true) {
        print("Enter a number: ")
        val input = readlnOrNull() ?: continue
        val number = input.toIntOrNull()
        if (number == null) {
            println("Invalid input")
            continue
        }
        if (number == 0) break

        if (isEven(number)) println("$number is even")
        if (isOdd(number)) println("$number is odd")
        if (isPrime(number)) println("$number is prime")
    }
}