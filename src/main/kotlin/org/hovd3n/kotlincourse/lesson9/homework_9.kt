package org.hovd3n.kotlincourse.lesson9


// я думал это необязательное дз, времени было мало на той неделе.

fun main() {
    println(happybd(30, "Саша"))
}
    fun happybd(age: Int, name: String): Any {
        val basicCongratulations = "Дорогой $name! С Днем Рождения! Тебе сегодня $age лет,"
        if (age >= 40)
            return basicCongratulations + "ты не такой уж старый. Зато опытный и мудрый ;-) Счастья и здоровья!"
        else return basicCongratulations + "ты еще совсем молод, но добился так много. Например, создал секту любителей Котлин ;-) Приключений и веселья!"
    }