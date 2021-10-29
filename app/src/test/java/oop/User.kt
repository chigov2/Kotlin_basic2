package oop

class User {
    var name: String? = null
    get() {
        return if (field == null)
        {
            ""
        }else field
    }

    var age: Int = 0
    set(value) {
        if (value >= 0)  field = value

    }

//    fun setAge(age: Int){
//        this.age = age
//    }
//    fun getAge() = age
//
//    fun setName(name: String){
//        this.name = name
//    }
//    fun getName() = name
}

