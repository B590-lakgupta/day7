import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

suspend fun main() {
    println("in main before coroutineScope")

    coroutineScope {
        launch {
            delay(2000L) // Delay for 2 seconds
            milkCows()
        }
        launch {
            delay(1000L) // Delay for 1 second
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
