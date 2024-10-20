package org.hovd3n.kotlincourse.lesson13

// КОЛЛЕКЦИИ. Методы

fun main(){

    val list = listOf(8, 56, 23, 87, 12, 18, 11)
    val filtered1 = myCustomFilter(list)
    println(filtered1)

    val filtered2 = list.filter { it in 7..17 }
    println(filtered2)

    val numbers = listOf(-1, 2, -3, 4, -5)
    val positiveNumbers = numbers.filter { it > 0 }
    println(positiveNumbers)

    val notPositiveNumbers = numbers.filterNot { it > 0 } //
    println(notPositiveNumbers)


    // получение элементов коллекции
    val nullableList = listOf(1, null, 2, null, 3)
    val nonNullList = nullableList.filterNotNull()
    println(nonNullList)

    val firstPositive = numbers.firstOrNull { it > 0 } // комплексная функция: фильтрует весь список, оставляя только
    //положительные значения, и вернет только первое положительное значение либо если таких нет, то вернет налл
    println(firstPositive)

    val elementOrElse = numbers.getOrElse(10) { -1 }
    println(elementOrElse)

    // преобразование коллекций
    val incrementedNumbers: List<String> = numbers.map { "$it%" } // преобразует в мапу
    println(incrementedNumbers)

    val numberSquareMap = numbers.associate { it to it * it } // преобразовании коллекции в словарь, где есть ключ и значение
    println(numberSquareMap)

    val multipleList = listOf(
        listOf(1, 2, 3),
        listOf(4, 5, 6)
    )
    println(multipleList)
    val flattenList = multipleList.flatten() // этот метод берет вложенные списки из списка и условно "склеивает"
    println(flattenList)

    val flattenListAfterMapping = multipleList.flatMap { list1: List<Int> ->  // этот метод ТОЖЕ берет вложенные списки из списка и условно "склеивает"
        list1.map { it * 2 }
    }
    println(flattenListAfterMapping)

    val numbersString = numbers.joinToString(separator = ", ") // склеивание элементов списка в одну строку
    println(numbersString)

    val sortedNumbers = numbers.sorted()
    println(sortedNumbers)

    val sortedDescendingNumbers = numbers.sortedDescending()
    println(sortedDescendingNumbers)

    numbers.forEach {
        println(it)
    }

    val sumOfNumbers = numbers.sum() // сумма из числовых списков одного типа
    println(sumOfNumbers)

    val averageOfNumbers = numbers.average() // сумма и разделит на количество значений, посчитает среднее значение
    println(averageOfNumbers)

    val maxNumber = numbers.maxOrNull() // вернет максимальное значение либо налл
    println(maxNumber)

    val minNumber = numbers.minOrNull() // вернет минимальное значение либо налл
    println(minNumber)

    val groupedBySign = numbers.groupBy { if (it > 0) "Positive" else "Negative" } // группирует разные элементы на мапы
                                                                            // в зависимости от указанных условий
    println(groupedBySign)

    val distinctNumbers = listOf(1, 2, 2, 3, 3, 3, 4).distinct() // возвращает уникальные значения из списка
    println(distinctNumbers)

    println(numbers.take(3))    // возьмет несколько указанных элементов списка

    println(numbers.takeLast(3)) // возьмет несколько последних указанных элементов списка

    println(numbers.size) // вернет количество элементов списка



    // КЛАССНАЯ РАБОТА
    val someNumbers = listOf(1, -1, 3, -5)
        if (someNumbers.size < 5) {
            println("ok")
        }
    someNumbers.isEmpty() // вернет тру, если там список пуст
    someNumbers.isNotEmpty() // вернет тру, если в списке есть хотя бы одно значение

    val defaultValue = someNumbers.getOrElse(8) { 0 }
    println(defaultValue)

    val somePeopleAges = listOf(17, 18, 29, 35)
    println(somePeopleAges.filter { it in 18..30 })
}

fun myCustomFilter(collection: List<Int>): List<Int> {
    val result = mutableListOf<Int>()
    for (i in collection) {
        if (i in 7..17) result.add(i)
    }
    return result
}

