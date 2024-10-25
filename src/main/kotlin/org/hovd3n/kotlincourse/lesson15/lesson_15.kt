package org.hovd3n.kotlincourse.lesson15

//
// ООП - объектно-ориентированное программирование
// класс в ООП - шаблон или чертеж, который описывает какие данные будет хранить объект
// и какие методы (это класс) будет использовать
// объект - это экземпляр класса, когда класс определен, ни один из его методов или переменных не используется
// пока не определен объект этого класса
// каждый объект уникален, но обладает всеми характеристиками этого класса
// класс состоит из всего двух сущностей - полей (переменные, данные, состояния) и действий (функции, методы)
//


fun main() {
    val person = Person("John", 30)
    person.sayHello()
    println(person)

    //Logger.setData(5)
    Logger.log("fgf")

    val result = Calculator.add(1,4)

    var lamp1 = Lamp (true)
    lamp1.switch()

    val wind = Wind(15)
    println(wind.speedConverter())

    val car = Car(Car.carBrands[2], model = "GLS 600" )
    car.sayNameOfCar()

}
    // Поля класса
class Person(
        val name: String, // поля класса, а в функции бы это называлось аргумент
        var age: Int // либо это аргументы конструктора класса, либо просто поля класса
) {
    private var isAlive = true // это непубличные поля, которые не передаются "публично"

    // Метод класса
    fun sayHello() {
        println("Hello, my name is $name and I am $age years old.")
    }
}