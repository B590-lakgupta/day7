package com.example.day7_activity

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking {
        milkMeasurement()
            .map { x -> format(x) }
            .collect { x -> println(x) }

        println("Done")
    }
}

suspend fun format(measurement: Float): String {
    return "$measurement lb"
}

fun milkMeasurement(): Flow<Float> = flow {
    for (i in arrayOf(180F, 76F, 10F, 92F)) {
        delay(timeMillis = 100)  // Delay of 100 milliseconds
        emit(i)
    }
}
