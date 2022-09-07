package com.huseyin.standartprogramlamayapilari

import java.util.*

fun main(){

    val girdi = Scanner(System.`in`)

    println("sil(1)\nekle(2)")

    val tercih = girdi.nextInt()

    when(tercih){
        1 -> println("veri silindi")
        2 -> println("veri eklendi")
        else -> println("hatalı seçim")
    }


}