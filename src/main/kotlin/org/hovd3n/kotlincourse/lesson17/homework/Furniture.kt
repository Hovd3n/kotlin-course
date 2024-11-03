package org.hovd3n.kotlincourse.lesson17.homework

import org.hovd3n.kotlincourse.lesson17.Materials

open class Furniture(
    val materials: String,
    val name: String,
    val numOfThings: Int
)

class RoomFurniture(
    materials: String,
    name: String,
    numOfThings: Int,
    val purpose: String
): Furniture (materials, name, numOfThings)

class OfficeFurniture(
    materials: String,
    name: String,
    numOfThings: Int,
    val purpose: String,
    val wearResistance: String
): Furniture (materials, name, numOfThings)

open class KitchenFurniture(
    materials: String,
    name: String,
    numOfThings: Int,
    val purpose: String
): Furniture (materials, name, numOfThings)

class Chair(
    materials: String,
    name: String,
    numOfThings: Int,
    purpose: String,
    val numOfChairLegs: Int,
    val formes: String
): KitchenFurniture (materials, name, numOfThings, purpose)

class Table(
    materials: String,
    name: String,
    numOfThings: Int,
    purpose: String,
    val numOfTableLegs: Int,
    val typeOfWorkTop: String
): KitchenFurniture (materials, name, numOfThings, purpose)