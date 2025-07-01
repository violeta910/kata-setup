package org.example


enum class Move {
    ROCK,
    SCISSORS,
    PAPER
}

enum class Result {
    ONE,
    TWO,
    DRAW
}

fun rockPaperScissorsGame(playerOneMove: String, playerTwoMove: String): Result {
    if (playerOneMove == "Rock" && playerTwoMove == "Scissors") {
        return Result.ONE
    }

    if (playerOneMove == "Scissors") {
        return Result.TWO
    }

    if (playerTwoMove == "Paper") {
        return Result.TWO
    }

    return Result.DRAW
}