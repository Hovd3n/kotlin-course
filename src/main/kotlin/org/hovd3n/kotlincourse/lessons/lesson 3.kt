package org.hovd3n.kotlincourse.lessons

// lesson 3
val name: String = "Alice"
var age: Int = 30
const val PI: Double = 3.14 // просто заметка на полях
lateinit var userInfo: String
val lazyValue: String by lazy {
    "Hello world!"}
var speed: Double? = null
var count: Int = 0 // чтобы мы могли влиять на то, что переменная отдает
    get() = field
    set(value) {
        if (value >= 0) field = value
        else field = 100 // но в целом, конечно, неособо понятно
    }
val chassis: String = "12345abc"
var colour: String = "Blue"
var distance: Double = 0.0
lateinit var owner: String
const val WHEELS: Int = 4
val report: String by lazy {
    ""
}
var fuel: Double = 5.0
    get() = field
    set(value) {
        if (value > 0) field += value

    }