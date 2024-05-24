fun printBinomialExpansion(n: Int) {
    if (n == 0) {
        println("1") // Special case for n = 0
        return
    }

    if (n == 1) {
        println("a + b") // Special case for n = 1
        return
    }

    for (i in 0..n) {
        val coeff = combinationsOf(n, i)
        val powerOfA = n - i
        val powerOfB = i

        if (coeff != 1) print("$coeff")

        if (powerOfA > 0) {
            if (coeff > 1) {
                if (powerOfA == 1) print("a") else print("a^$powerOfA")
            } else {
                print("a")
            }
        }

        if (powerOfA > 0 && powerOfB > 0) print("*")

        if (powerOfB > 0) {
            if (coeff > 1) {
                if (powerOfB == 1) print("b") else print("b^$powerOfB")
            } else {
                print("b")
            }
        }

        if (i < n) print(" + ")
    }
    println()
}

fun factorialOf(x: Int): Int {
    var fact = 1
    for (i in 1..x) {
        fact *= i
    }
    return fact
}

fun permutationsOf(n: Int, r: Int): Int {
    var permutation = 1
    for (i in (n - r + 1)..n) {
        permutation *= i
    }
    return permutation
}

fun combinationsOf(n: Int, r: Int): Int {
    return permutationsOf(n, r) / factorialOf(r)
}

fun main() {
    printBinomialExpansion(1) // Change this value for different n
}
