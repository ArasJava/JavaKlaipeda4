package home_works.HW20201228.ThreeClasses;

public class Developer extends Person {
    private int ageOfExperience;

    public Developer(int ageOfExperience) {
        super();
        this.ageOfExperience = ageOfExperience;
    }

    public Developer() {
    }

    public int getAgeOfExperience() {
        return ageOfExperience;
    }
}
