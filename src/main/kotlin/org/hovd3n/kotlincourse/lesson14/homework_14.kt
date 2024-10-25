package org.hovd3n.kotlincourse.lesson14

fun main() {

//Для решения каждой задачи постарайтесь использовать наиболее подходящий метод, не повторяясь с решением других задач.
//Дан словарь с именем и временем выполнения каждого автоматизированного теста в секундах. Определите среднее время выполнения теста.
    val testTime = mapOf(
        "test 1" to 60,
        "test 2" to 120,
        "test 3" to 270
    )
    println("Среднее время выполнения теста ${testTime.values.average()} секунд")

//Имеется словарь с метаданными автоматизированных тестов, где ключи — это имена тестовых методов а значения - строка с метаданными.
// Выведите список всех тестовых методов.
    val testMethods = mapOf(
        "test 1" to "meta 123",
        "test 2" to "meta 456",
        "test 3" to "meta 789"
    )
    println(testMethods.keys)

//В изменяемый словарь с данными о прохождении тестов добавьте новый тест и его результат.
    val testResults = mutableMapOf(
        "test 1" to "positive",
        "test 2" to "negative",
        "test 3" to "positive"
    )
    testResults["test 4"] = "negative"
    println(testResults)

//Посчитайте количество успешных тестов в словаре с результатами.
    val positiveTests = testResults.filterValues { it == "positive" }.count()
    println(positiveTests)

//Удалите из изменяемого словаря с баг-трекингом запись о баге, который был исправлен.

    val madeTests = testResults.remove("test 1")
    println(madeTests)

//Для словаря с результатами тестирования веб-страниц (ключ — URL страницы, значение — статус ответа),
// выведите сообщение о странице и статусе её проверки.
    val webTest = mapOf(
        "www.1.ru" to "ok",
        "www.2.ru" to "ok",
        "www.3.ru" to "not ok"
    )
    for (entry in webTest.entries) {
        println("Сайт ${entry.key} был проверен и результат проверки ${entry.value}")
    }

//Найдите в словаре с названием и временем ответа сервисов только те, время ответа которых превышает заданный порог.
    val siteTimes = mapOf(
        "www.1.ru" to 5,
        "www.2.ru" to 7,
        "www.3.ru" to 11
    )
    val siteTimesFinal = siteTimes.filter{ it.value > 8 }
    println(siteTimesFinal)

//В словаре хранятся результаты тестирования API (ключ — endpoint, значение — статус ответа в строке).
// Для указанного endpoint найдите статус ответа, если endpoint отсутствует, предположите, что он не был протестирован.
    val testApi = mapOf(
        "www.1.ru" to "tested",
        "www.2.ru" to "tested",
        "www.3.ru" to "not tested"
    )
    val testApiFinal = testApi.getOrDefault("www.4.ru") { "not tested" }
    println(testApiFinal)

//Из словаря, содержащего конфигурации тестового окружения (ключ — название параметра конфигурации),        !!!!!!!!!!!
// получите значение для "browserType". Ответ не может быть null.
    val testConfig = mapOf(
        "browserType" to "Google Chrome 53.1",
        "configName 2" to "version 2",
        "configName 3" to "version 3"
    )
    val testConfigFinal = testConfig.getOrDefault("configName 4") { "not tested" }
    println(testConfigFinal)

//Создайте копию неизменяемого словаря с данными о версиях тестируемого ПО, чтобы добавить новую версию.
    val testPo = mapOf(
        "aq" to "1.5",
        "aw" to "2.3",
        "ae" to "2.0"
    )
    val NewTestPo = testPo + ("ar" to "2.6")
    println(NewTestPo)

//Используя словарь с настройками тестирования для различных мобильных устройств (ключ — модель устройства),
// получите настройки для конкретной модели или верните настройки по умолчанию.
    val mobTest = mapOf(
        "iPhone 12" to "user 1",
        "iPhone 13" to "user 2",
        "Samsung 20" to "user 3"
    )
    val anotherMobTest = mobTest.getOrElse("iPhone 13") { "default" }
    println(anotherMobTest)
    val anotherMobTest2 = mobTest.getOrElse("iPhone 14") { "default" }
    println(anotherMobTest2)

//Проверьте, содержит ли словарь с ошибками тестирования (код и описание) определенный код ошибки.
    val mistakes = mapOf(
        "test 1" to "mistakes 1",
        "test 2" to "mistakes 2",
        "test 3" to "mistakes 3"
    )
    val finalMistakes = mistakes.getValue("test 1")
    println(finalMistakes)

//Дан неизменяемый словарь, где ключи — это идентификаторы тестовых сценариев в формате "TestID_Version",
// а значения — статусы выполнения этих тестов ("Passed", "Failed", "Skipped").
// Отфильтруйте словарь, оставив только те сценарии, идентификаторы которых соответствуют определённой версии тестов.
    val testVersions = mapOf(
        "TestID_Version 1" to "Passed",
        "TestID_Version 2" to "Failed",
        "TestID_Version 3" to "Skipped"
    )
    val filter = testVersions.filterKeys { it.contains("3") }
    println(filter)


//У вас есть словарь, где ключи — это названия функциональных модулей приложения, а значения — результаты их тестирования.
// Проверьте, есть ли модули с неудачным тестированием.
    val apps = mapOf(
        "fun1" to "Passed",
        "fun2" to "Failed",
        "fun3" to "Passed"
    )
    val appsModules = apps.any {it.value == "Failed"}
    println(appsModules)

//Добавьте в изменяемый словарь с настройками тестовой среды настройки из другого словаря.
    val mutSettings = mutableMapOf(
        "test 1" to "settings 1",
        "test 2" to "settings 2",
        "test 3" to "settings 3"
    )
    val mutSettings2 = mapOf(
        "test 4" to "settings 4"
    )
    mutSettings.putAll(mutSettings2)
    println(mutSettings)

//Объедините два неизменяемых словаря с данными о багах.
    val bagReport1 = mapOf(
        "Тестовый метод1" to "Баг1",
        "Тестовый метод2" to "Баг2",
        "Тестовый метод3" to "Баг3",
    )
    val bagReport2 = mapOf(
        "Тестовый метод7" to "Баг2",
        "Тестовый метод8" to "Баг3",
        "Тестовый метод9" to "Баг4"
    )
    val bagReportAll = bagReport1 + bagReport2
    println(bagReportAll)

//Очистите изменяемый словарь с временными данными о последнем прогоне автоматизированных тестов.
    val AutoTest: MutableMap<String, String> = mutableMapOf(
        "Test 1" to "18.10.2024 13:13",
        "Test 2" to "19.10.2024 13:13",
        "Test 3" to "20.10.2024 13:13"
    )
    AutoTest.clear()
    println(AutoTest)

//Исключите из отчета по автоматизированному тестированию те случаи, где тесты были пропущены (имеют статус “skipped”)
    val modulesTests = testVersions.filterNot { it.value == "Skipped" }
    println(modulesTests)

//Удалите из словаря с конфигурациями тестирования набор устаревших конфигураций.
    val newBagReportAll = bagReportAll - "Тестовый метод3"
    println(newBagReportAll)

//Создайте отчет о тестировании, преобразовав словарь с результатами тестирования
// (ключ — идентификатор теста, значение — результат) в список строк формата "Test ID: результат".
    val testReport = mutableMapOf(
        "Test ID1" to "Passed",
        "Test ID2" to "Failed",
        "Test ID3" to "Skipped"
    )
    val testReportString = testReport.map { "${it.key}: ${it.value}" }
    println(" $testReportString")

//Преобразуйте изменяемый словарь с результатами последнего тестирования в неизменяемый для архивации.
    val testReportToMap = testReport.toMap()
    println(testReportToMap)

//Преобразуйте словарь, содержащий ID теста и данные о времени выполнения тестов,
// заменив идентификаторы тестов на их названия (название можно получить вызвав фейковый метод, например getNameById(id: String)) !!!!!!!!!!!!!!!!!
    val testResults1 = mapOf(
        "test 123" to 130,
        "test 456" to 260,
        "test 789" to 390
    )
    fun getNameById(id: String): String {
        return when (id) {
            "test 123" -> "Login test"
            "test 456" -> "Registration test"
            "test 789" -> "Check test"
            else -> "Unknown test"
        }
    }
    println(testResults1.mapKeys { getNameById(it.key) })


    println("ОТМЕТКА ДЛЯ УДОБСТВА ПРОВЕРКИ ОЧЕРЕДНОЙ ЗАДАЧИ")
//Для словаря с оценками производительности различных версий приложения увеличьте каждую оценку на 10%, чтобы учесть новые условия тестирования.
    val аppVersions = mapOf(
        "Version1" to 4.9F,
        "Version2" to 5.5F,
        "Version3" to 6.0F
    )
    println(аppVersions.mapValues { it.value * 1.1 })

//Проверьте, пуст ли словарь с ошибками компиляции тестов.
    val testCompilationErrors = mapOf(
        "Error_1" to "Description_1",
        "Error_2" to "Description_2",
        "Error_3" to "Description_3"
    )
    val checkIsEmpty = testCompilationErrors.isEmpty()
    println(checkIsEmpty)

//Убедитесь, что словарь с результатами нагрузочного тестирования не пуст.
    val loadTesting = mapOf(
        "Test_1" to "Description_1",
        "Test_2" to "Description_2",
        "Test_3" to "Description_3"
    )
    val checkIsEmpty1 = loadTesting.isNotEmpty()
    println("checkIsEmpty1 $checkIsEmpty1")

//Проверьте, прошли ли успешно все автоматизированные тесты в словаре с результатами.
    val testReportAll = testReport.all { it.value == "Passed"}
    println(testReportAll)

//Определите, содержит ли словарь с результатами тестирования хотя бы один тест с ошибкой.
    val testReportAll2 = testReport.any { it.value == "Failed"}
    println(testReportAll2)

//Отфильтруйте словарь с результатами тестирования сервисов, оставив только те тесты, которые не прошли успешно и содержат в названии “optional”.
    val testReportAll3 = testReport.filter { it.value == "optional"}
    println(testReportAll3)
    
}