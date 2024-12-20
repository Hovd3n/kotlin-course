package org.hovd3n.kotlincourse.lesson18.homework18

//Класс “Корзина товаров”: содержит поле словаря из ID товаров и их количества.
//Базовый метод addToCart(itemId) добавляет одну единицу товара к уже существующим в корзине. +
//Выполнить перегрузку addToCart который:
//Принимает два аргумента (itemId и количество amount) +
//Принимает словарь из id и количества и добавляет всё в корзину +
//Принимает список из id (добавляет по одной единице). +

//Учесть, что если товар уже есть в корзине, нужно увеличить его количество, если нет - добавить.
//Попробуй создать корзину и положить в неё товар разными способами, потом распечатать корзину в консоль.
//Переопредели у корзины метод toString для красивого форматирования содержимого таблицы,
// включая итоговое количество артикулов и общее количество всего товара в корзине.

//Класс “Логгер”: представляет из себя инструмент для вывода информации в консоль
// с разным префиксами уровня логирования (INFO, WARNING, ERROR, DEBUG)
//Базовый метод log(message) выводит в консоль сообщение message с префиксом INFO:
//Выполнить перегрузку метода log, который:
//Принимает уровень логирования и сообщение. Выводит сообщения типа WARNING жёлтым цветом,
// а ERROR белым цветом на красном фоне.
//Принимает список сообщений и все их выводит с уровнем INFO
//Принимает объект типа Exception и выводит его поле message с префиксом уровня ERROR
//Попробуй создать логгер и добавить в него сообщения разными способами. Проверь вывод в консоли.

class Shoppingcart {
    val items: MutableMap <Int, Int> = mutableMapOf()
    fun addToCart(itemId: Int) {
        items[itemId] = items.getOrDefault(itemId,0) + 1
    }

    fun addToCart(itemId: Int, amount: Int){
        items[itemId] = items.getOrDefault(itemId,0) + amount
    }

    fun addToCart(map: MutableMap<Int,Int>){
        map.forEach { items[it.key] = items.getOrDefault(it.key,0) + it.value }
    }

    fun addToCart(listOfId: List<Int>){
        listOfId.forEach { items[it] = items.getOrDefault(it,0) + 1 }
    }

}