package com.example.kotlinbasics

fun main(){
    var computerChoice= ""
    var myChoice= ""
    println("enter your choice: Rock, paper, Scissors? ")
    myChoice= readln()
    while(myChoice != "Rock" && myChoice!= "Paper" && myChoice != "Scissor" ){
        println("enter the correct Choice")
        myChoice= readln()
    }

    val randomNumber =(1..3).random()



//    if (randomNumber==1){
//        computerChoice="Rock"
//    }else if(randomNumber==2){
//        computerChoice="Paper"
//    }else if(randomNumber==3){
//        computerChoice="Scissors"
//    }


    when (randomNumber) {
        1 -> {
            computerChoice="Rock"
        }
        2 -> {
            computerChoice="Paper"
        }
        3 -> {
            computerChoice="Scissors"
        }
    }

    println(computerChoice)
val winner= when {
    myChoice == computerChoice -> "Tie"
    myChoice == "Rock" && computerChoice == "Scissors" -> "Player"
    myChoice == "Paper" && computerChoice == "Rock" -> "Player"
    myChoice == "Scissors" && computerChoice == "Paper" -> "Player"
    else -> "Computer"
}
//
//    if(winner=="Tie"){
//        println("Tie")
//    }else if(winner=="Player"){
//        println("congrats you won")
//    }else {
//        print("you lost")
//    }

    when (winner) {
        "Tie" -> {
            println("Tie")
        }
        else -> {
            print("$winner won!")
        }
    }
}
 fun result(num1:Int,num2:Int):Int{
     return num1+num2
 }