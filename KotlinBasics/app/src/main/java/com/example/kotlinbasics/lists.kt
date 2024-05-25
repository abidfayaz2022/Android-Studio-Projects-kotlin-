package com.example.kotlinbasics
fun main() {
    val shoppingList = mutableListOf("Ram", "rtx", "gtx")
    println(shoppingList.contains("Ram"))
   for (i in shoppingList) {
       if (i == "Ram") {
           continue
       }
       println(i)
   }
}