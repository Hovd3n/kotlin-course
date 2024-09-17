package org.hovd3n.kotlincourse.lesson5

val sum = 10 + 5
val diff = 10 - 5
val product = 10 * 5
val quotient = 10 / 5
val remainder = 10 % 5
val remainder1 = 10 % 6
val remainder2 = 10 % 4
val isEqual = 5 == 5
val isNotEqual = (5 != 5) // знак !перед означает "НЕ" или в обратную сторону
val isGreater = (5 > 3)
val isLesser = (5 < 3)
val isGreaterOrEqual = (5 >= 5)
val isLesserOrEqual = (5 <= 3)
val andResult = true && true // оператор "и" возвращает правда, только если с обеих сторон правда
val andResult1 = false && false // оператор "и" возвращает ложь, только если с обеих сторон ложь
val orResult = true || false // оператор "или" возвращает правду даже если с одной стороны ложь. Один из операндов д\б true
val notResult = !(5 > 3)
var number = 5
//number = number + 3 // или можно сделать +=3: number +=3
//number -= 2
//number *=3
//number /=2

//number ++ // увеличивает на единицу
//number -- // уменьшает на единицу

//println(number++) // сначала вывод декримента, а потом уже производится увеличение декримента на единицу
//println(number)

//println(++number) // сначала происходит увеличение на единицу или уменьшение, если минус, а потом вывод
//println(number)

// fun = main() {
//    val q =
//        (3 + 2 < 6) && (4 * 2 == 8)
//
//    (10 - 5 >= 5) || (2 * 3 != 6)
//
// (8 / 2 == 4) && (7 % 3 != 1)
//
//    (9 - 3 >= 6) && (8 / 2 != 4)
//
//    ((3 + 4) < 8) && (12 / 3 == 4) || (5 % 2 != 1)
//
//    ((10 - 5) >= 5) || (6 * 2 != 12) && !(9 / 3 > 2) // знак !перед означает "НЕ" или в обратную сторону
//
//    ((2 * 5) == 10) && !(7 - 3 < 5) || (8 / 2 == 4)
//
//    ((9 + 2) < 12) && (15 % 4 != 3) || !(4 * 2 == 8)
//
//    ((var a = 4; a-- == 4) || (5 * 2 != 10)) && (3 + 1 == 4)
//     true            ||        false     &&     true = true
//    (var b = 3; b++ > 3) && (6 / 2 == 3) || (7 - 2 != 5)
//      false            &&     true    || false = false
//    (var c = 1; ++c < 3) || ((4 % 2 == 0) && (5 + 0 == 5))
//     t || (t && t) = t
//    ((var d = 5; d-- == 5) && (8 / 4 == 2)) || (2 * 3 != 6)
//     (t && t) || f = t
//    (var e = 2; e++ < 3) && ((7 + 1 == 8) || (4 % 2 != 0))
//     t && (t || f) = t


var name: String? = null
val result = name ?: "Unkonwn" // позволяет обойти невозможность создания кода при нехватке данных


fun main() {

}

fun printVolume(userVolume: Int?) {
    val defaultVolume = 30
    println(userVolume ?: defaultVolume)
}

fun printPrice(price: Double, s: Int?){
    val koef = (100 - (s ?: 0))/100.0
    println(price * koef)
}