package org.hovd3n.kotlincourse.lesson20.homework20

abstract class ElectronicWatch : Powerable, AutomaticShutdown, BatteryOperated, Programmable, Rechargeable {
    override fun powerOn() {
        TODO("Not yet implemented")
    }

    override fun powerOff() {
        TODO("Not yet implemented")
    }

    override val sensorType: String
        get() = TODO("Not yet implemented")
    override val maxSensoredValue: Int
        get() = TODO("Not yet implemented")

    override fun startMonitoring() {
        TODO("Not yet implemented")
    }

    override fun getCapacity(): Double {
        TODO("Not yet implemented")
    }

    override fun replaceBattery() {
        TODO("Not yet implemented")
    }

    override fun programAction(action: String) {
        TODO("Not yet implemented")
    }

    override fun execute() {
        TODO("Not yet implemented")
    }

    override fun getChargeLevel(): Double {
        TODO("Not yet implemented")
    }

    override fun recharge() {
        TODO("Not yet implemented")
    }
}