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
    val finalTestResults = testResults + ("test 4" to "negative")
    println(finalTestResults)

//Посчитайте количество успешных тестов в словаре с результатами.
    val positiveTests = finalTestResults.filterValues { it == "positive" }.count()
    println(positiveTests)

//Удалите из изменяемого словаря с баг-трекингом запись о баге, который был исправлен.
    val madeTests = finalTestResults - "test 1" - "test 3"
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
    val testApiFinal = testApi.getOrDefault("www.4.ru") { "not tested" } // как-то не так похоже
    println(testApiFinal)

//Из словаря, содержащего конфигурации тестового окружения (ключ — название параметра конфигурации),
// получите значение для "browserType". Ответ не может быть null.

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
    val anotherMobTest = mobTest.getOrElse("iPhone 13") { "default"}
    println(anotherMobTest)
    val anotherMobTest2 = mobTest.getOrElse("iPhone 14") { "default"}
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
    val filter = testVersions

//У вас есть словарь, где ключи — это названия функциональных модулей приложения, а значения — результаты их тестирования.
// Проверьте, есть ли модули с неудачным тестированием.


//Добавьте в изменяемый словарь с настройками тестовой среды настройки из другого словаря.

//Объедините два неизменяемых словаря с данными о багах.
    val bagReport1 = mutableMapOf(
        "Тестовый метод1" to "Баг1",
        "Тестовый метод2" to "Баг2",
        "Тестовый метод3" to "Баг3",
    )

    val bagReport2 = mutableMapOf(
        "Тестовый метод7" to "Баг2",
        "Тестовый метод8" to "Баг3",
        "Тестовый метод9" to "Баг4"
    )

    val bagReportAll = mutableMapOf<String, String>()

    bagReportAll.putAll(bagReport1)
    bagReportAll.putAll(bagReport2)

    println("bagReportAll $bagReportAll\n")

//Очистите изменяемый словарь с временными данными о последнем прогоне автоматизированных тестов.
    val lastTimeRunAutoTest: MutableMap<String, String> = mutableMapOf(
        "Test_1" to "18.10.2024 13:13",
        "Test_2" to "19.10.2024 13:13",
        "Test_3" to "20.10.2024 13:13"
    )

    lastTimeRunAutoTest.clear()

    println("$lastTimeRunAutoTest\n")

//Исключите из отчета по автоматизированному тестированию те случаи, где тесты были пропущены (имеют статус “skipped”)
    val modulesTestsNew1 = testVersions
        .filterNot { it.value == "Skipped" }
    println("modulesTestsNew1 $modulesTestsNew1\n")


//Удалите из словаря с конфигурациями тестирования набор устаревших конфигураций.


//Создайте отчет о тестировании, преобразовав словарь с результатами тестирования
// (ключ — идентификатор теста, значение — результат) в список строк формата "Test ID: результат".
    val testReport = mutableMapOf(
        "Test ID1" to "Passed",
        "Test ID2" to "Failed",
        "Test ID3" to "Skipped"
    )

    val testReportString = testReport.map { "${it.key}: ${it.value}" }

    println("testReportString $testReportString\n")

//Преобразуйте изменяемый словарь с результатами последнего тестирования в неизменяемый для архивации.
    val testReportToMap = testReport.toMap()

    println("testReportToMap $testReportToMap\n")

//Преобразуйте словарь, содержащий ID теста и данные о времени выполнения тестов,
// заменив идентификаторы тестов на их названия (название можно получить вызвав фейковый метод, например getNameById(id: String))

//Для словаря с оценками производительности различных версий приложения увеличьте каждую оценку на 10%, чтобы учесть новые условия тестирования.
    val performAppVer = mapOf(
        "Version1" to 4.9F,
        "Version2" to 6.0F,
        "Version3" to 5.0F
    )

    val performAppVerNew = performAppVer.mapValues {
        "%.1f".format(it.value * 1.1)
    }

    println("performAppVerNew $performAppVerNew \n")

//Проверьте, пуст ли словарь с ошибками компиляции тестов.
    val testCompilationErrors = mapOf(
        "Error_1" to "Description_1",
        "Error_2" to "Description_2",
        "Error_3" to "Description_3"
    )

    val checkIsEmpty = testCompilationErrors.isEmpty()

    println("checkIsEmpty $checkIsEmpty\n")

//Убедитесь, что словарь с результатами нагрузочного тестирования не пуст.
    val loadTesting = mapOf(
        "Test_1" to "Description_1",
        "Test_2" to "Description_2",
        "Test_3" to "Description_3"
    )

    val checkIsEmpty1 = loadTesting.isNotEmpty()
    println("checkIsEmpty1 $checkIsEmpty1\n")

//Проверьте, прошли ли успешно все автоматизированные тесты в словаре с результатами.

//Определите, содержит ли словарь с результатами тестирования хотя бы один тест с ошибкой.

//Отфильтруйте словарь с результатами тестирования сервисов, оставив только те тесты, которые не прошли успешно и содержат в названии “optional”.



}