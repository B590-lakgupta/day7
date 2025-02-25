package com.example.day7_activity

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.reduce
import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking {
        val sum = milkMeasurement()
            .reduce { x, y -> x + y }
        println("Sum = $sum")
    }
}

suspend fun format(measurement: Float): String {
    return "$measurement lb"
}

fun milkMeasurement(): Flow<Float> = flow {
    for (i in arrayOf(180F, 76F, 10F, 92F)) {
        delay(timeMillis = 100)
        emit(i)
    }
}
