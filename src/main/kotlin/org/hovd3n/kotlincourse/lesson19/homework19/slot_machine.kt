package org.hovd3n.kotlincourse.lesson19.homework19


//Опиши схематически класс игрового автомата, правильно расставив объявление полей (val или var)
// и методов (аргументы и возвращаемые значения), включая модификаторы доступа (private для приватных)

//Поля:
//цвет
//модель
//включен
//ОС загружена
//список доступных игр
//наличие джойстика
//баланс вырученных средств
//владелец
//телефон поддержки.

class SlotMachine(
    val color: String,
    val model: String,
    private var turnOn: Boolean = false,
    private var osLoad: Boolean = false,
    val availableGames: List<String>,
    val joystickOrNot: Boolean = false,
    private var balance: Double = 0.0,
    private var owner: String,
    private var phoneNumber: String
)
//Методы:
//включить
//выключить
//загрузить ОС
//завершить работу ОС
//показать список игр
//включить игру
//оплатить игровой сеанс
//открыть сейф и выдать наличные
//выплатить выигрыш

{
    fun turnOn() {
        turnOn = true
        loadOs()
    }

    fun turnOff() {
        turnOn = false
        shutDownOs()
    }
    private fun loadOs() {}
    private fun shutDownOs() {}
    fun showAvailableGames(): List<String> {
        return availableGames
    }
    fun gameStart(nameOfGame: String):Boolean {
        return availableGames.contains(nameOfGame)
    }
    fun payForPlay(amount: Double) {
        balance += amount
    }
    fun openVaultAndPay() {}
    protected fun payWinnings() {}
}