package org.hovd3n.kotlincourse.lesson15

object Logger {

    private var data = 0

    fun log(message: String) {
        println("Log: $message $data")

    fun setData(data: Int){
        this.data = data
        }
    }
}
// это одновременно и КЛАСС, и ОБЪЕКТ, то есть чертеж
// котлин сразу создаст объект с именем ЛОДЖЕР, он будет в любом месте доступен сразу, как объект
// в нем доступны методы
// он существует в едином экземпляре во всем приложении Идея, в любой ветке (Пэкэдже)