package com.example.kotlin_basic.string_basic

import com.example.kotlin_basic.R
import java.util.*

fun main(){

//    val age = 7
//    val name = ""
//
//    if (age.isAgeValid())
//    {
//        println("Valid")
//    }
//    println(age.isPositive())
//    println(10.isPrime())

    val list = listOf<Int>()
    val string = "rtrtrterr"
    val obj1 = mutableMapOf<String, String>()

    //with(list){
    myWith(obj1){
        //string this nothing
        //println(this.uppercase(Locale.getDefault()))
        keys
        values
    //sum()
    //average()
    }
}
                            //не передаются параметры и ничего не возвращается
                            //расширяет класс List
//fun myWith(list:List<Int>, operation:List<Int>.() -> Unit)
//{
//    list.operation()
//}
//fun myWith(string:String, operation:String.() -> Unit)
//{
//    string.operation()
//}


inline fun<T, R> myWith(obj: T, operation:T.() -> R):R
{
    return obj.operation()
}



fun Int.isAgeValid() = this in 6..100

fun Int.isPositive() = this >= 0

fun Int.isPrime():Boolean {
    if (this <=3) return true
    for (i in 2 until this-1)
        if (this % 2 == 0) return false
    return true
}