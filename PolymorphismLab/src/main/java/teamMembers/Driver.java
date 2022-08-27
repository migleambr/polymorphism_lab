package teamMembers;

import interfaces.IImproveCar;

public class Driver extends TeamMember implements IImproveCar {

    private boolean raceWin;

    // setting up the constructor

    public Driver(String name, String role, boolean raceWin) {
        super(name, role);
        this.raceWin = raceWin;
    }

    // setting up methods

    public String finishPosition(String position) {
        return String.format("The driver has finished %s in the race", position);
    }

    public String positionOnGrid(String gridPosition) {
        return String.format("The driver has started the race in %s position on the grid", gridPosition);
    }

    // initialising getters & setters

    public boolean isRaceWon() {
        return raceWin;
    }

    public void setRaceWin(boolean raceWin) {
        this.raceWin = raceWin;
    }

}
