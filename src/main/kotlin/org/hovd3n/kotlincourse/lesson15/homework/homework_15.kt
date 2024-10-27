package org.hovd3n.kotlincourse.lesson15.homework

fun main(){
    println("Party")
    val partyDetails = Party("ДИВС", 120)
    println(partyDetails.details())

    println("Emotion")
    val emotion1 = Emotion("Exciting", 14)
    emotion1.express()

    println("Moon")
    Moon.showPhase()
    Moon.isVisible = true
    Moon.showPhase()

    println("Product")
    val productInfo = Product("Apples", 120.0, 10)
    println(productInfo.storeProduct())

    println("Concert")
    val concert1 = Concert("Рога и копыта", "ДК РТИ", 1500.0, 1000)
    concert1.concertInfo()
    concert1.toBuyTicket()
}