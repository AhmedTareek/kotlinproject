import oop.BMW
import oop.Car
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
    val x = BMW(color = "black")
    x.getFuelType()
    val end = System.currentTimeMillis()
    println("")
    print("time elapsed = ${end-begin}")

}


