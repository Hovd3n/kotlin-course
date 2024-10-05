package org.hovd3n.kotlincourse.lesson8

fun main() {

    println(makeTextFun("Это невозможно выполнить за один день"))
    println(makeTextFun("Я не уверен, можно ли здесь идти"))
    println(makeTextFun("Произошла катастрофа на сервере"))
    println(makeTextFun("Этот код работает без проблем"))
    println(makeTextFun("Удача"))

    println(dateAndTime("Пользователь вошел в систему -> 2021-12-01 09:48:23"))

    println(hide("4539 1488 0343 6467"))

    println(mailReplace("username@example.com"))

    println(nameFromTheLink("C:/Пользователи/Документы/report.txt"))

    println(makeAbbreviation("Объектно-ориентированное программирование"))
}
//Создайте функцию, которая будет анализировать входящие фразы и применять к ним различные преобразования,
// делая текст более ироничным или забавным.
// Функция должна уметь распознавать ключевые слова или условия и соответственно изменять фразу.
//Правила Проверки и Преобразования:

//Если фраза содержит слово "невозможно":
//Преобразование: Замените "невозможно" на "совершенно точно возможно, просто требует времени".

//Если фраза начинается с "Я не уверен":
//Преобразование: Добавьте в конец фразы ", но моя интуиция говорит об обратном".

//Если фраза содержит слово "катастрофа":
//Преобразование: Замените "катастрофа" на "интересное событие".

//Если фраза заканчивается на "без проблем":
//Преобразование: Замените "без проблем" на "с парой интересных вызовов на пути".

//Если фраза содержит только одно слово:
//Преобразование: Добавьте перед словом "Иногда," и после слова ", но не всегда".

//Примеры Тестовых Фраз:
//"Это невозможно выполнить за один день"
//"Я не уверен в успехе этого проекта"
//"Произошла катастрофа на сервере"
//"Этот код работает без проблем"
//"Удача"


fun makeTextFun(originalText: String): String {
    return when {
        originalText.contains("невозможно", true) -> originalText.replace("невозможно", "совершенно точно возможно, просто требует времени")
        originalText.startsWith("Я не уверен", true) -> "${originalText.trim(' ')}, но моя интуиция говорит об обратном"
        originalText.contains("катастрофа", true) -> originalText.replace("катастрофа","интересные события")
        originalText.endsWith("без проблем", true) -> originalText.replace("без проблем", "с парой интересных вызовов на пути")
        originalText.contains(" ", true) -> "Иногда ${originalText}, но не всегда"
        else -> ""

    }
}

//Задание 1: Извлечение Даты из Строки Лога. Используй indexOf или split для получения правой части сообщения.
//Описание: У вас есть строка лога вида "Пользователь вошел в систему -> 2021-12-01 09:48:23".
//Извлеките отдельно дату и время из этой строки и сразу распечатай их по очереди.
    fun dateAndTime(originalString: String) {
        val split = originalString.split(" ")
        println("${split[5]}")
        println("${split[6]}")
}

//Задание 2: Маскирование Личных Данных
//Описание: Дана строка с номером кредитной карты "4539 1488 0343 6467".
// Замаскируйте все цифры, кроме последних четырех, символами "*".
    fun hide(card:String) {
        val cardHidden = card.substring(15)
        println("**** **** **** $cardHidden")
}

//Задание 3: Форматирование Адреса Электронной Почты. Используй replace
//Описание: У вас есть электронный адрес "username@example.com". Преобразуйте его в строку "username [at] example [dot] com".
    fun mailReplace(mail:String){
        val replacedMail = mail.replace("@", " [at] ").replace(".", " [dot] ")
        println(replacedMail)}


//Задание 4: Извлечение Имени Файла из Пути
//Описание: Дан путь к файлу "C:/Пользователи/Документы/report.txt". Извлеките название файла с расширением.
    fun nameFromTheLink (link:String) {
        println(link.substringAfterLast("/"))}

//Задание 5: Создание Аббревиатуры из Фразы. Используй split с набором символов для разделения. Используй for для перебора слов. Используй var переменную для накопления первых букв.
//Описание: У вас есть фраза, например "Объектно-ориентированное программирование". Создайте аббревиатуру из начальных букв слов (например, "ООП").
    fun makeAbbreviation(phrase1: String): String {
        var abbrList = phrase1.split(" ", "-")
        var abbrPhrase = ""
        for (letter in abbrList) {
            if (letter.isNotEmpty()) {
                abbrPhrase += letter[0].uppercase()
            }
        }
    return abbrPhrase
    }