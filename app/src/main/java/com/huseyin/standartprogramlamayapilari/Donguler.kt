package com.huseyin.standartprogramlamayapilari

import java.util.*

fun main(){

    for (i in 3..5){ // 3 4 5
        println(i)
    }

    var baslangic= 10
    var bitis= 20
    var artis= 2

    for (a in baslangic..bitis step artis){
        println("sayı: $a")
    }

    for (b in 20 downTo 10 step 5){
        println(b)
    }

    for (c in 5 until 10){
        println(c)
    }

    var sayac=1

    while(sayac<5){
        println("hello world")
        sayac +=1
    }

    var girdi =Scanner(System.`in`)
    print("ismini gir:")
    var name = girdi.next()

    print("yaşını gir:")
    var age= girdi.nextInt()

    var total=0

    while (total<age){
        println("happy birthday $name")
        total +=1
    }




}