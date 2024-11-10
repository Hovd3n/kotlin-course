package org.hovd3n.kotlincourse.lesson18.homework18

import org.hovd3n.kotlincourse.lesson18.printColored

fun main () {
    println("Животные")
    val animals: List<Animals> = listOf(Dog(), Cat(), Bird())
    animals.forEach { it.makeSound() }
    println("")

    println("Площади фигур")
    val geoFigures: List<Shape> = listOf(Circle(), Square(), Triangle())
    geoFigures.forEach { it.area() }
    println("")

    println("Принтеры")
    val printer = Lazer()
    printer.print(
        line = "Фраза для выполнения задания"
    )
    println("")

    val inkPrinter = Inkjet()
    inkPrinter.print(
        line = "Фраза для выполнения задания"
    )


}

