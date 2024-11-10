package org.hovd3n.kotlincourse.lesson20.homework20

abstract class SwitchEquipment : Powerable {
    private var isOn = false
    override fun powerOn() {
        isOn = true
        println("On")
    }

    override fun powerOff() {
        isOn = false
        println("Off")
    }
}