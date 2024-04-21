import com.faangx.ktp.basics.StageOfLifeMiniApp

fun stageOfLife(age: Int): String {
    when {
        age in 1..2 -> {
            return "Infancy"
        }
        age in 3..11 -> {
            return "Childhood"
        }
        age in 12..17 -> {
            return "Teenage"
        }
        age in 18..59 -> {
            return "Adulthood"
        }
        age >= 60 -> {
            return "Old age"
        }
        else -> {
            return ""
        }
    }
}

fun main() {
    StageOfLifeMiniApp(::stageOfLife)
}