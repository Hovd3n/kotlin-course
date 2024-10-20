package org.hovd3n.kotlincourse.lesson12

//Напиши валидную сигнатура метода
//Напишите сигнатуру функции, которая не принимает аргументов и не возвращает значения.
fun noFun(){}

//Напишите сигнатуру функции, которая принимает два целых числа и возвращает их сумму.
fun noFun2(number1: Int, number2: Int): Int{
    return number1 + number2
}

//Напишите сигнатуру функции, которая принимает строку и ничего не возвращает.
fun noFun3(line: String){}

//Напишите сигнатуру функции, которая принимает список целых чисел и возвращает среднее значение типа Double.
fun noFun4(l: List<Int>): Double {
    return l.average()
}

//Напишите сигнатуру функции, которая принимает nullable строку и возвращает её длину в виде nullable целого числа.
fun noFun5(l2: String?): Int? {
    return l2?.length
}

//Напишите сигнатуру функции, которая не принимает аргументов и возвращает nullable вещественное число.
fun noFun6(): Float? {
    return null
}

//Напишите сигнатуру функции, которая принимает nullable список целых чисел и не возвращает значения.
fun noFun7(l3: List<Int>?){}

//Напишите сигнатуру функции, которая принимает целое число и возвращает nullable строку.
fun noFun8(l: Int): String? {
    return l.toString()
}

//Напишите сигнатуру функции, которая не принимает аргументов и возвращает список nullable строк.
fun noFun9(): List<String?> {
    return listOf(null, null)
}

//Напишите сигнатуру функции, которая принимает nullable строку
// и nullable целое число и возвращает nullable булево значение.
fun noFun10(a: String?, b: Int?): Boolean? {
    return true
}

fun main(){
    println("Задача 1")
    println(multiplyByTwo(10))
    println("")
    println("Задача 2")
    println(isEven(5))
    println(isEven(10))
    println("")
    println("Задача 3")
    printNumbersUntil(3)
    println("")
    println("Задача 4")
    findFirstNegative(listOf(3, 5, 7, 29, -10, 5, 8))
    println("")
    println("Задача 5")
    processList(listOf("line 1", "line 5", "line 123"))
    println("")
    println("Задача Рефакторинг")
    drawRectangle(5,5)

}
//Напиши рабочий код для следующих задач:
//Задача 1:
//Напишите функцию multiplyByTwo, которая принимает целое число и возвращает его, умноженное на 2.
fun multiplyByTwo(a: Int): Int {
    return a*2
}

//Задача 2:
//Создайте функцию isEven, которая принимает целое число и возвращает true,
// если число чётное, и false в противном случае.
fun isEven(a: Int): Boolean {
    if (a % 2 == 0) return true
    else return false
}

//Задача 3:
//Напишите функцию printNumbersUntil, которая принимает целое число n
// и выводит на экран числа от 1 до n. Если число n меньше 1,
// функция должна прекратить выполнение с помощью return без вывода сообщений.
fun printNumbersUntil(n: Int) {
    if (n < 1) {
        return
    }
    for (i in 1..n){
        println(i)
    }
}

//Задача 4:
//Создайте функцию findFirstNegative, которая принимает список целых чисел
// и возвращает первое отрицательное число в списке.
// Если отрицательных чисел нет, функция должна вернуть null.
fun findFirstNegative(a: List<Int>): Int? {
    for (i in a) {
        if (i < 0) println(i)
    }
    return null
}

//Задача 5:
//Напишите функцию processList, которая принимает список строк.
// Функция должна проходить по списку и выводить каждую строку.
// Если встречается null значение, функция должна прекратить выполнение с помощью return без возврата значения.
fun processList(someList: List<String>) {
        for (i in someList) {
            if (i != null)
        println(i)
    }
    return
}

//Сделай рефакторинг функции, через определение вспомогательных приватных функций.
// Требуется избавиться от дублирования кода и трудно воспринимаемых фрагментов.
//Сначала сделай запуск функции и посмотри на результат её работы.
// Сделай запуск после рефакторинга и проверь, чтобы результат работы был аналогичным.

private fun checkSize(wh: Int, result: String) {
    if (wh <= 0) throw IllegalArgumentException("$result должно быть положительным и больше нуля")
}



fun drawRectangle(width: Int, height: Int) {
    checkSize(width, "width")
    checkSize(height, "height")

    // Верхняя граница
    var topLine = "+"
    for (i in 1 until width - 1) {
        topLine += "-"
    }
    topLine += "+\n"
    print(topLine)

    // Боковые границы
    for (i in 1 until height - 1) {
        var middleLine = "|"
        for (j in 1 until width - 1) {
            middleLine += " "
        }
        middleLine += "|\n"
        print(middleLine)
    }

    // Нижняя граница
    var bottomLine = "+"
    for (i in 1 until width - 1) {
        bottomLine += "-"
    }
    bottomLine += "+\n"
    print(bottomLine)
}