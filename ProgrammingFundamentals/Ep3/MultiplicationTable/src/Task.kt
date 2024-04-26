import com.faangx.ktp.basics.MultiplicationTableMiniApp

fun printTable(num: Int) {
    for (i in 1..10){
        println("$num X $i = " + i*num)
    }
}

fun main() {
    MultiplicationTableMiniApp(::printTable)
}