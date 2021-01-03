package home_works.HW20201228.AbstracktClassShape;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    @Override
    public double ilgis() {
        return radius * radius * 3.14;
    }
    @Override
    public double plotas() {
        return radius*2*3.14;
    }
}

