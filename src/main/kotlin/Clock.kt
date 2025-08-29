package org.example

import java.time.LocalTime

interface Clock {
    fun now(): LocalTime
}