package oop

import java.util.*

class Dog {
    var name: String = ""
        get() {
            return field.lowercase(Locale.getDefault())
                .replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
        }
    var age: Int = 0
        set(value) {
            if (value >= 0) field = value
        }

    var weight: Float = 0f
        set(weight) {
            if (weight >= 0) field = weight
        }
    fun printInfo(data:Map<String, List<Int>>){

    }

}