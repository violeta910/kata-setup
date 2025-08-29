import io.mockk.every
import io.mockk.mockk
import io.mockk.spyk
import io.mockk.verify
import org.example.Clock
import org.example.MorningRoutine
import org.example.Printer
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import java.time.LocalTime

class MorningRoutineShould {

    private lateinit var mourningRoutine: MorningRoutine
    private lateinit var printerSpy: Printer
    private lateinit var clockStub: Clock

    @BeforeEach
    fun setup(){
        clockStub = mockk<Clock>()
        printerSpy = spyk<Printer>()
        mourningRoutine = MorningRoutine(clockStub, printerSpy)
    }

    @Test
    fun `Given the current time is between 0600 and 0659 when I request the routine activity then the system should display 'Do exercise'`(){
        // arrange
        every { clockStub.now() } returns LocalTime.of(6, 30)

        // act
        mourningRoutine.whatShouldIDoNow()

        // assert
        verify { printerSpy.println("Do exercise")}
    }

    @Test
    fun `Given the current time is between 0700 and 0759 when I request the routine activity then the system should display 'Read and study'`(){
        // arrange
        every { clockStub.now() } returns LocalTime.of(7, 30)

        // act
        mourningRoutine.whatShouldIDoNow()

        // assert
        verify { printerSpy.println("Read and study")}
    }

    @Test
    fun `Given the current time is between 0800 and 0859 when I request the routine activity then the system should display 'Have breakfast'`(){
        // arrange
        every { clockStub.now() } returns LocalTime.of(8, 30)

        // act
        mourningRoutine.whatShouldIDoNow()

        // assert
        verify { printerSpy.println("Have breakfast")}
    }
}








