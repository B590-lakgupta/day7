package com.example.day7_activity

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.runBlocking

suspend fun main() {
    milkMeasurement().collect { x -> println(x) }
}

fun milkMeasurement(): Flow<Float> = flow {
    for (i in arrayOf(180F, 76F, 10F, 92F)) {
        emit(i)
    }
}