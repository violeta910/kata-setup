import kotlin.random.Random
import kotlin.test.Test
import kotlin.test.assertTrue

/**
 * https://raniz85.github.io/tdd-katas/dice-game/index.html
 */

class DiceGameShould {

    /**
     * Implement a simple dice game
     * Implement a dice game with one dice (1 of 6 sides).
     * The game consists of 3 throws, a player's score is the sum of all dice values thrown.
     */

    @Test
    fun `when player throws dice three times then the score is the sum of all values thrown`() {
        // Act
        val result = throwDiceThreeTimes()

        // Assert
        assertTrue(3 <= result && result <= 18, "Score should be between 3 and 18")
    }

    private fun throwDiceThreeTimes(): Int {
        val throwFirstResult = Random.nextInt(1, 7)
        val throwSecondResult = Random.nextInt(1, 7)
        val throwThirdResult = Random.nextInt(1, 7)

        return throwFirstResult + throwSecondResult + throwThirdResult
    }

}