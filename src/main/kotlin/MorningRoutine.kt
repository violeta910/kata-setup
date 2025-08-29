package org.example

class MorningRoutine(val clock: Clock, val printer: Printer) {

    fun whatShouldIDoNow() {
        val currentTime = clock.now()
        printer.println("Do exercise")
    }
}