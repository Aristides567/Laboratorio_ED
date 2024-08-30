interface FizzBuzz {
    fun fizzBuzz(number: Int): String
}

class FizzBuzzImpl : FizzBuzz {
    override fun fizzBuzz(number: Int): String {
        return when {
            number % 15 == 0 -> "FizzBuzz"
            number % 5 == 0 -> "Buzz"
            number % 3 == 0 -> "Fizz"
            else -> number.toString()
        }
    }
}

fun main() {
    val fizzBuzz = FizzBuzzImpl()
    for (i in 1..100) {
        print("${fizzBuzz.fizzBuzz(i)}\t")
        if (i % 10 == 0) {
            println() 
        }
    }
}