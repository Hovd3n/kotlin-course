package org.hovd3n.kotlincourse.lesson10

//Работа с Множествами Set
fun main() {

//Задание 1: Создание Пустого Множества
//Создайте пустое неизменяемое множество целых чисел.
    val set = setOf<Int>()

//Задание 2: Создание и Инициализация Множества
//Создайте неизменяемое множество целых чисел, содержащее три различных элемента (например, 1, 2, 3).
    val set1 = setOf(1, 2, 3)

//Задание 3: Создание Изменяемого Множества
//Создайте изменяемое множество строк и инициализируйте его несколькими значениями (например, "Kotlin", "Java", "Scala").
    val set2 = mutableSetOf("Kotlin", "Java", "Scala")

//Задание 4: Добавление Элементов в Множество
//Имея изменяемое множество строк, добавьте в него новые элементы (например, "Swift", "Go").
    val set3 = mutableSetOf<String>()
    set3.add("Swift")
    set3.add("Go")
    println(set3)

//Задание 5: Удаление Элементов из Множества
//Имея изменяемое множество целых чисел, удалите из него определенный элемент (например, 2).
    val set4 = mutableSetOf(2, 4, 6, 8, 10)
    set4.remove(2)
    println(set4)

//Задание 6: Перебор Множества в Цикле
//Создайте множество целых чисел и используйте цикл для вывода каждого элемента на экран.
    val set5 = mutableSetOf(5, 10, 15, 20, 25)
    for (i in set5)
        println(i)

//Задание 7 НИЖЕ, потому что через отдельную функцию

//Задание 8: Объединение Двух Множеств
//Создайте два множества строк и объедините их в одно новое множество, содержащее все уникальные элементы обоих множеств.
// Реши задачу с помощью циклов.
    val set7 = setOf("hello", "hi", "privet")
    val set8 = setOf("buenos dias", "gamarjoba", "hi")
    var set9 = mutableSetOf<String>()
    for (i in set7){
        set9.add(i)
    }
    for (i in set8){
        set9.add(i)
    }
    println(set9)

//Задание 9: Нахождение Пересечения Множеств
//Создайте два множества целых чисел и найдите их пересечение (общие элементы). Реши задачу через вложенные циклы.
    val set10 = setOf(5, 10, 15, 20, 25)
    val set11 = setOf(6, 11, 15, 21, 25)
    val set12 = mutableSetOf<Int>()
    for (i in set10) {
        if (set11.contains(i)){
            set12.add(i)}
        }
    println(set12)

//Задание 10: Нахождение Разности Множеств
//Создайте два множества строк и найдите разность первого множества относительно второго
// (элементы, присутствующие в первом множестве, но отсутствующие во втором).
// Реши задачу через вложенные циклы и переменные флаги.


//Задание 11: Конвертация Множества в Список
//Создайте множество строк и конвертируйте его в список с использованием цикла.
    val set13 = setOf("very", "big", "homework")
    val list = mutableListOf<String>()
    for (i in set13){
        list.add(i)
    }
    println(list)


println(search(set6 = setOf("чему", "бы", "мне", "научиться", "сегодня", "лучше поспи"), "учи котлин"))
println(search(set6 = setOf("чему", "бы", "мне", "научиться", "сегодня", "лучше поспи"), "лучше поспи"))
}
//Задание 7: Проверка Наличия Элемента в Множестве
//Создай функцию, которая принимает множество строк (set) и строку и проверяет, есть ли в множестве указанная строка.
// Нужно вернуть булево значение true если строка есть. Реши задачу через цикл.

fun search(set6: Set<String>, searchline: String):Boolean {
    for (i in set6) {
        if (i.contains(searchline)){
            return true
        }
    }
    return false
}



