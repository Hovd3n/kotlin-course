package org.hovd3n.kotlincourse.lesson12

fun main () {

    greetUser("Mac")
    val result = sum(4.3, 2.2, true)
    println(result)
    val result1 = sum(4.3, 2.2, false)
    println(result1)

    val max = getMax(5,1)
    val mutString = mutableListOf("his", "her", "him")
    replaceString(mutString, "his")
    println(mutString)

    printMap(12,-15)
}
fun sayHello() {
    println("Hello, world!")
}

fun greetUser(name: String) {
    println("Hello, $name!")
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun printSum(a: Int, b: Int) {
    println("Sum of $a and $b is ${a + b}")
}

fun multiply(a: Int, b: Int): Int = a * b


private fun calculateDiscount(price: Double): Double {
    return price * 0.1
}

fun finalPrice(price: Double): Double {
    val discount = calculateDiscount(price)
    return price - discount
}

fun findValue(numbers: List<Int>, target: Int) {
    for (number in numbers) {
        if (number == target) {
            println("Value found: $number")
            return
        }
        println(number)
    }
    println("Value not found")
}

// classwork!

fun doSomething(){}
fun doSomething1() = Unit

fun getUserName():String{
    return ""
}

fun printGreeting(greeting:String){
}

fun calculateArea(d:Double, f:Double):Double{
    return 9.0
}

fun findMax(value1: Int, value2: Int): Int {
    return 1
}

fun isNullOrEmpty(st: String?): Boolean {
    return true
}

fun calculateDiscount(str: List<String>, arg: Int?):Double? {
    return null
}

fun sum(value3: Double, value4: Double, flag: Boolean): Double {
    return if (flag){
        value3 + value4
    }
    else {
        value3 - value4
    }
}

fun getMax(f: Int, s: Int) = if (f < s) s else "f"

fun printPositiveNumbers(a: List<Int>) {
    for (i in a) {
        if (i > 0) {
            println(i)
        } else return
    }
    println("end")
}

fun replaceString(q: MutableList<String>, w: String) {
    for (i in q.indices){
        if (q[i] == w){
            q[i] = w.uppercase()
            return
        }
    }
    println("not found")
}

private fun checkSize(xy: Int, result: String) {
    if (xy == 0) throw IllegalArgumentException("$result не должно быть равным нулю")
}
private fun createRange(size: Int): IntProgression {
    return if (size > 0) {
        0..size
    } else {
        0 downTo size
    }
}

fun printMap(xSize: Int, ySize: Int) {
    checkSize(xSize, "xSize")
    checkSize(ySize, "ySize")

    val formatterSize = " $xSize".length

    val xRange = createRange(xSize)
    val yRange = createRange(ySize)
    print(" ".repeat(formatterSize))

    for (i in xRange) {
        print("%${formatterSize}s".format(i))
    }
    println()
    for (i in yRange) {
        print("%${formatterSize}s".format(i))
        for (j in yRange) {
            val m = i * j
            val result = when {
                m % 2 == 0 -> if (m % 3 == 0) "." else "*"
                m % 5 == 0 -> if (i < 0) "-" else "+"
                else -> "?"
            }
            print("%${formatterSize}s".format(result))
        }
        println()
    }
}