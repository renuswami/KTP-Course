import com.faangx.ktp.patterns.single.PatternMiniApp

fun printPattern(lines: Int, char: Char) {
    repeat(lines){
        repeat(it + 1) {
            print(char)
        }
        println()
    }
}

fun main() {
    PatternMiniApp("BL", ::printPattern)
}