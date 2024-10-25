package org.hovd3n.kotlincourse.lesson15

class Car(
    val brand: String,
    var model: String
) {
    companion object{
        val carBrands = listOf("Mazda", "BMW", "Mersedes")
    }

    fun sayNameOfCar(){
        println("Я - автомобиль производства $brand модель $model")
    }
}