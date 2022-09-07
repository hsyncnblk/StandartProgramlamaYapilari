package com.huseyin.standartprogramlamayapilari

fun main(){

    val meyveler = arrayOf<String>("çilek","muz","elma","kivi","kiraz")

    for (meyve in meyveler){
        println("sonuç: $meyve")
    }

    println("\n")

    for ((indeks,meyve) in meyveler.withIndex()){
        println("sonuç $indeks : $meyve")
    }


}