package com.example.day7_activity

import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking {
        launch {
            milkCows()
        }
        launch {
            feedChickens()
        }
    }
}

fun milkCows() {
    var cow = 1
    println("Milking cow #$cow")
    cow += 1
    println("Milking cow #$cow")
    cow += 1
    println("Milking cow #$cow")
    cow += 1
    println("Milking cow #$cow")
    cow += 1
}

fun feedChickens() {
    var chicken = 1
    println("Feeding chicken #$chicken")
    chicken += 1
    println("Feeding chicken #$chicken")
    chicken += 1
    println("Feeding chicken #$chicken")
    chicken += 1
    println("Feeding chicken #$chicken")
    chicken += 1
}
