package com.huseyin.standartprogramlamayapilari

fun main(){

    for (i in 3..6){
        println(i)
    }

    var sayac = 3

    while (sayac<7){
        println(sayac)
        sayac +=1
    }
    println("-------------")

    // 0-8  2şer artış

    for (b in 0..8 step 2){
        println(b)
    }
    var toplam=0

    while (toplam<9){
        println(toplam)
        toplam = toplam + 2
    }
}