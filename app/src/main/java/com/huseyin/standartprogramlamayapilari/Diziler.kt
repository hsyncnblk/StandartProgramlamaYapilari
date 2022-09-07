package com.huseyin.standartprogramlamayapilari

fun main(){

    val dizi =Array<Int>(5){0} // 0,0,0,0,0

    val dizi2 = arrayOf(0,1,2)

    val dizi3 = arrayOf<Int>(1,2,3)

    val dizi4 = arrayOf<String>("cilek","elma","armut")

    val dizi5 = arrayOf(3,8,"elma","erik")

    val meyveler = arrayOf<String>("çilek","muz","elma","kivi","kiraz")

    //veriye erişim

    val str1 = meyveler[2]

    println(str1)

    val str2 = meyveler.get(3)

    println(str2)

    //veri güncelleme

    meyveler[1]="muzlar"

    println(meyveler.contentToString())

    meyveler.set(2,"elmalar")

    println(meyveler.contentToString())

    //array işlemler

    println(meyveler.isEmpty())
    //boş mu

    println(meyveler.count())
    //kaç değer var

    println(meyveler.first())

    println(meyveler.last())

    println(meyveler.indexOf("kivi"))
    //girdiğin değer kaçıncı index de

    println(meyveler.contains("kiraz"))
    //girdiğn değer diziler içinde varmı yokmu

    println(meyveler.sort())
    //sıralama yapar

    println(meyveler.contentToString())

    println(meyveler.reverse())
    //içeriği terse cevir

    println(meyveler.contentToString())

}