import com.faangx.ktp.basics.FactorCalculatorMiniApp

fun printFactorsOf(num: Int) {
    for (i in 1..num){
        if(num % i == 0){
            print("$i, ")
        }
    }
}

fun isPrime(num: Int): Boolean {
    var flag = false

    if(num == 0 || num ==1){
        flag = true
    }else{
        for(i in 2 .. num/2){

            if (num % i == 0){
                flag = true
            }
        }
    }
    return !flag
}

fun main() {
    FactorCalculatorMiniApp(::printFactorsOf, ::isPrime)
}