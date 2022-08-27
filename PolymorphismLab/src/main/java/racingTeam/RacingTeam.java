package racingTeam;

import teamMembers.Driver;
import teamMembers.TeamMember;

import java.util.ArrayList;

public class RacingTeam {

    private String name;
    private ArrayList<TeamMember> team;

    // setting up the constructor

    public RacingTeam(String name) {
        this.name = name;
        this.team = new ArrayList<>();
    }

    // initialising getters & setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<TeamMember> getTeam() {
        return team;
    }

    public void setTeam(ArrayList<TeamMember> team) {
        this.team = team;
    }

    // setting up methods

    public void addTeamMember(TeamMember member) {
        this.team.add(member);
    }

    public Integer countTeamMembers(){
        return this.team.size();
    }

    public Integer calculateTeamPoints() {
        Integer teamPoints = 0;
        for (TeamMember member : team) {
            teamPoints += member.getDriverPoints();
        }
        return teamPoints;
    }

}
