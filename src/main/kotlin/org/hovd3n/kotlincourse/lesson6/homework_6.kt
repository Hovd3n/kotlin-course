package org.hovd3n.kotlincourse.lesson6

import org.hovd3n.kotlincourse.lesson5.sum

fun main() {
    printSeason(1)
    printSeason(13)

    peopleAgeCalculation(2)
    peopleAgeCalculation(12)
    peopleAgeCalculation(-2)

    whichTransportToChoose(4.4)
    whichTransportToChoose(0.5)
    whichTransportToChoose(54.2)
    whichTransportToChoose(-4.4)

    bonusCalculation(920)
    bonusCalculation(6943)
    bonusCalculation(-900)

    typeOfFile("txt")
    typeOfFile("jpg")
    typeOfFile("xlsx")
    typeOfFile("exe")

    temperatureConvertor(44.5,"F")
    temperatureConvertor(20.1,"C")
    temperatureConvertor(200.001,"X")

    temperatureRecommendations(13)
    temperatureRecommendations(-13)
    temperatureRecommendations(23)
    temperatureRecommendations(-33)

    availableFilms(5)
    availableFilms(14)
    availableFilms(33)
    availableFilms(-5)
}

//В каждом задании также нужно валидировать входящие данные, если это имеет смысл.
//Задание 1: "Определение Сезона"
//Контекст: Напишите функцию, которая на основе номера месяца возвращает сезон года.

fun printSeason(numberOfMonth: Int) {
    if (numberOfMonth == 1 || numberOfMonth == 2 || numberOfMonth == 12) {
        println("Winter")
    } else if (numberOfMonth in 3..5) {
        println("Spring")
    } else if (numberOfMonth in 6..8) {
        println("Summer")
    } else if (numberOfMonth in 9..11) {
        println("Autumn")
    } else println("Incorrect number of month")
}

//Задание 2: "Расчет Возраста Питомца"
//Контекст: Создайте функцию, которая преобразует возраст собаки в "человеческие" годы.
// До 2 лет каждый год собаки равен 10.5 человеческим годам, после - каждый год равен 4 человеческим годам.

fun peopleAgeCalculation(ageOfDog: Int) {
   if (ageOfDog in 1..2) {
        var peopleAgeOfDog = ageOfDog * 10.5
       println(peopleAgeOfDog)
    }
    else if (ageOfDog > 2) {
        var peopleAgeOfDog = (ageOfDog - 2)*4 + 2*10.5
       println(peopleAgeOfDog)
    }
    else println("Incorrect age")
}

//Задание 3: "Определение Вида Транспорта"
//Контекст: Напишите функцию, которая определяет, какой вид транспорта лучше использовать, исходя из длины маршрута.
// Если маршрут до 1 км - "пешком", до 5 км - "велосипед", иначе - "автотранспорт".

fun whichTransportToChoose(distance: Double) {
    if (distance in  (0.01..0.99)) {
        println("Пешком")
    }
    else if (distance in (1.0..4.99)) {
        println("Велосипед")
    }
    else if (distance >= 5.0) {
        println("Автотранспорт")
    }
    else if (distance <= 0.0) {
        println("Некорректное значение дистанции")
    }
}

//Задание 4: "Расчет Бонусных Баллов"
//Контекст: Клиенты интернет-магазина получают бонусные баллы за покупки.
// Напишите функцию, которая принимает сумму покупки и возвращает количество бонусных баллов:
// 2 балла за каждые 100 рублей при сумме покупки до 1000 рублей и 5 баллов за каждые 100 рублей при сумме свыше этого.

fun bonusCalculation(sumOfShopping: Int) {

    if (sumOfShopping in 1..1000){
        var bonusSum = sumOfShopping/100*2
        println(bonusSum)
    }
    else if (sumOfShopping >= 1000) {
        var bonusSum = (sumOfShopping - 1000)/100*5 + 1000/100*2
        println(bonusSum)
    }
    else println("Incorrect sum")
}

//Задание 5: "Определение Типа Документа"
//Контекст: В системе хранения документов каждый файл имеет расширение.
// Напишите функцию, которая на основе расширения файла возвращает его тип: "Текстовый документ", "Изображение", "Таблица" или "Неизвестный тип".

fun typeOfFile(type: String) {
    if (type == "txt" || type == "docx" || type == "doc")
        println("Текстовый документ")
    else if (type == "jpg" || type == "png" || type == "dng")
        println("Изображение")
    else if (type == "xlsx" || type == "xls")
        println("Таблица")
    else println("Неизвестный тип")
}

//Задание 6: "Конвертация Температуры"
//Контекст: Создайте функцию, которая конвертирует температуру из градусов Цельсия в Фаренгейты и наоборот
// в зависимости от указанной единицы измерения (C/F).
// Единицу измерения нужно передать вторым аргументом функции.
// Несколько аргументов передаются через запятую. Возвращать нужно строку.
//Подсказка: для генерации строки из числа и буквы можно использовать шалон “$result F” для фаренгейта или “$result C” для цельсия

fun temperatureConvertor(value: Double, unit: String) {
    if (unit == "C") {
        val fahrenheit = value * 9/5 + 32
        "$fahrenheit F"
    }
    if else (unit == "F") { // хрен знает почему
        val celsius = (value - 32) / 1.8
        "$celsius C"
    }
}

//Задание 7: "Подбор Одежды по Погоде"
//Контекст: Напишите функцию, которая на основе температуры воздуха рекомендует тип одежды:
// "куртка и шапка" при температуре ниже 0, "ветровка" от 0 до 15 градусов и "футболка и шорты" при температуре выше 15.
// При температурах ниже -30 и выше +35 рекомендуйте не выходить из дома.

fun temperatureRecommendations(temperature: Int) {
    if (temperature in (0..15))
        println("ветровка")
    else if (temperature in -30..-1)
        println("куртка и шапка")
    else if (temperature in 16..34)
        println("футболка и шорты")
    else if (temperature < -30 || temperature > 35)
        println("лучше не выходите из дома")
}

//Задание 8: "Выбор Фильма по Возрасту"
//Контекст: Кинотеатр предлагает фильмы разных возрастных категорий.
// Напишите функцию, которая принимает возраст зрителя и возвращает доступные для него категории фильмов:
// "детские", "подростковые", "18+".

fun availableFilms(age: Int) {
    if (age in 0..10)
        println("Вам доступны фильмы из категории Детские")
    else if (age in 11..17)
        println("Вам доступны фильмы из категорий Детские и Подростковые")
    else if (age >= 18)
        println("Вам доступны фильмы из категорий Детские, Подростковые и 18+")
    else if (age < 0)
        println("Некорректное значение возраста")
}
