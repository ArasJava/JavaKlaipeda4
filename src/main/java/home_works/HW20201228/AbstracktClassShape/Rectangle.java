package home_works.HW20201228.AbstracktClassShape;

public class Rectangle extends RightAngleRectangle {
    private double width;
    private double height;

    public Rectangle (double width, double height) {
        super();
        this.width = width;
        this.height = height;
    }
    @Override
    public double plotas() {
        return width*height;
    }
}
