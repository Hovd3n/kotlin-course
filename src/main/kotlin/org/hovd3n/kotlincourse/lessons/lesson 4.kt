package org.hovd3n.kotlincourse.lessons

class `lesson 4` {
}

// lesson 4
val myInt: Int = 2147483647 // целочисленное число, может быть положительным и отрицательным
val myFloat: Float = 0.58f // тип с плавающей точкой
val myLong: Long = 1_234_567_890L // принято хранить время в секундах
val myShort: Short = 32767 //
val myByte: Byte = 127 // представление инфы в виде байтов
val myDouble: Double = 1212.31231231233 // большие значения с большим количество знаков после запятой

val myBoolean: Boolean = true // логический тип: равна ли одна строка другой строке

val letter: Char = 'A' // всегда одиночными кавычками, всегда единичный
val text: String = "bd"

val numbers: Array<Int> = arrayOf(1,2,3)
val strings: List<String> = listOf("one", "two", "three")
val doubles: Set<Double> = setOf(23.3, 56.8)

val keysToValues: Map<String, String> = mapOf(
    "Ключ 1" to "Значение 1"
)

val anything: Any = false // обозначает что угодно и как угодно, сам определит
fun printMessage(message:String) {
    printIn (message)
}
fun fail(message:String): Nothing {
    throw illegalArgument (message)
}
