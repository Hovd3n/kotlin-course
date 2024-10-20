package org.hovd3n.kotlincourse.lesson10

//Работа со списками List
fun main() {

//Задание 1: Создание Пустого Списка
//Создайте пустой неизменяемый список целых чисел.
    val list = listOf<Int>()

//Задание 2: Создание и Инициализация Списка
//Создайте неизменяемый список строк, содержащий три элемента (например, "Hello", "World", "Kotlin").
    val list2 = listOf("Hello", "World", "Kotlin")

//Задание 3: Создание Изменяемого Списка
//Создайте изменяемый список целых чисел и инициализируйте его значениями от 1 до 5.
    val mutableList = mutableListOf<Int>()
    mutableList.add(1)
    mutableList.add(2)
    mutableList.add(3)
    mutableList.add(4)
    mutableList.add(5)

    // либо просто
    val mutableList1 = mutableListOf(1, 2, 3, 4, 5)

//Задание 4: Добавление Элементов в Список
//Имея изменяемый список целых чисел, добавьте в него новые элементы (например, 6, 7, 8).
    mutableList1.add(6) // список взять из переменной выше
    mutableList1.add(7)
    mutableList1.add(8)
    println(mutableList1.toList())

//Задание 5: Удаление Элементов из Списка
//Имея изменяемый список строк, удалите из него определенный элемент (например, "World").
    val list3 = mutableListOf("Hello", "World", "Kotlin")
    list3.remove("World")
    println(list3)

//Задание 6: Перебор Списка в Цикле
//Создайте список целых чисел и используйте цикл для вывода каждого элемента на экран.
    val list4 = listOf(5, 10, 15, 20, 25)
    for (i in list4)
        println(i)

//Задание 7: Получение Элементов Списка по Индексу
//Создайте список строк и получите из него второй элемент, используя его индекс.
    val list5 = listOf("Hello", "World", "Kotlin")
    println(list5[1])

//Задание 8: Перезапись Элементов Списка по Индексу
//Имея изменяемый список чисел, измените значение элемента на определенной позиции
// (например, замените элемент на позиции 2 на новое значение).
    val list6 = mutableListOf(1, 2, 3, 4, 5)
    list6[1] = 10
    println(list6)

//Задание 9: Объединение Двух Списков
//Создайте два списка строк и объедините их в один новый список, содержащий элементы обоих списков.
// Реши задачу с помощью циклов.
    val list7 = listOf("I like", "to study", "kotlin")
    val list8 = listOf("and", "to play", "basketball")
    var list9 = mutableListOf<String>()
        for (i in list7) {
            list9.add(i)
        }
        for (i in list8) {
            list9.add(i)
        }
        println(list9)



}
//Задание 10: Нахождение Минимального/Максимального Элемента
//Создайте список целых чисел и найдите в нем минимальный и максимальный элементы используя цикл.

fun minAndMax() {


}




//Задание 11: Фильтрация Списка
//Имея список целых чисел, создайте новый список, содержащий только четные числа из исходного списка используя цикл.

