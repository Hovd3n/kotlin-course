package org.hovd3n.kotlincourse.lesson15.homework

// Аспект реальности: Эмоция Создайте класс Emotion, который представляет эмоцию.
// У него должно быть свойство type (String) и intensity (Int).
// Добавьте метод express(), который выводит описание эмоции в зависимости от её типа
// и интенсивности.

class Emotion(
    val type: String,
    var intensity: Int
){
    fun express() {
      val intesityInfo = when (intensity) {
      in 1..5 -> "weak"
      in 6..10 -> "mediocre"
      in 11..15 -> "strong"
      in 16..20 -> "very strong"
      else -> "not identify"
      }
        println("Emotion: $type, intensity: $intesityInfo")
    }

}