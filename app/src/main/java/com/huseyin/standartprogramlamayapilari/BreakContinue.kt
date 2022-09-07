package com.huseyin.standartprogramlamayapilari

fun main(){

    for (i in 1..5){
        if (i==3){
            break

        }

        println(i)
    }

    println("-------")

    for (a in 1..5){
        if (a==3){
            continue
        }

        println(a)
    }


}