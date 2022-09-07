package com.huseyin.standartprogramlamayapilari

import java.util.*

fun main(){

    val dersler = Array<String>(5){""}
    val notlar = Array<Int>(5){0}

    val girdi = Scanner(System.`in`)

    for ( i in 0 until dersler.count()){

        println("${i+1}. dersi giriniz")
        val ders = girdi.next()
        dersler[i]= ders

        println("${i+1}. notu giriniz")
        val not = girdi.nextInt()
        notlar[i]= not
    }

    var toplam = 0

    for (i in 0 until notlar.count()){

        println("${dersler[i]} : ${notlar[i]}")

        toplam += notlar[i]

    }

    val ortalama = toplam / notlar.count()

    println("ortalama: $ortalama")

    if (ortalama>=50){
        println("geçti")
    }else{
        println("kaldı")
    }





}