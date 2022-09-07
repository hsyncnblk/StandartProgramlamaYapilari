package com.huseyin.standartprogramlamayapilari

import java.util.*

fun main(){

    val girdi = Scanner(System.`in`)

    println("kaç tekrar yapılacak")
    var tekrar = girdi.nextInt()

    while (tekrar>0){

        println("$tekrar. veri")
        tekrar -=1

    }


}