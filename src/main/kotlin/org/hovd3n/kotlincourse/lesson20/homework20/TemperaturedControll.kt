package org.hovd3n.kotlincourse.lesson20.homework20

class TemperaturedControll : ProgrammableHardware(), TemperatureRegulatable, Openable  {
    override var maxTemperature: Int = 80
    private var minTemperature: Int = 0
    private var isOpen: Boolean = true


    override fun setTemperature(temp: Int) {
        TODO("Not yet implemented")
    }

    override fun open() {
        isOpen = true
        println("Device is open")
    }

    override fun close() {
        isOpen = false
        println("Device is close")
    }
}