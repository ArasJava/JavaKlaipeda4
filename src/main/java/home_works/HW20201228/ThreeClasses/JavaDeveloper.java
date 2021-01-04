package home_works.HW20201228.ThreeClasses;

public class JavaDeveloper extends Developer {
    private String learning;

    public JavaDeveloper() {
        super();
        System.out.println("He is Java developer !");
    }

    public JavaDeveloper(String learning) {
        System.out.println(learning);
    }
}
