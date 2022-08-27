import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import teamMembers.TeamPrincipal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TeamPrincipalTest {

    private TeamPrincipal teamPrincipal;

    @BeforeEach
    public void setUp() {
        teamPrincipal = new TeamPrincipal("Mattia Binotto", "Team Principal");
    }

    @Test
    public void over6__canReportPerformance() {
        String expected = "Congratulations, the team has performed very well!";
        String actual = teamPrincipal.teamPerformance(18);
        assertEquals(expected, actual);
    }

    @Test
    public void under6__canReportPerformance() {
        String expected = "The team has performed poorly - will try again next race!";
        String actual = teamPrincipal.teamPerformance(4);
        assertEquals(expected, actual);
    }

    @Test
    public void inputMessage__canReportPerformance() {
        String expected = "Well done, team!";
        String actual = teamPrincipal.teamPerformance("Well done, team!");
        assertEquals(expected, actual);
    }

    @Test
    public void canReportTeamPointsMessage() {
        teamPrincipal.setTeamPoints(40);
        String expected = "In this race the Ferrari team has scored 40 points! ";
        String actual = teamPrincipal.teamPointsMessage("Ferrari");
        assertEquals(expected, actual);
    }

    @Test
    public void under147000__canReportPracticeFeedback() {
        String expected = null;
        String actual = teamPrincipal.practiceFeedback(1, 46, 369);
        assertEquals(expected, actual);
    }

}
