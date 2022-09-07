package com.huseyin.standartprogramlamayapilari

import java.util.*

fun main(){

    val girdi = Scanner(System.`in`)

    val isimler = Array<String>(5){""}

    for (i in 0 until isimler.count()){

        println("${i+1}. ismi giriniz")
        val isim = girdi.next()
        isimler[i]=isim

    }

    for ((indeks,isim) in isimler.withIndex()){
        println("${indeks+1}. isim : $isim")
    }

    println(isimler.contentToString())

}