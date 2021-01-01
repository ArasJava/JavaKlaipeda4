package home_works.HW2020122.Daugiakampiai;

public class RegularPolygonMain {
    public static void main(String[] args) {
        Square square = new Square(2.5);
        EquilateralTriangle equilateralTriangle = new EquilateralTriangle(2.5);
        System.out.println("Keturkampio");
        System.out.println("Kampu skaicius: " + square.getNumSides());
        System.out.println("Krastines ilgis: " + square.getSideLength());
        System.out.println("Perimetras: " + square.getPerimeter());
        System.out.println("Plotas: " + square.getSideLength()*square.getSideLength());
        System.out.println("Vidiniu kampu suma: " + square.getInteriorAngle());
        System.out.println();
        System.out.println("Lygiakrascio trikampio");
        System.out.println("Kampu skaicius: " + equilateralTriangle.getNumSides());
        System.out.println("Krastines ilgis: " + equilateralTriangle.getSideLength());
        System.out.println("Perimetras: " + equilateralTriangle.getPerimeter());
        System.out.println("Plotas: " + equilateralTriangle.getSideLength()*equilateralTriangle.getSideLength()*Math.sqrt(3)/4);
        System.out.println("Vidiniu kampu suma: " + equilateralTriangle.getInteriorAngle());
    }
}
