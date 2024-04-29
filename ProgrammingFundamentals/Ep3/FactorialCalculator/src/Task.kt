import com.faangx.ktp.basics.FactorialCalculatorMiniApp

fun factorialOf(x: Long): Long {
    var fact = 1L
    for (i in 1..x){
     fact = i*x
    }
    return fact
}

fun permutationsOf(n: Long, r: Long): Long {
    return factorialOf(n) / factorialOf(n - r)}

fun combinationsOf(n: Long, r: Long): Long {
    return factorialOf(n) / (factorialOf(r) * factorialOf(n - r))
}

fun main() {
    FactorialCalculatorMiniApp(
        ::factorialOf,
        ::permutationsOf,
        ::combinationsOf
    )
}