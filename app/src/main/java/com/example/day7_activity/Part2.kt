package com.example.day7_activity

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withTimeoutOrNull

fun main() {
    runBlocking {
        withTimeoutOrNull(timeMillis = 250) {
            milkMeasurement().collect { x -> println(x) }
        }
        println("Done")
    }
}

fun milkMeasurement(): Flow<Float> = flow {
    for (i in arrayOf(180F, 76F, 10F, 92F)) {
        delay(timeMillis = 100)  // Delay of 100 milliseconds
        println("Emitting $i")
        emit(i)
    }
}