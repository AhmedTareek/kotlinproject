import java.lang.Math.random
import java.util.*
import kotlin.collections.List

class Main {
    fun addTwoNums(x : Int,y:Int): Int {
        return x+y
    }
}
fun main(args: Array<String> ){
    val begin = System.currentTimeMillis()
    //Thread.sleep(2000)
    val rolldixe = { side:Int -> if (side != 0) Random().nextInt(side) +1 else 0}

    val addtwonums: (Int,Int) -> Int = { side, f -> f+side }
    println(addtwonums(3,4))
    val end = System.currentTimeMillis()
    println("")
    print("time elapsed = ${end-begin}")



}