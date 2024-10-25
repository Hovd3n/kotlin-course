package org.hovd3n.kotlincourse.lesson15

class Wind (val speed: Int) {
    fun speedConverter(): Int {
        return (speed * 1000 / 3600)
    }
}