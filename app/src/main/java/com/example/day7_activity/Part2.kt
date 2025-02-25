package com.example.day7_activity

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking {
        launch {
            for (k in 1..4) {
                println("hello $k")
                delay(100) // Delay of 100 milliseconds
            }
        }

        milkMeasurement().collect { x -> println(x) }
    }
}

fun milkMeasurement(): Flow<Float> = flow {
    for (i in arrayOf(180F, 76F, 10F, 92F)) {
        delay(100) // Delay of 100 milliseconds
        emit(i)
    }
}