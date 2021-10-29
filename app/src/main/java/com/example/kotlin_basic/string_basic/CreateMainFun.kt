package com.example.kotlin_basic.string_basic

import java.util.*

fun res()
{
    println("hello")
    val result = modifyString("hello2") { it.uppercase(Locale.getDefault()) }
    println(result)

}
//функция будет принмать строку и возвращать модифицированную строку
// modify будет принимать строку (modify:(String)) и возвращать модифицированную строку  ->String
                                //: - тип
fun modifyString(str: String, modify:(String)-> String): String{
    return modify(str)

}

fun main ()
{
    val list = (0..20).toList()
    listModify(list) {
        println(it.sum())
    }
    //println(list.sum())

}

inline fun listModify(list :List<Int>, operator:(List<Int>)-> Unit)
{
    operator(list)
}