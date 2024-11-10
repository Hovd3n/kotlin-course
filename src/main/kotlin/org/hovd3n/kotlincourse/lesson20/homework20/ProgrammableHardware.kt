package org.hovd3n.kotlincourse.lesson20.homework20

abstract class ProgrammableHardware : SwitchEquipment () , Programmable {
    private val programs = mutableListOf<String>()
    override fun programAction(action: String) {
        powerOn()
        programs.add(action)
        println("Program is add")

    }

    override fun execute() {
        powerOn()
        programs.forEach { it -> println("$it executed") }
        programs.clear()
        powerOff()
    }
}