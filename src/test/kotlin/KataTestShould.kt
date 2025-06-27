import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class `Rock paper scissor kata should` {

    @Test
    fun `when player one plays rock and player two plays scissors player one wins`() {
        //Arrange
        val playerOneMove = "Rock"
        val playerTwoMove = "Scissor"
        val expected = "PlayerOne"
        //Act
        val actual = rockPaperScissorsGame(playerOneMove, playerTwoMove)
        //Assert
        assertEquals(expected, actual)
    }

    @Test
    fun `when player one plays scissors and player two plays rock player one two`() {
        //Arrange
        val playerOneMove = "Scissor"
        val playerTwoMove = "Rock"
        val expected = "PlayerTwo"
        //Act
        val actual = rockPaperScissorsGame(playerOneMove, playerTwoMove)
        //Assert
        assertEquals(expected, actual)
    }
}

fun rockPaperScissorsGame(playerOneMove: String, playerTwoMove: String): String {
    if (playerOneMove == "Scissor") {
        return "PlayerTwo"
    }
    return "PlayerOne"
}