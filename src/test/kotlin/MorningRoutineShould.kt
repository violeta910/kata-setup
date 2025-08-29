import io.mockk.every
import io.mockk.mockk
import io.mockk.spyk
import io.mockk.verify
import org.example.Clock
import org.example.MorningRoutine
import org.example.Printer
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
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

    @ParameterizedTest
    @CsvSource(
        "6, Do exercise",
        "7, Read and study",
        "8, Have breakfast",
    )
    fun `Given the current time is between x and x59 when I request the routine activity then the system should display the current activity`(hour: Int, activity: String){
        // arrange
        every { clockStub.now() } returns LocalTime.of(hour, 30)

        // act
        mourningRoutine.whatShouldIDoNow()

        // assert
        verify { printerSpy.println(activity)}
    }
}








