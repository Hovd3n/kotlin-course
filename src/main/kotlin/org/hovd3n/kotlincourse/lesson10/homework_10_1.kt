package org.hovd3n.kotlincourse.lesson10

// Работа с массивами Array
fun main() {


// Задание 1: Создание и Инициализация Массива
//Создайте массив из 5 целых чисел и инициализируйте его значениями от 1 до 5.
    val numbers = arrayOf(1, 2, 3, 4, 5)
    println(numbers.toList())

//Задание 2: Создание Пустого Массива
//Создайте пустой массив строк размером 10 элементов.
    val emptyArray = Array(10) { "" }
    println(emptyArray.toList())

//Задание 3: Заполнение Массива в Цикле
//Создайте массив из 5 элементов типа Double и заполните его значениями,
// являющимися удвоенным индексом элемента.
    val arrayDouble = doubleArrayOf(1.0, 2.0, 3.0, 4.0, 5.0)
    for (i in arrayDouble)
        println(i * i)

//Задание 4: Изменение Элементов Массива
//Создайте массив из 5 элементов типа Int. Используйте цикл,
// чтобы присвоить каждому элементу значение, равное его индексу, умноженному на 3.
    val array = arrayOf(1, 2, 3, 4, 5)
    for (i in array.indices) {
        array[i] = (i + 1) * 3 // спросить на уроке почему мы присвоили индексы, но за первое значение все равно идет 0
    }
    println(array.toList())

//Задание 5: Работа с Nullable Элементами
//Создайте массив из 3 nullable строк.
// Инициализируйте его одним null значением и двумя строками.
    val arrayNullable = arrayOfNulls<String>(3)
    arrayNullable[1] = "line 1"
    arrayNullable[2] = "line 2"
    println(arrayNullable.toList())

//Задание 6: Копирование Массива
//Создайте массив целых чисел и скопируйте его в новый массив в цикле.
    val array1 = arrayOf(1, 2, 3)
    val array2 = Array(3) { 0 }
        for (i in array1.indices) {
            array2[i] = array1[i]
    }
    println(array2.toList())

//Задание 7: Разница Двух Массивов
//Создайте два массива целых чисел одинаковой длины.
// Создайте третий массив, вычев значения одного из другого.
    val array3 = arrayOf(5, 10, 15, 20)
    val array4 = arrayOf(2, 7, 12, 17)
    val array5 = Array(4) { 0 }
    for (i in array5.indices) {
        array5[i] = array3[i] - array4[i]
    }
    println(array5.toList())

//Задание 8: Поиск Индекса Элемента
//Создайте массив целых чисел. Найдите индекс элемента со значением 5.
// Если значения 5 нет в массиве, возвращаем -1. Реши задачу через цикл while.
    val array6 = arrayOf(3, 7, 5, 20, 12)
    var count = 0
    var result = -1
        while (count < 5) {
            if (array6[count] == 5) {
            result = count
            break
    }
        count++
}
    println(result)

//Задание 9: Перебор Массива
//Создайте массив целых чисел. Используйте цикл для перебора массива и
// вывода каждого элемента в консоль. Напротив каждого элемента
// должно быть написано “чётное” или “нечётное”.
    val perebor = arrayOf(2, 3, 4, 5, 6, 7, 8)
    for (i in perebor.indices) {
        if (perebor[i] % 2 == 0){
            println("${perebor[i]} - четное")
        }
        else {
            println("${perebor[i]} - нечетное")
        }
    }

//Задание 10: Поиск Значения в Массиве по вхождению
//Создай функцию, которая принимает массив строк и строку для поиска.
// Функция должна находить в массиве элемент, в котором принятая строка
// является подстрокой (метод contains()).
// Верни найденный элемент из функции в виде строки.

    println(search(array7 = arrayOf("чему", "бы", "мне", "научиться", "сегодня", "лучше поспи"), "учи котлин"))
    println(search(array7 = arrayOf("чему", "бы", "мне", "научиться", "сегодня", "лучше поспи"), "лучше поспи"))
}
fun search(array7: Array<String>, searchLine: String): String {
    for (i in array7) {
        if (i.contains(searchLine)) {
            return i
        }
    }

    return "не найдено"
}