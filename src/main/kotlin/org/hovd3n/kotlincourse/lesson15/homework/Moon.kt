package org.hovd3n.kotlincourse.lesson15.homework

//Природное явление: Луна Создайте объект Moon, который будет представлять Луну.
// Добавьте свойства isVisible (Boolean), чтобы отображать, видна ли Луна в данный момент,
// и phase (String), чтобы отображать текущую фазу Луны (например, "Full Moon", "New Moon").
// Добавьте метод showPhase(), который выводит текущую фазу Луны.

object Moon {
    var isVisible: Boolean = false
    var phase: String = "New moon"

    fun showPhase(){
        if (isVisible) {
            phase = "Full moon"
        }
        println(phase)
    }
}