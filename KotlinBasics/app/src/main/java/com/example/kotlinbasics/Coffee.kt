package com.example.kotlinbasics
data class CoffeeDetails(
    val sugarCount:Int,
    val name:String,
    val size:String,
    val creamAmount:Int
)

fun main(){
val coffeeForDenis=CoffeeDetails(0,"denis","xxl",0)
makeCoffee(coffeeForDenis)
}
fun makeCoffee(coffeeDetails: CoffeeDetails){
    println("coffee with ${coffeeDetails.sugarCount} spoon of sugar for ${coffeeDetails.name} having ${coffeeDetails.size} size with ${coffeeDetails.creamAmount} amount of cream")
}
