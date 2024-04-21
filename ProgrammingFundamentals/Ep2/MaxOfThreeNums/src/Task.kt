import com.faangx.ktp.basics.MaxOfThreeNumsMiniApp

fun maxOf(x: Int, y: Int, z: Int): Int {
    return if(x > y){
        if (x > z){
            x
        }else {
            z
        }
    }else if(y > z){
        y
    }else{
        z
    }
}

fun main() {
    MaxOfThreeNumsMiniApp(::maxOf)
}