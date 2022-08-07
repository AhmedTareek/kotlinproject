import java.util.Scanner
import java.util.*
fun main(){
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val list = ArrayList<String>(n)
    for( i in 0 until n){
        list.add(i,sc.next())
    }
    println(list.filter { it.contains('b',true) || it.contains('m',true) }.toString().uppercase())
}