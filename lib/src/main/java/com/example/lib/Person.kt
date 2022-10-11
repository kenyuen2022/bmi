package com.example.lib

fun main(){
    val p = Person()
    p.weight = 65f
    p.height = 1.7f
    println("You bmi is ${p.getBMI()}")

}



class Person {
    var weight: Float = 0f
    var height: Float = 0f

    fun getBMI(): Float{
        val bmi = weight / (height * height)
        return bmi
    }
}