package org.hovd3n.kotlincourse.lesson17.homework

// Учебные Заведения
//Базовый класс: Учебное Заведение
//Производные классы: Школа, …
//Дополнительное разветвление для …: …

open class EduInst(
    name: String,
    population: Int,
    ageOfPopulation: Int,
    classOfEducation: String,
)
class School(
    name: String,
    population: Int,
    ageOfPopulation: Int,
    classOfEducation: String,
    numOfClasses: Int,
    topics: String
): EduInst (name,population, ageOfPopulation, classOfEducation)

open class HighSchool(
    name: String,
    population: Int,
    ageOfPopulation: Int,
    classOfEducation: String,
    val numOfClasses: Int,
    val topics: String,
    val mainTopics: String,
    val specialization: String
): EduInst (name,population, ageOfPopulation, classOfEducation)

class SpecializationInHighSchool(
    name: String,
    population: Int,
    ageOfPopulation: Int,
    classOfEducation: String,
    numOfClasses: Int,
    topics: String,
    mainTopics: String,
    specialization: String,
    val numOfHoursTopic1: Int,
    val numOfHoursTopic2: Int,
    val aLikelyProfession: String
): HighSchool (name,population, ageOfPopulation, classOfEducation, numOfClasses, topics, mainTopics, specialization)