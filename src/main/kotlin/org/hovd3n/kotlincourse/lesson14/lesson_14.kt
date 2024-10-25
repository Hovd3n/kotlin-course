package org.hovd3n.kotlincourse.lesson14

// Коллекции. Методы. Словари

fun main () {

    val fruitsPrices = mapOf(
        "apple" to 2.99,
        "banana" to 1.99,
        "cherry" to 3.99
    )
    for (entry in fruitsPrices.entries) {           // цикл по словарю или по элементам энтрис
        println("Key: ${entry.key}, Value: ${entry.value}")
    }

    for ((fruit, price) in fruitsPrices) {   // деструктуризация, где кей и вэлью подаются в виде 2 объектов
        println("Key: $fruit, Value: $price")
    }


    val entries = fruitsPrices.entries
    val keys = fruitsPrices.keys // возврат ОТДЕЛЬНО значение ключей
    val values = fruitsPrices.values // возврат ОТДЕЛЬНО значение значений

    val priceOfPearOrElse = fruitsPrices.getOrElse("pear") { 0.0 }
    val priceOfApple = fruitsPrices.getValue("apple") // получение значения вэлью по индексу ключа (только нот наллэбл)
    val priceOfPearOrDefault = fruitsPrices.getOrDefault("pear", 0.0)
                                            // вернет значение по ключу или
                                            // вернет дефолтное значение, если нет значения

    val fruitsWithoutBanana = fruitsPrices - "banana" // минус это метод убирания ключа из словаря (на самом деле создание нового словаря)
    val fruitsWithPineapple = fruitsPrices + ("pineapple" to 3.5) // плюс это метод для добавления значений
    val mutableFruits = fruitsPrices.toMutableMap() // создание нового словаря, который будет уже изменяемый

    mutableFruits["kiwi"] = 2.75 // Добавление элемента
    mutableFruits.putAll(mapOf("lime" to 1.1, "avocado" to 1.9)) // способ объединения
    mutableFruits.remove("apple") // Удаление элемента
    mutableFruits.clear() // способ очистки словаря

    val containsApple = fruitsPrices.containsKey("apple") // проверяет есть ли ключ
    val containsValue1_5 = fruitsPrices.containsValue(1.5) // проверяет есть ли значение
    val isEmpty = fruitsPrices.isEmpty() // пустой ли словарь?
    val isNotEmpty = fruitsPrices.isNotEmpty() // убедиться, что в словаре нет пустых значений
    val areAllFruitsExpensive = fruitsPrices.all { it.value > 1.0 }
                        // метод, который проверяет ВСЕ элементы словаря на выполнение определенного условия
    val isAnyFruitCheap = fruitsPrices.any { it.value < 1.0 }
                        // метод, который проверяет ХОТЯ БЫ ОДИН элемент словаря на соответствие

    val filteredByPrice = fruitsPrices.filter { it.value > 1.0 }
    val filteredByKeys = fruitsPrices.filterKeys { it.startsWith("a") }
    val filteredByValues = fruitsPrices.filterValues { it < 2.0 }
    val filteredNotApple = fruitsPrices.filterNot { it.key == "apple" } // позволяет исключить что-либо из итогового вывода
    val countExpensiveFruits = fruitsPrices.count { it.value > 1.5 }

    val increasedPrices = fruitsPrices.mapValues { it.value * 1.1 } // позволяет получать возможность изменить значение
    val fruitNamesUppercase = fruitsPrices.mapKeys { it.key.uppercase() } // позволяет получать возможность изменить ключ
    val fruitsList = fruitsPrices.map { "${it.key} costs ${it.value}" } // преобразует словарь в список

    val toMap = mutableFruits.toMap() // преобразование изменяемого словаря в неизменяемый
    val toMutableMap = fruitsPrices.toMutableMap()

    fruitsPrices.forEach { (fruit, price) ->
        println("$fruit costs $price")
    }
    fruitsPrices.forEach {
        println("${it.key} costs ${it.value}")
    }



}
                                        // КЛАССНАЯ РАБОТА! Помоги господи! Христа ради!
fun classWork () {
    val linesAndNumbers = mapOf <String, Int> ()
    for (entry in linesAndNumbers.entries)
        println("${entry.key} = ${entry.value}")

    println(linesAndNumbers.values)
    println(linesAndNumbers.keys)

   val reserve = mapOf("A" to 1.23, "B" to 3.5, "C" to 2.85)
   println(reserve.getOrElse("A") { throw Exception() })
   println(reserve.containsKey("А"))
   println(reserve.containsValue(10.0))

   val newList = reserve.map { "Продукт ${it.key} стоит ${it.value} рублей" } // преобразуем СЛОВАРЬ в СПИСОК СТРОК

   reserve.isEmpty()
   reserve.isNotEmpty()

   reserve.all { it.value > 10.0 }

   reserve.any { it.value > 100.0 }

   reserve.filterValues { it > 100.0 }

   val newReserve = reserve.toMutableMap()
   newReserve.remove("A")
   newReserve.putAll(mapOf())
   newReserve.clear()

   }



