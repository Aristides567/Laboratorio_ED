interface Number {
    val value: Int
    fun isPrime(): Boolean
    fun isEven(): Boolean
}

class PrimeNumber(override val value: Int) : Number {
    override fun isPrime(): Boolean {
        return true 
    }

    override fun isEven(): Boolean = value % 2 == 0
}

class EvenNumber(override val value: Int) : Number {
    override fun isPrime(): Boolean = false 
    override fun isEven(): Boolean = true
}

class OddNumber(override val value: Int) : Number {
    override fun isPrime(): Boolean {
        return true 
    }

    override fun isEven(): Boolean = false
}

fun countNumbers(n: Int): Triple<Int, Int, Int> {
    var countPrimes = 0
    var countEven = 0
    var countOdd = 0

    for (i in 1..n) {
        val number: Number = if (i % 2 == 0) EvenNumber(i) else PrimeNumber(i)
        countPrimes += if (number.isPrime()) 1 else 0
        countEven += if (number.isEven()) 1 else 0
        countOdd += if (!number.isEven()) 1 else 0
    }

    return Triple(countPrimes, countEven, countOdd)
}

fun main() {
    val n = 100
    val (primeCount, evenCount, oddCount) = countNumbers(n)

    println("Prime numbers count: $primeCount")
    println("Even numbers count: $evenCount")
    println("Odd numbers count: $oddCount")
}