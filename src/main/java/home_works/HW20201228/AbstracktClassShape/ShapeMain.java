package home_works.HW20201228.AbstracktClassShape;

public class ShapeMain {
    public static void main(String[] args) {
        Circle circle = new Circle(3);
        System.out.println("Apskritimo plotas " + circle.plotas());
        System.out.println("Apskritimo ilgis " + circle.ilgis());
        RightAngleRectangle rightAngleRectangle = new RightAngleRectangle(4,5);
        System.out.println("Stataus trikampio plotas " + rightAngleRectangle.plotas());
        Rectangle rectangle = new Rectangle(2,3);
        System.out.println("Stataus trikampio plotas " + rectangle.plotas());
    }
}
