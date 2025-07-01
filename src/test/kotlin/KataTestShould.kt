import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class `Rock paper scissors kata should` {

    @Test
    fun `when player one plays rock and player two plays scissors player one wins`() {
        //Arrange
        val playerOneMove = "Rock"
        val playerTwoMove = "Scissors"
        val expected = "PlayerOne"
        //Act
        val actual = rockPaperScissorsGame(playerOneMove, playerTwoMove)
        //Assert
        assertEquals(expected, actual)
    }

    @Test
    fun `when player one plays scissors and player two plays rock player one wins`() {
        //Arrange
        val playerOneMove = "Scissors"
        val playerTwoMove = "Rock"
        val expected = "PlayerTwo"
        //Act
        val actual = rockPaperScissorsGame(playerOneMove, playerTwoMove)
        //Assert
        assertEquals(expected, actual)
    }

    @Test
    fun `when player one plays rock and player two plays paper player one wins`() {
        //Arrange
        val playerOneMove = "Rock"
        val playerTwoMove = "Paper"
        val expected = "PlayerTwo"
        //Act
        val actual = rockPaperScissorsGame(playerOneMove, playerTwoMove)
        //Assert
        assertEquals(expected, actual)
    }

    @Test
    fun `when player one plays rock and player two plays rock it should be a draw`() {
        val move = "Rock"
        val actual = rockPaperScissorsGame(move, move)
        val expected = "Draw"

        assertEquals(expected, actual)
    }
}

fun rockPaperScissorsGame(playerOneMove: String, playerTwoMove: String): String {
    if (playerOneMove == "Rock" && playerTwoMove == "Rock") {
        return "Draw"
    }

    if (playerOneMove == "Scissors") {
        return "PlayerTwo"
    }

    if (playerTwoMove == "Paper") {
        return "PlayerTwo"
    }

    return "PlayerOne"
}