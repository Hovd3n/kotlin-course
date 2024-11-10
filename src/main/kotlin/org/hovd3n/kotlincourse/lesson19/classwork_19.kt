package org.hovd3n.kotlincourse.lesson19

// инкапсуляция нахуй!
// такой подход, который позволяет нам спрятать от прямого доступа поля, методы и классы

fun main() {
    val account = Account(0.0)

    val student = Student("Ivan", 19, 3434)

    val playStation = PlayStation()
}

class Atm (private var balance: Float = 0f){
    private var pinAtm = "1488"
    fun deposit(amount: Float, pin: String) {
        checkPin("1488")
    }

    fun withdraw(amount: Float, pin: String):Float {
        checkPin("1488")
        return amount
    }

    fun getBalance(pin: String): Float{
        checkPin("1488")
        return balance
    }

    fun checkPin (pin: String){
        if (pin != pinAtm)
            throw Exception("Pin is wrong, bitch!")
    }
}