package org.hovd3n.kotlincourse.lesson18.homework18

import org.hovd3n.kotlincourse.lesson18.printColored

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

abstract class Animals {

    open fun makeSound(){
        printColored("This animal makes no sound.", color = String())
    }

}

class Dog : Animals() {
    override fun makeSound(){
       printColored("Bark", color = "\u001B[31m")
    }
}

class Cat : Animals() {
    override fun makeSound(){
        printColored("Meow", color = "\u001B[36m")
    }
}

class Bird : Animals() {
    override fun makeSound(){
        printColored("Tweet", color = "\u001B[32m")
    }
}
