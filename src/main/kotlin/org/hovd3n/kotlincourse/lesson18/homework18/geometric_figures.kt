package org.hovd3n.kotlincourse.lesson18.homework18

abstract class Shape {

    open fun area(){
    println(0.0)
    }
}

class Circle : Shape() {
    val radius: Double = 3.0
    val pi: Double = 3.14
    override fun area(){
        val circleSpace: Double = radius * radius * pi
        println(circleSpace)
    }
}

class Square : Shape() {
    val side: Double = 3.0
    override fun area(){
        val squareSpace: Double = side * side
        println(squareSpace)
    }
}

class Triangle : Shape() {
    val side_1: Double = 3.0
    val side_2: Double = 6.0
    val sinAngle: Double = 1.0
    override fun area(){
        val squareSpace: Double = 0.5 * side_1 * side_2 * sinAngle
        println(squareSpace)
    }
}