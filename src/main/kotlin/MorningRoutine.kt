package org.example

class MorningRoutine(val clock: Clock, val printer: Printer) {

    fun whatShouldIDoNow() {
        val currentTime = clock.now()
        if (currentTime.hour in 7..7) {
            printer.println("Read and study")
            return
        }
        printer.println("Do exercise")
    }
}