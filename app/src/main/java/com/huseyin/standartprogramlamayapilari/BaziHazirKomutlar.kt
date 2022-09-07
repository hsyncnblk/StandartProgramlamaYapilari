package com.huseyin.standartprogramlamayapilari

import kotlin.math.*
import kotlin.random.Random

fun main(){



    for (i in 0..10){

        val rastgeleSayi = Random.nextInt(0,10) // 0 la 9 arasında
        println(rastgeleSayi)
    }

    val c = ceil(6.5) // yukarı yuvarlar
    println("c: $c")

    val f = floor(6.5) // asağı yuvarlar
    println("f: $f")

    val s = sqrt(4.0) // karekök alır
    println("s: $s")

    val a = abs(-10) // mutlak değer
    println("a: $a")

    val p = 2.0.pow(3.0) // üslü sayı
    println("p: $p")



}