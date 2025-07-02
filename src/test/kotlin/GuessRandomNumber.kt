import org.example.GuessRandomNumberGame
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals


class `Guess random number should` {

    @Test
    fun `player wins on the first move`(){

        val game = GuessRandomNumberGame()
        val expected = "Win"

        val actual = game.guess(6)

        assertEquals(expected, actual)
    }

}