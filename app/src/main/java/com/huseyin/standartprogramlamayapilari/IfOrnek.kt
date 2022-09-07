package com.huseyin.standartprogramlamayapilari

import java.util.*

fun main(){

    val girdi =Scanner(System.`in`)
    println("toplama(1)\nçıkarma(2)\nçarpma(3)\nbölme(4)")

    val secim = girdi.nextInt()
    println("seçimin: $secim")


    if (secim==1){
        println("ilk sayıyı gir:")
        val s1 = girdi.nextInt()

        println("ikinci sayıyı gir:")
        val s2 = girdi.nextInt()

        val toplam = s1+s2

        println("sonuç: $toplam")
    }
    if (secim==2){
        println("ilk sayıyı gir:")
        val y1 = girdi.nextInt()

        println("ikinci sayıyı gir:")
        val y2 = girdi.nextInt()

        val cikarma = y1-y2

        println("sonuç: $cikarma")
    }
    if (secim==3){
        println("ilk sayıyı gir:")
        val c1 = girdi.nextInt()

        println("ikinci sayıyı gir:")
        val c2 = girdi.nextInt()

        val carpma = c1*c2

        println("sonuç: $carpma")
    }
    if (secim==4){
        println("ilk sayıyı gir:")
        val b1 = girdi.nextInt()

        println("ikinci sayıyı gir:")
        val b2 = girdi.nextInt()

        val bolme = b1/b2

        println("sonuç: $bolme")
    }



}