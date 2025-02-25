package com.example.day7_activity

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking {
        println("Calling milkMeasurement function...")
        val flow = milkMeasurement()

        println("Calling collect...")
        flow.collect { x -> println(x) }

        println("Calling collect again...")
        flow.collect { x -> println(x) }
    }
}

fun milkMeasurement(): Flow<Float> = flow {
    for (i in arrayOf(180F, 76F, 10F, 92F)) {
        delay(100)  // Delay of 100 milliseconds
        emit(i)
    }
}
