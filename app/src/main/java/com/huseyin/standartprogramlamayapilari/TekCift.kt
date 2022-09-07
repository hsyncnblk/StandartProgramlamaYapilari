package com.huseyin.standartprogramlamayapilari

import java.util.*

fun main(){

    while (true){
        val girdi = Scanner(System.`in`)
        println("Sayı giriniz")
        var sayi= girdi.nextInt()
        if (sayi%2==0){
            println("çift")
        }else{
            println("tek")
        }
        println("-------------")
        println("çıkmak için(1)-devam etmek için(2)")
        var deger = girdi.nextInt()
        when(deger){
            1 -> break
            2 -> continue
        }
    }
}