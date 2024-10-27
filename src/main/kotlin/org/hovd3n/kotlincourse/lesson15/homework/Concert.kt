package org.hovd3n.kotlincourse.lesson15.homework

class Concert (
    var group: String,
    val location: String,
    var price: Double,
    var attendance: Int
)
{
    private var soldTickets: Int = 0

    fun concertInfo(){
        println("Скоро пройдет концерт группы $group. Место проведения концерта $location, " +
                "вместимость этого зала равна $attendance. Стоимость билетов $price рублей. ")
    }
    fun toBuyTicket(){
        if(soldTickets < attendance) {
            soldTickets++
        } else {
            println("Билеты закончились, приходите в следующий раз")
        }
    }
}