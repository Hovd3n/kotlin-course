package org.hovd3n.kotlincourse.lesson18

// Полиморфизм - принцип одному и тому же имени функции или метода
// работать по-разному в зависимости от контекста
// Это достигается двумя основными способами: перегрузка и переопределение

// Перегрузка - когда один и тот же метод, может принимать разное количество или типы параметров.

// Переопределение - когда производный класс (класс, который наследует другой класс)
// изменяет реализацию метода. В этом случае название метода будет такое же, аргументы тоже такие же.
// Но способ работы может быть другим

fun main(){
    Cello().playNote("Do")
    Piano().playNote("Do")
    Flute().playNote("Do")

    val orchestra: List<MusicalInstrument> = listOf(Cello(), Piano(), Flute())
    orchestra[0].playNote("Do")
    orchestra[1].playNote("Do")
    orchestra[2].playNote("Do")

    orchestra.forEach { it.playNote("Do") }

    val calc = Calculator()
    println(calc.sum(5,10))
    println(calc.sum(2.8,5.7))
    println(calc.sum("five", "ten"))
    println(calc.sum(listOf(5,10), listOf(20,25)))
    println(calc.sum("five", true))

    calc.sum(2,3)
}

object Colors {
    const val RESET = "\u001B[0m"
    const val BLACK = "\u001B[30m"
    const val RED = "\u001B[31m"
    const val GREEN = "\u001B[32m"
    const val YELLOW = "\u001B[33m"
    const val BLUE = "\u001B[34m"
    const val PURPLE = "\u001B[35m"
    const val CYAN = "\u001B[36m"
    const val WHITE = "\u001B[37m"
}

object Background {
    const val RESET = "\u001B[0m"
    const val BLACK = "\u001B[40m"
    const val RED = "\u001B[41m"
    const val GREEN = "\u001B[42m"
    const val YELLOW = "\u001B[43m"
    const val BLUE = "\u001B[44m"
    const val PURPLE = "\u001B[45m"
    const val CYAN = "\u001B[46m"
    const val WHITE = "\u001B[47m"
}

fun printColored(text: String, color: String, backgroundColor: String = "") {
    println("$color$backgroundColor$text${Colors.RESET}")
}


abstract class MusicalInstrument {

    abstract fun playNote(note: String)

    protected fun shortNote(note: String, color: String) {
        printColored("Play short note $note", color)
    }

    protected fun longNote(note: String, color: String) {
        printColored("Play long note $note", color)
    }
}

class Cello : MusicalInstrument() {
    override fun playNote(note: String) {
        longNote(note, Colors.BLACK)
    }
}

class Piano : MusicalInstrument() {
    override fun playNote(note: String) {
        shortNote(note, Colors.RED)
    }
}

class Flute : MusicalInstrument() {
    override fun playNote(note: String) {
        longNote(note, Colors.YELLOW)
    }
}

class Calculator() {
    fun sum (a: Int, b: Int): Int {
        return a + b
    }
    fun sum (a: Double, b: Double): Double {
        return a + b
    }

    fun sum (a: String, b:String): String {
        return a + b
    }

    fun sum (a: List<Int>, b: List<Int>): List <Int> {
        return a + b
    }

    fun sum (a: String, b: Boolean): String {
        return a + b.toString()
    }
}