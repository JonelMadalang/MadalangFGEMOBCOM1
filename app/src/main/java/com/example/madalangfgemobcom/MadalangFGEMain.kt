package com.example.madalangfgemobcom

fun main(){


    var result=0.0

    println("Enter Number: ")
    result = readLine()!!.toDouble()

    println("Enter Operator: ")
    var  operator = readLine()




    do{

        println("Enter Next Number: ")
        var num = readLine()!!.toDouble()

        when (operator) {
            "+" -> {
                result += num
            }
            "-" -> {
                result -= num
            }
            "*" -> {
                result *= num
            }
            "/" -> {
                if (num===0.0){
                    println("zero division isn't allowed")
                    break
                }
                else{
                    result /= num
                }

            }

        }

        println("Enter Operator: ")
           operator = readLine()





    }while(operator!="=")

    println(result)
}


