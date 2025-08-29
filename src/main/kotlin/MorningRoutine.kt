package org.example

class MorningRoutine(val clock: Clock, val printer: Printer) {

    fun whatShouldIDoNow() {
        val currentTime = clock.now()
        if (currentTime.hour == 5 && currentTime.minute == 59 ) return printer.println("No activity")
        if (currentTime.hour in 7..7) {
            printer.println("Read and study")
            return
        }

        if (currentTime.hour in 8..8) {
            printer.println("Have breakfast")
        }

        printer.println("Do exercise")
    }
}