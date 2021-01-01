package home_works.HW2020122.Daugiakampiai;

public class Square implements RegularPolygon{
    private double length;


    public Square(double length) {
       this.length = length;
    }

    @Override
    public int getNumSides() {
        return 4;
    }

    @Override
    public double getSideLength() {
        return length;
    }
}
