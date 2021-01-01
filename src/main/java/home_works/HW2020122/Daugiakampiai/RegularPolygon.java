package home_works.HW2020122.Daugiakampiai;

public interface RegularPolygon {
    int getNumSides();

    double getSideLength();

    default double getPerimeter() {
        return getSideLength() * getNumSides();
    }

    default int getInteriorAngle() {
        return (getNumSides() - 2) * 180;
    }

}
