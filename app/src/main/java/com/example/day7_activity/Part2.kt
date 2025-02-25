package com.example.day7_activity


    fun main() {
        milkMeasurement().forEach { x -> println(x) }
    }

    fun milkMeasurement(): List<Float> {
        var milks: List<Float> = listOf(180F, 76F, 10F, 92F)
        return milks
    }
