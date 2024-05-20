import com.faangx.ktp.patterns.single.PatternMiniApp

fun printPattern(lines: Int, char1: Char, char2: Char) {
    repeat(lines) { i ->
        repeat(lines - i - 1) {
            print(char2)
        }
        print(char1)
        repeat(2 * i-1) {
            print(char2)
        }
        if (i != 0) { // To avoid printing an extra character in the first row
            print(char1)
        }
        repeat(lines - i - 1) {
            print(char2)
        }
        println()
    }
}

fun main() {
    PatternMiniApp("P3", ::printPattern)
}