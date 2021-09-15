package com.example.madalangfgemobcom

fun main() {
    println("Enter First Value: ")
    var num1 = readLine()!!.toDouble()

    println("Enter Operator (+,-,*,/,=) : ")
    var operator = readLine()


    println("Enter Next Value: ")
    var num2 = readLine()!!.toDouble()

    var result=0.0;

    val equals = "="

    when (operator) {
        "+" -> {
        result=num1+num2

        }
        "-" -> {
            result=num1-num2
        }
        "*" -> {
            result=num1*num2
        }
        "/" -> {
            result=num1/num2
        }
        else-> println("Invalid Operator")
        }




    do{
        println("Enter Operator: ")
        var operator=readLine()




        println("Enter Next Value: ")
        var num=readLine()!!.toDouble()



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
                result /= num
            }
            "=" -> {
                println(result)
            }
        }

    }while(operator!=equals)

    println("Result of Computation: $result")
    }


