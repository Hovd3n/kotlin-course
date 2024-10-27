package org.hovd3n.kotlincourse.lesson15.homework


//Событие: Вечеринка Создайте класс Party, который описывает вечеринку.
// У него должны быть свойства location (String) и attendees (Int).
// Добавьте метод details(), который выводит информацию о месте проведения и количестве гостей.

class Party(
    var location: String,
    var attendees: Int
) {
    fun details() {
        println("Вечеринка пройдет в $location, на ней будет $attendees гостей")
    }
}