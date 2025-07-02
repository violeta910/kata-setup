import io.mockk.every
import io.mockk.mockk
import org.example.GuessRandomNumberGame
import org.example.org.example.RandomNumberGenerator
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals


class `Guess random number should` {

    @Test
    fun `player wins on the first move`(){

        val stubRandomNumberGenerator = mockk<RandomNumberGenerator>()
        val game = GuessRandomNumberGame(stubRandomNumberGenerator)
        val expected = "Win"

        val actual = game.guess(6)

        assertEquals(expected, actual)
    }

    @Test
    fun `player not wins on the first attempt because the random number is higher`() {
        val stubRandomNumberGenerator = mockk<RandomNumberGenerator>()
        every { stubRandomNumberGenerator.generate() } returns 6

        val game = GuessRandomNumberGame(stubRandomNumberGenerator)
        val expected = "Higher"

        val actual = game.guess(3)

        assertEquals(expected, actual)
    }

}