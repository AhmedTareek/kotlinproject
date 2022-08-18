package oop

import kotlin.math.max

  abstract class Car(var model:String,var color:String ,speed_in:Int =1){
    var speed = speed_in
      set(value) {
          if(value < 0 )
              field = -value
          field = value
      }
    abstract fun getFuelType()
}
class BMW(model: String = "BMW",color: String) : Car(model,color){
    override fun getFuelType() {
        println("oil fuel")
    }

}
class Tesla(model: String = "Tesla",color: String) : Car(model,color){
    override fun getFuelType() {
        println("No fuel needed")
    }
}
fun main(){
    val tesla = Tesla(color = "Black")
    val bmw =  BMW(color = "Blue")
    bmw.getFuelType()
    tesla.getFuelType()
}