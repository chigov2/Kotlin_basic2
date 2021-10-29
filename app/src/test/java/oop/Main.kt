package oop

fun main()
{
    val data = mapOf(
        "123" to listOf(10,50)
    )
    val user = User()
    user.name = "Mikee"
    user.age = (45)
    println(user.name + " " + user.age)

    val dog = Dog()
    dog.name = "er"
    dog.age = -15
    dog.weight = 20f
    println(dog.name + " " + dog.age + " " + dog.weight)
}