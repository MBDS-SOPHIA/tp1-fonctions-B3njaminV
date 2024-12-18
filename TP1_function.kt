    fun main(args: Array<String>) {
        println("Display 10 even numbers:")
        displayNumbers(10, true)
        println("Display 10 odd numbers:")
        displayNumbers(10, false)
        println("Display 10 Fibonacci numbers:")
        displayFibonacci(10)
        println("Factorial of 10:")
        println(factorial())
        println("Display 10 prime numbers:")
        displayPrimes(10)
    }

    fun displayNumbers(x: Int, isEven: Boolean) {
        var i = 0
        var n = 0
        while (i < x) {
            if (isEven && n % 2 == 0 || !isEven && n % 2 != 0) {
                println(n)
                i++
            }
            n++
        }
    }

    fun displayFibonacci(x: Int) {
        var a = 0
        var b = 1
        var i = 0
        while (i < x) {
            println(a)
            val c = a + b
            a = b
            b = c
            i++
        }
    }

    fun factorial(x: Int = 10): Int {
        var result = 1
        for (i in 1..x) {
            result *= i
        }
        return result
    }

    fun displayPrimes(x: Int) {
        var i = 0
        var n = 2
        while (i < x) {
            var isPrime = true
            for (j in 2 until n) {
                if (n % j == 0) {
                    isPrime = false
                    break
                }
            }
            if (isPrime) {
                println(n)
                i++
            }
            n++
        }
    }