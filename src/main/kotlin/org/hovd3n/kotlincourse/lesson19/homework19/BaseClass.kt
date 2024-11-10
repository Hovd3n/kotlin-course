package org.hovd3n.kotlincourse.lesson19.homework19



abstract class BaseClass(

//объясни, почему это поле доступно в main() для чтения из класса ChildrenClass:
    private val privateVal: String,
//потому что в ChildrenClass оно сохраняется как паблик


//объясни, почему это поле недоступно в main()
    protected val protectedVal: String,
    val publicVal: String
) {

    var publicField = "измени меня из функции main() на Антонио Бандераса и проверь через функцию getAll()" +
            "Доработай ChildrenClass таким образом, чтобы это получилось"
        set(value) {
            if (verifyPublicField(value)) {
                field = value
            }
        }

    protected var protectedField = "измени меня из функции main() через сеттер в наследнике"
    private var privateField = "добавь сеттер чтобы изменить меня из main()"
    fun setPrivateField(value: String) {
        privateField = value
    }

    fun getAll(): String {
        return mapOf(
            "privateVal" to privateVal,
            "protectedVal" to protectedVal,
            "publicVal" to publicVal,
            "publicField" to publicField,
            "protectedField" to protectedField,
            "privateField" to privateField,
        ).map { "${it.key}: ${it.value}" }
            .joinToString("\n")
    }

    fun printText() {
        privatePrint()
    }
//потому что оно имеет модификатор протектед, который ограничивает доступ только к BaseClass и его наследникам



//объясни, почему эта функция не может быть публичной
    protected open fun getProtectedClass() = ProtectedClass()

    protected open fun verifyPublicField(value: String): Boolean {
        return value.length < 3
    }

    private fun privatePrint() {
        println("Печать из класса BaseClass")
    }
//потому что она возвращает ПротектедКласс, который объявлен как протектед,
// он мб доступен только в классе или субклассах


//объясни, почему эта функция не может быть публичной или protected
    private fun getPrivateClass() = PrivateClass()

    protected class ProtectedClass

    private class PrivateClass
}
//потому что она возвращает ПриватКласс, который объявлен как приват,
// а он может быть доступен только внутри класса. Если сделать паблик или протектед,
// то класс будет доступен в других местах для других функций.