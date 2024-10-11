package org.hovd3n.kotlincourse.lesson11

//Словари = мапы = массив ключ-значения

fun main() {


    val pair: Pair<Int, String> = 1 to "a" // 1 - ключ, а - значение
    val pair2 = Pair(2, "a") // тоже самое

    println(pair.first)
    println(pair.second)

    val emptyMap: Map<String, String> = mapOf()

    val capitals = mapOf("Russia" to "Moscow", "France" to "Paris")

    val mutableCapitals = mutableMapOf("Россия" to "Москва", "Франция" to "Париж")


// Доступ к элементам словаря
    val capitalOfRussia = capitals["Россия"] // словари позволяют использовать
    // произвольные объекты в качестве ключа

    println(capitalOfRussia)

    mutableCapitals["Германия"] = "Берлин"
    mutableCapitals.remove("Франция")

    for (entries in mutableCapitals) {
        println("${entries.key}: ${entries.value}")
    }

    for ((country, capital) in capitals) {
        println("$country: $capital")
    }

    val mapWithNullableKey = mutableMapOf<String?, Int>(null to 1) // ключ уникален, поэтому налэбл будет только в единственном количестве

    val pair3 = mapOf("hey" to 3, "hi" to 2, "hello" to 5)
    val pair4 = mapOf(3 to "hey", 2 to "hi", 5 to "hello")
    val pair5 = mutableMapOf(3 to "hey", 2 to "hi", 5 to "hello")
        pair5[9] = "gamarjoba"
    println(pair5[9])
    println(pair5[4])       // если у мапы нет нужного нам ключа, то возвращается null
    pair5.remove(555)

    for (entry in pair4){
        println("${entry.key}: ${entry.value}")
    }

    println(" ")
    for ((key, value) in pair5){
        println("$key: $value")
    }

    println(" ")

    val myMap: Map<String, List<Int>> = mapOf("St" to listOf(1, 2, 4))

    println(" ")

    val daysAndWorkers = mapOf<String, List<String>>()
    val mapYear = mapOf<String, MutableMap<String, String>>()
    val mapThings = mapOf<String, MutableSet<String>>()


}

fun search(myMap2: Map<String, String>, word: String):String {
    for ((key, value) in myMap2) {
        if (value == word) return key
    }
    return "No key"
}