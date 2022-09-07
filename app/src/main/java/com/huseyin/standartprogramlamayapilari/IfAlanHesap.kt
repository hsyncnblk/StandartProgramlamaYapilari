package com.huseyin.standartprogramlamayapilari

import java.util.*

fun main(){

    val girdi = Scanner(System.`in`)
    println("dikdörtgen alanı(1)")
    println("çember alanı(2)")

    val secim = girdi.nextInt()

    println("seçiminiz: $secim")

    if (secim==1){
        println("kısa kenarı gir:")
        val kisa = girdi.nextInt()

        println("uzun kenarı gir:")
        val uzun = girdi.nextInt()

        val dAlan = kisa*uzun

        println("dikdörtgenin alanı: $dAlan")

    }else if (secim==2){

        println("çemberin yarıçapını gir")
        val yariçap=girdi.nextInt()

        val cAlan = 3.14 * yariçap * yariçap

        println("çemberin alanı: $cAlan ")


    }else{

        println("hatalı seçim")
    }


}