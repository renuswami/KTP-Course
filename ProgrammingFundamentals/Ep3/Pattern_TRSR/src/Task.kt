import com.faangx.ktp.patterns.single.PatternMiniApp

fun printPattern(lines: Int) {
    repeat(lines) { i ->
        repeat(i) {
            print(" ")
        }
        for (j in lines downTo 1 + i) {
            print(j)
        }
        println()
    }
}

fun main() {
    PatternMiniApp("TRSR", ::printPattern)
}
