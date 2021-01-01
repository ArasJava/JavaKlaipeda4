package home_works.HW2020122.Daugiakampiai;

public class EquilateralTriangle implements RegularPolygon {
    private double length;

    public EquilateralTriangle(double length) {
        this.length = length;
    }

    @Override
    public int getNumSides() {
        return 3;
    }
    @Override
    public  double getSideLength() {
        return length;
    }
}
