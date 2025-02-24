package com.example.day7_activity

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

suspend fun main() {
    println("in main before coroutineScope")

    coroutineScope {
        launch {
            milkCows()
        }
        launch {
            feedChickens()
        }
    }

    println("in main after coroutineScope")
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
