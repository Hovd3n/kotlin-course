package org.hovd3n.kotlincourse.lesson10

// КОЛЛЕКЦИИ
// 1. Массивы
// создается СРАЗУ определенного размера, увеличить или уменьшить нельзя, но можно поменять заполнители.

fun main() {
    val numbers: Array<Int> = arrayOf(1, 2, 3, 4, 5)

    val doubles: DoubleArray = doubleArrayOf(1.1, 2.2, 3.3)

    val emptyArray = Array(5) { "" } // класс типа Арэй, потом количество ячеек и потом указываем заполнитель
    val emptyNullableArray: Array<Int?> = arrayOfNulls<Int>(5)

    val readOnlyList: List<String> = listOf("a", "b", "c") // листОф - спец метод, который создает список, поменять нельзя

    val mutableList: MutableList<String> = mutableListOf("a", "b", "c") // мутаблЛистОф - создает изменяемый список

// 2. Множества
    val numbersSet: Set<Int> = setOf(1, 2, 3, 4, 5) // все элементы множества будут УНИКАЛЬНЫ

    val mutableNumbersSet: Set<Int> = mutableSetOf(1, 2, 3, 4, 5)

// 3. Индексы
    val set = setOf("k", "o", "t", "l", "i", "n")

    for (letter in set) {
        println("| $letter |")
    }

    val list = listOf(32, 53, 1, -76)
    for (index in list.indices) {
        if (index == list.lastIndex) {
            println(list[index] + list[0])
        } else {
            println(list[index] + list[index + 1])
        }
    }
    var index = list.lastIndex
    while (index >= 0) {
        println("`${list[index--]}`")
    }

// классная работа
    val numbers1 = Array(0) { 0 }

    val doubles1 = doubleArrayOf(1.0, 2.0, 3.0, 4.0, 5.0)

    val array1 = Array(10) { 0 }
    for (i in array1.indices) {
        array1[i] = (i + 1) * 10
    }
    println(array1.toList())


    val array2 = arrayOf("dsadsa", "asdsad", "asdsa", "asdasf", "asqwe")
    for (i in array2.indices) {
        array2[i] = " "
    }
    println(array2.toList())


    val array3 = arrayOf(1, 4, 7)
    val array4 = arrayOf(2, 5, 8)
    val array5 = Array(3) { 0 }
    for (i in array5.indices) {
        array5[i] = array3[i] + array4[i]
    }
    println(array5.toList())


    // тут надо было создать пустой неизменяемый список
    val list1 = listOf<Int>()

    // тут надо было создать неизменяемый список из 3 значений
    val list2 = listOf ("Hello", "my", "world")
    for (i in list2) {
        println(i)
    }


    val mutableList2 = mutableListOf<Float> ()
    mutableList2.add(4f)
    mutableList2.add(69f)
    mutableList2.remove(4f)
    mutableList2.removeAt(0)
    println(mutableList2)


    val numberSet1: Set<Int> = setOf()
    val numberSet2 = setOf(1, 2, 3, 4, 5)
    val mutableSet1 = mutableSetOf(1, 2, 3)
    mutableSet1.add(6)
    mutableSet1.remove(2)
    println(mutableSet1)
    for (i in mutableSet1) {
        println(i*i)
    }


    val set3 = setOf(1, 2, 3)
    val set4 = setOf(3, 6, 9, 12)
    var sumSet = mutableSetOf<Int>()
        for (i in set3) {
        sumSet.add(i)
    }
        for (i in set4) {
        sumSet.add(i)
    }
        println(sumSet)
        sumSet = mutableSetOf(1)
    println(sumSet)
}

// тут задание было найти какое-то число в множестве и вывод есть или нет
fun findNumber(setNum1: Set<Int>, num: Int): Boolean {
    for (i in setNum1) {
        if (i == num){
            return true
        }
    }
    return false
}