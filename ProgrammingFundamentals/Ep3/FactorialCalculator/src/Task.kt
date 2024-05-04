import com.faangx.ktp.basics.FactorialCalculatorMiniApp

fun factorialOf(x: Long): Long {
    var fact = 1L
    for (i in 1..x){
     fact *= i
    }
    return fact
}

fun permutationsOf(n: Long, r: Long): Long {
    var permutation = 1L
    for(i in (n-r+1)..n){
        permutation *= i
    }
    return permutation
}

fun combinationsOf(n: Long, r: Long): Long {
    return permutationsOf(n, r) / factorialOf(r)
}

fun main() {
    FactorialCalculatorMiniApp(
        ::factorialOf,
        ::permutationsOf,
        ::combinationsOf
    )
}