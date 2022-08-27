import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import racingTeam.RacingTeam;
import teamMembers.Driver;
import teamMembers.TeamMember;
import teamMembers.TeamPrincipal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RacingTeamTest {

    private RacingTeam team1;

    @BeforeEach
    public void setUp() {
        team1 = new RacingTeam("Ferrari");
    }

    @Test
    public void canAddTeamMember() {
        TeamMember driver1 = new Driver("Charles Leclerc", "F1 Driver", true);
        team1.addTeamMember(driver1);
        Integer expected = 1;
        Integer actual = team1.countTeamMembers();
        assertEquals(expected, actual);
    }

    @Test
    public void canAddMultipleTeamMembers() {
        TeamMember driver1 = new Driver("Charles Leclerc", "F1 Driver", true);
        TeamMember driver2 = new Driver("Carlos Sainz", "F1 Driver", false);
        TeamMember teamPrinciple = new TeamPrincipal("Mattia Binotto", "Team Principal");
        team1.addTeamMember(driver1);
        team1.addTeamMember(driver2);
        team1.addTeamMember(teamPrinciple);
        Integer expected = 3;
        Integer actual = team1.countTeamMembers();
        assertEquals(expected, actual);
    }

    @Test
    public void drivers__canCalculateTeamPoints() {
        TeamMember driver1 = new Driver("Charles Leclerc", "F1 Driver", true);
        TeamMember driver2 = new Driver("Carlos Sainz", "F1 Driver", false);
        team1.addTeamMember(driver1);
        team1.addTeamMember(driver2);
        driver1.setDriverPoints(25);
        driver2.setDriverPoints(15);
        Integer expected = 40;
        Integer actual = team1.calculateTeamPoints();
        assertEquals(expected, actual);
    }

    @Test
    public void teamPrincipal__canCalculateTeamPoints() {
        TeamMember driver1 = new Driver("Charles Leclerc", "F1 Driver", true);
        TeamMember driver2 = new Driver("Carlos Sainz", "F1 Driver", false);
        TeamMember teamPrinciple = new TeamPrincipal("Mattia Binotto", "Team Principal");
        team1.addTeamMember(driver1);
        team1.addTeamMember(driver2);
        team1.addTeamMember(teamPrinciple);
        driver1.setDriverPoints(25);
        driver2.setDriverPoints(0);
        Integer expected = 25;
        Integer actual = team1.calculateTeamPoints();
        assertEquals(expected, actual);
    }

}
