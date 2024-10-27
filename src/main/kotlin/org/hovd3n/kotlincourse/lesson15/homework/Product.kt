package org.hovd3n.kotlincourse.lesson15.homework

class Product (
    val name: String,
    var price: Double,
    var count: Int
) {
    fun storeProduct(){
        println("В магазине продается $name по цене равной $price рублей, в данный момент есть в количестве $count штук")
    }
}