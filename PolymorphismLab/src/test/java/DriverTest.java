import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import teamMembers.Driver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DriverTest {

    private Driver driver1;
    private Driver driver2;

    @BeforeEach
    public void setUp() {
        driver1 = new Driver("Charles Leclerc", "F1 Driver", true);
        driver2 = new Driver("Carlos Sainz", "F1 Driver", false);
    }

    @Test
    public void firstPlace__canReportPosition() {
        String expected = "The driver has finished first in the race";
        String actual = driver1.finishPosition("first");
        assertEquals(expected, actual);
    }

    @Test
    public void thirdPlace__canReportPosition() {
        String expected = "The driver has finished third in the race";
        String actual = driver2.finishPosition("third");
        assertEquals(expected, actual);
    }

    @Test
    public void true__canReturnRaceWin() {
        Boolean expected = true;
        Boolean actual = driver1.isRaceWon();
        assertEquals(expected, actual);
    }

    @Test
    public void false__canReturnRaceWin() {
        Boolean expected = false;
        Boolean actual = driver2.isRaceWon();
        assertEquals(expected, actual);
    }

    @Test
    public void pole__canReturnGridPosition() {
        String expected = "The driver has started the race in pole position on the grid";
        String actual = driver1.positionOnGrid("pole");
        assertEquals(expected, actual);
    }

    @Test
    public void fourth__canReturnGridPosition() {
        String expected = "The driver has started the race in fourth position on the grid";
        String actual = driver2.positionOnGrid("fourth");
        assertEquals(expected, actual);
    }

    @Test
    public void canReportTeamPointsMessage() {
        driver1.setTeamPoints(40);
        String expected = "In this race the Ferrari team has scored 40 points! ";
        String actual = driver1.teamPointsMessage("Ferrari");
        assertEquals(expected, actual);
    }

    @Test
    public void under147000__canReportPracticeFeedback() {
        String expected = "Practice lap time was 1:46.369 - the car is ready for qualifying!";
        String actual = driver1.practiceFeedback(1, 46, 369);
        assertEquals(expected, actual);
    }

    @Test
    public void over147000__canReportPracticeFeedback() {
        String expected = "Practice lap time was 1:48.867 - the car needs a lot of improvement..";
        String actual = driver2.practiceFeedback(1, 48, 867);
        assertEquals(expected, actual);
    }

}
