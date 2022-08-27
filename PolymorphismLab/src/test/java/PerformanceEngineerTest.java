import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import teamMembers.PerformanceEngineer;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PerformanceEngineerTest {

    private PerformanceEngineer performanceEngineer;

    @BeforeEach
    public void setUp() {
        performanceEngineer = new PerformanceEngineer("Jérôme Blanc", "Race Performance Engineer");
    }

    @Test
    public void under147000__canReportPracticeFeedback() {
        String expected = "Practice lap time was 1:45.507 - the car is ready for qualifying!";
        String actual = performanceEngineer.practiceFeedback(1, 45, 507);
        assertEquals(expected, actual);
    }

    @Test
    public void over147000__canReportPracticeFeedback() {
        String expected = "Practice lap time was 1:49.941 - the car needs a lot of improvement..";
        String actual = performanceEngineer.practiceFeedback(1, 49, 941);
        assertEquals(expected, actual);
    }

}
