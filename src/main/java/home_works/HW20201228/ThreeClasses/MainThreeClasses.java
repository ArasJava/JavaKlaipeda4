package home_works.HW20201228.ThreeClasses;

public class MainThreeClasses {
    public static void main(String[] args) {
        Person person = new Person("Jonas");
        System.out.println(person.getName());
        Developer developer = new Developer( + 1);
        System.out.println("Has " + developer.getAgeOfExperience() + " year of Experience.");
        JavaDeveloper javaDeveloper = new JavaDeveloper();
        //Overload method
        JavaDeveloper javaDeveloper1 = new JavaDeveloper("And he is learning!");

    }
}
