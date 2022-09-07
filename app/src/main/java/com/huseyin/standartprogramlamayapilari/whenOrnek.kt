package com.huseyin.standartprogramlamayapilari

import java.util.*

fun main(){
    val girdi = Scanner(System.`in`)

    println("toplama(1)\nçıkarma(2)\nçarpma(3)\nbölme(4)")

    val secim = girdi.nextInt()
    println("seçimin: $secim")

    println("ilk sayıyı gir:")
    val s1 = girdi.nextInt()

    println("ikinci sayıyı gir:")
    val s2 = girdi.nextInt()

    when(secim){
        1 -> println("sonuç= ${s1+s2}")
        2 -> println("sonuç= ${s1-s2}")
        3 -> println("sonuç= ${s1*s2}")
        4 -> println("sonuç= ${s1/s2}")
        else -> println("hatalı seçim")

    }

}