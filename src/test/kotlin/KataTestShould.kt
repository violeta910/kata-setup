import org.example.Result
import org.example.rockPaperScissorsGame
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals


class `Rock paper scissors kata should` {

    @Test
    fun `when player one plays rock and player two plays scissors player one wins`() {
        //Arrange
        val playerOneMove = "Rock"
        val playerTwoMove = "Scissors"
        //Act
        val actual = rockPaperScissorsGame(playerOneMove, playerTwoMove)
        //Assert
        assertEquals(Result.ONE, actual)
    }

    @Test
    fun `when player one plays scissors and player two plays rock player two wins`() {
        //Arrange
        val playerOneMove = "Scissors"
        val playerTwoMove = "Rock"
        //Act
        val actual = rockPaperScissorsGame(playerOneMove, playerTwoMove)
        //Assert
        assertEquals(Result.TWO, actual)
    }

    @Test
    fun `when player one plays rock and player two plays paper player one wins`() {
        //Arrange
        val playerOneMove = "Rock"
        val playerTwoMove = "Paper"
        //Act
        val actual = rockPaperScissorsGame(playerOneMove, playerTwoMove)
        //Assert
        assertEquals(Result.TWO, actual)
    }

    @Test
    fun `when player one plays rock and player two plays rock it should be a draw`() {
        val move = "Rock"
        val actual = rockPaperScissorsGame(move, move)
        assertEquals(Result.DRAW, actual)
    }
}