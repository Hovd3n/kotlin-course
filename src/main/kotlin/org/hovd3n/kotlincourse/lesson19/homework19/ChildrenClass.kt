package org.hovd3n.kotlincourse.lesson19.homework19

class ChildrenClass(
    val privateVal: String,
    protectedVal: String,

//объясни, почему этот аргумент доступен в main() несмотря на то, что это не поле
    publicVal: String
) : BaseClass(privateVal, protectedVal, privateVal) {
//потому что он в BaseClass объявлен как val publicVal: String
// а значит публичный. А ChildrenClass наследует от BaseClass



//объясни, почему в main() доступна функция getAll() хотя её здесь нет
// проверь, что выводится на печать при вызове функции printText()
// и объясни, почему не происходит переопределение метода privatePrint()
    private fun privatePrint() {
        println("Печать из класса ChildrenClass")
    }

    override fun verifyPublicField(value: String): Boolean {
        return true
    }

    fun updateProtectedField(value: String) {
        protectedField = value
    }

}
//потому что этот класс наследует от BaseClass, где эта функция публичная и передается вообще всем
