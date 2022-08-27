package teamMembers;

import interfaces.IImproveCar;

public class PerformanceEngineer implements IImproveCar {

    private String name;
    private String position;
    private String carImprovement;

    // setting up the constructor

    public PerformanceEngineer(String name, String position){
        this.name = name;
        this.position = position;
    }

    // setting up methods

    public String practiceFeedback(Integer min, Integer sec, Integer millis) {
        if (sec <= 47) {
            carImprovement = String.format("Practice lap time was %d:%d.%d - the car is ready for qualifying!", min, sec, millis);
        } else {
            carImprovement = String.format("Practice lap time was %d:%d.%d - the car needs a lot of improvement..", min, sec, millis);;
        }
        return carImprovement;
    }

}
