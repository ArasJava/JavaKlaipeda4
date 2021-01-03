package home_works.HW20201228.AbstracktClassShape;

import advanced.interfaces.example1.Shape;

public class RightAngleRectangle extends Circle {
    private double width;
    private double height;

    public RightAngleRectangle (double width, double height) {
        super();
        this.width = width;
        this.height = height;
    }

    public RightAngleRectangle() {

    }

    @Override
    public double plotas() {
        return (width*height)/2;
    }
}
