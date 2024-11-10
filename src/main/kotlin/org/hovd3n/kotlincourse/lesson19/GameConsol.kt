package org.hovd3n.kotlincourse.lesson19

open class GameConsole {
    fun startGame(nameGame: String){
        initHardware()
        loadGame(nameGame)
    }

    protected open fun initHardware(){}

    private fun loadGame(nameGame: String){}
}

class PlayStation : GameConsole() {
    override fun initHardware() {
        super.initHardware()
        "Play".length
    }

}