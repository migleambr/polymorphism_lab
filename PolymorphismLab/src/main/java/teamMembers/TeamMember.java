package teamMembers;

import interfaces.IImproveCar;

public abstract class TeamMember implements IImproveCar {

    private String name;
    private String role;
    private Integer teamPoints;
    private Integer driverPoints;
    private String carImprovement;

    // setting up the constructor

    public TeamMember(String name, String role) {
        this.name = name;
        this.role = role;
        this.teamPoints = 0;
        this.driverPoints = 0;
    }

    // setting up methods

    public String teamPointsMessage(String teamName) {
        return String.format("In this race the %s team has scored %d points! ", teamName, teamPoints);
    }

    public String practiceFeedback(Integer min, Integer sec, Integer millis) {
        if (sec <= 47) {
            carImprovement = String.format("Practice lap time was %d:%d.%d - the car is ready for qualifying!", min, sec, millis);
        } else {
            carImprovement = String.format("Practice lap time was %d:%d.%d - the car needs a lot of improvement..", min, sec, millis);;
        }
        return carImprovement;
    }

    // initialising getters & setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Integer getTeamPoints() {
        return teamPoints;
    }

    public void setTeamPoints(Integer teamPoints) {
        this.teamPoints = teamPoints;
    }

    public Integer getDriverPoints() {
        return driverPoints;
    }

    public void setDriverPoints(Integer driverPoints) {
        this.driverPoints = driverPoints;
    }

}
