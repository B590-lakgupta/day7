package com.example.day7_activity

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.take
import kotlinx.coroutines.flow.transform
import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking {
        milkMeasurement()
            .take(2)  // Limit the number of emissions to 2
            .transform { x ->
                emit("Receiving measurement: $x")
                emit(format(x))
            }
            .collect { x -> println(x) }
        println("Done")
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
