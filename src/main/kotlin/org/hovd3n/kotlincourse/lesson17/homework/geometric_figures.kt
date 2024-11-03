package org.hovd3n.kotlincourse.lesson17.homework

//Задание 1
//Потренируйся в создании иерархии классов с расширением базовой сущности.
//Для каждого задания опиши в коде базовый класс с базовыми свойствами и если применимо - методами.
// Для произвольных классов также добавь особенные свойства. Детально описывать не нужно,
// упражнение на то, чтобы усвоить иерархию наследования.
//
//
//Геометрические Фигуры
//Базовый класс: Геометрическая Фигура
//Производные классы: Многоугольник, Круг
//Дополнительное разветвление для Многоугольник: Треугольник, Четырехугольник

open class GeometricFigures(
    val name: String,
    val angles: Int
)
class Circle (
    name: String,
    angles: Int,
    val radius: Double
): GeometricFigures(name, angles)

open class Polygon(
    name: String,
    angles: Int,
    val sides: Int = angles
): GeometricFigures(name, angles)

class Triangle(
    name: String,
    angles: Int,
    val side_a: Double,
    val side_b: Double,
    val side_c: Double,
    val height: Double,
    val space: Double = 0.5 * side_a * height
): Polygon (name, angles)

class Quadrilateral(
    name: String,
    angles: Int,
    val side_a: Double,
    val side_b: Double,
    val side_c: Double,
    val side_d: Double,
    val diagonal_1: Double,
    val diagonal_2: Double,
    val sinusOfDiagonals: Int,
    val space: Double = 0.5 * diagonal_1 * diagonal_2 * sinusOfDiagonals
): Polygon (name, angles)

