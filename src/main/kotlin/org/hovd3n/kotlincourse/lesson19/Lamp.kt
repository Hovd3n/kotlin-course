package org.hovd3n.kotlincourse.lesson19

class Lamp() {
    private var isOn: Boolean = false
    fun turnOn() {
        isOn = true
    }

    fun turnOff() {
        isOn = false
    }
}