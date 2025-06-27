import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class `Rock paper scissor kata should` {

    @Test
    fun `when player one plays rock and player two plays scissors player one wins`() {
        //Arrange
        val playerOne = "Rock"
        val playerTwo = "Scissor"
        val expected = "PlayerOne"
        //Act
        val actual = rockPaperScissorsGame(playerOne, playerTwo)
        //Assert
        assertEquals(expected, actual)
    }

    @Test
    fun `when player one plays scissors and player two plays rock player one two`() {
        //Arrange
        val playerOne = "Scissor"
        val playerTwo = "Rock"
        val expected = "PlayerTwo"
        //Act
        val actual = rockPaperScissorsGame(playerOne, playerTwo)
        //Assert
        assertEquals(expected, actual)
    }
}

fun rockPaperScissorsGame(playerOne: String, playerTwo: String): String {
    return "PlayerOne"
}