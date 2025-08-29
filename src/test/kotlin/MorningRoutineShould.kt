import io.mockk.every
import io.mockk.mockk
import io.mockk.spyk
import io.mockk.verify
import org.example.Clock
import org.example.MorningRoutine
import org.example.Printer
import org.junit.jupiter.api.Test
import java.time.LocalTime

class MorningRoutineShould {

    @Test
    fun `Given the current time is between 0600 and 0659 when I request the routine activity then the system should display 'Do exercise'`(){
        // arrange
        val clockStub = mockk<Clock>()
        val printerSpy = spyk<Printer>()
        val mourningRoutine = MorningRoutine(clockStub, printerSpy)

        every { clockStub.now() } returns LocalTime.of(6, 30)

        // act
        mourningRoutine.whatShouldIDoNow()

        // assert
        verify { printerSpy.println("Do exercise")}
    }

    @Test
    fun `Given the current time is between 0700 and 0759 when I request the routine activity then the system should display 'Read and study'`(){
        // arrange
        val clockStub = mockk<Clock>()
        val printerSpy = spyk<Printer>()
        val mourningRoutine = MorningRoutine(clockStub, printerSpy)

        every { clockStub.now() } returns LocalTime.of(7, 30)

        // act
        mourningRoutine.whatShouldIDoNow()

        // assert
        verify { printerSpy.println("Read and study")}
    }

    @Test
    fun `Given the current time is between 0800 and 0859 when I request the routine activity then the system should display 'Have breakfast'`(){
        // arrange
        val clockStub = mockk<Clock>()
        val printerSpy = spyk<Printer>()
        val mourningRoutine = MorningRoutine(clockStub, printerSpy)

        every { clockStub.now() } returns LocalTime.of(8, 30)

        // act
        mourningRoutine.whatShouldIDoNow()

        // assert
        verify { printerSpy.println("Have breakfast")}
    }
}








