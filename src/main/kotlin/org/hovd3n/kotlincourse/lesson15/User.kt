package org.hovd3n.kotlincourse.lesson15

data class User(val id: Int, val name: String)

// это условно карточка, она ничего не делает, только хранит какие-то данные

fun main() {
    val user1 = User(1, "Alice")
    val user2 = user1.copy(name = "Bob") // полная копия всех полей,
                                        // но надо обозначить другим значением то, что нужно заменить
    println(user1)
    println(user2)
}