package teamMembers;

public class TeamPrincipal extends TeamMember {

    private String teamPerformance;

    // setting up the constructor

    public TeamPrincipal(String name, String role) {
        super(name, role);
    }

    // setting up methods

    public String teamPerformance(Integer points) {
        if (points >= 6) {
            teamPerformance = "Congratulations, the team has performed very well!";
        } else {
            teamPerformance = "The team has performed poorly - will try again next race!";
        }
        return teamPerformance;
    }

    public String teamPerformance(String message) {
        return String.format(message);
    }

    @Override
    public String practiceFeedback(Integer min, Integer sec, Integer millis) {
        return null;
    }

}
