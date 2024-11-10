package org.hovd3n.kotlincourse.lesson19.homework19

fun main(){
    val child = ChildrenClass("значение приватного", "значение защищенного", "значение публичного")

    child.publicField = "Антонио Бандерас"
    child.updateProtectedField("Протектед филд")
    child.setPrivateField("Приват филд")

    println(child.getAll())

    child.printText()
}