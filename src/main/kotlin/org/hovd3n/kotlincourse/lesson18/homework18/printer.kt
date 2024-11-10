package org.hovd3n.kotlincourse.lesson18.homework18

import org.hovd3n.kotlincourse.lesson18.printColored


object Col {
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

abstract class Printer {

    abstract fun print (line: String)
}

class Lazer : Printer () {
    override fun print(line: String) {
        val word = line.split(" ")
        printColored(
            word.toString(),
            Col.BLACK,
            Background.WHITE
        )
    }
}

class Inkjet : Printer () {
    override fun print(line: String) {
       val word = line.split(" ")
        var colorIndex = 0

        for (word in line) {

        }

        printColored(
            word.toString(),
            Col.toString(),
            Background.toString()
        )
    }
}