package org.hovd3n.kotlincourse.lesson8

fun main() {
    val simpleString = "Это простая строка"

    val firstName = "Ivan"
    val lastName = "Ivanov"
    val fullName = firstName + " " + lastName

    val age = 30
    val greeting = "Привет! Меня зовут $fullName, и мне $age лет"

    println(greeting)

    val person = Person("Алексей", 25 )
    val introduction = "Меня зовут ${person.name}, и мне ${person.age} лет."

    println(introduction)

    val details = "Здесь находятся ${getDetails()}"
    println(details)

    val x = 10
    val y = 20
    val resultString = "Результат сложения x и y равен ${x + y}"
    println(resultString)

    val originalString = "Kotlin is fun"
    val subString1 = originalString.substring(7)
    val subString2 = originalString.substring(3, 6)

    println(subString1)
    println(subString2)

    val replacedString = originalString.replace("fun", "awesome") // замена

    println(replacedString)

    val words = originalString.split(" ") // разделение переменной на отдельные слова
    println(words)

    val length = "Hello".length // длина слова

    val upper = "hello".uppercase() // перевод в верхний регистр, в большие буквы
    println(upper)

    val lower = "HELLO".lowercase() // перевод в нижний регистр, в маленькие буквы
    println(lower)

    val trimmed = "  hello  ".trim() // убирает все лишние пробелы
    val trimmed2 = "  hello  ".trim('h', 'o') // убирает лишние символы, которые выбраны для удаления

    println(trimmed)
    println(trimmed2)

    val starts = "Kotlin".startsWith("Kot") // проверяет, начинается ли строка с определенного префикса
    println(starts)

    val ends = "Kotlin".endsWith("lin") // проверяет, кончается ли строка с определенного суфикса
    println(ends)

    val contains = "Hello".contains("ell") // метод проверки вхождения определенной подстроки в строку
    println(contains)

    val empty = "".isNullOrEmpty() // проверяет строку или определенный объект является null
    println(empty)

    val blank = "  ".isNullOrBlank()
    println(blank)

    val repeat = "ab".repeat(3) // говорит повторить определенную строку сколько-то заданных раз
    println(repeat)

    val letter = originalString[5] // метод get из нужной переменной указанный по порядку символ
    println(letter)

    val indexOfChar = "Kotlin".indexOf('t')

    val indexOfWord = "Kotlin is the best language".indexOf("best")

    val backReverse = "niltoK".reversed()

    val multiLineString = """ 
            Первая строка
                Вторая строка
                    Третья строка
            """.trimIndent()


    val string = "Sweet summer child"
    val subString = string.substring(6)
    val subString3 = string.substring(6,12)
    println(subString3)

    //

    val name = "Алексей"
    val city = "Москва"
    val age1 = 32
    val friendsCount = 1052
    val rating = 4.948
    val balance = 2534.75856
    val text = """
   Имя: %s
   Город: %s
   Возраст: %d
   Количество друзей: %,d
   Рейтинг пользователя: %.1f
   Баланс счета: $%,.2f
""".trimIndent()
    println(text.format(name, city, age1, friendsCount, rating, balance))
// метод формат: несколько переменных, которые по счету попадают в какую-то заглушку выше в том порядке,
// в котором они указаны в методе формат

    //"Kotlin: The Fun Way to Learn Programming"
    val subString4 = "Kotlin: The Fun Way to Learn Programming"
    println(subString4.substring(8,19))

    //contact@example.com
    val subString5 = "contact@example.com"
    val indexOfAt = subString5.indexOf("@")
    println(subString5.substring(indexOfAt + 1))

    //  "123-456-7890" -> "XXX-XXX-7890"
    val num = "123-456-7890"
    val subString6 = num.substring(8)
    println("XXX-XXX-$subString6")
    //либо:
    val num2 = "123-456-7890"
    println("XXX-XXX-${num2.substring(8)}")
    //либо:
    val num3 = "123-456-7890"
    val split = num3.split("-")
    println("XXX-XXX-${split[2]}")              // (охуеть!)

}
//println(convert("Ошибка в системе вызвала панику."))
//println(convert("Для завершения проекта важно"))

fun convert(text: String): String {
    return when {
        text.startsWith("ошибка", ignoreCase = true) -> text.replace("ошибка","небольшое недоразумение", ignoreCase = true)

        text.endsWith("важно", ignoreCase = true) -> "$text …но не критично"
        else -> ""
    }
}


class Person(val name: String, val age: Int)

fun getDetails(): String {
    return "Очень интересные детали"
}