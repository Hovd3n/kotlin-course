package org.hovd3n.kotlincourse.lesson7

//создание циклов

fun main() {
    for (item in 1..10) {  // или можно писать i вместо item, это переменная
        println(item)// тело цикла
    }
    val e = 2
    for (i in 1..10) {
        println(i * e)
    }

    for (i in 1..10 step 5) {
        println(i * e)
    }

    for (i in 1 until 5) {
        println(i)
    }

    val range = 1..5
    for (i in range) {
        println(i)
    }

//    var counter = 10
//    while (counter-- > 0) {          // Это цикл "пока что"
//        println(counter)
//    }

    do {
        println("+")
    } while (false)         // позволяет сократить код

    while (false) {      // тело цикла
    }

    for (i in 1..10) {
        if (i == 2) continue // это оператор продолжения
        if (i == 7) break // это оператор прерывания
        println(i)
    }

    for (i in 1..10) {
        println(i)
    }

    for (i in 1..5) {
        println(i*i)
    }

    for (i in 10 downTo 1) {
        println(i)
    }

    for (i in 20 downTo 2) {
        if(i % 2 == 0) { // проверка на четное число
        println(i)
        }
    }

    for (i in 1..30 step 3) {
        println(i)
    }

    var count = 1
    var sum = 0
    while (count <= 10) {
        sum = sum + count++
    }
    println(sum)

    var counter = 100
    while (counter > 1)
        println(counter--.toString().length)
}