package shapes;

public class Triangle extends Shape {
    private double myLength;
    private double myWidth;

    public Triangle(double theLength, double theWidth) {
        myLength = theLength;
        myWidth = theWidth;
    }

    @Override
    public double getArea() {
        return myLength * myWidth * 0.5;
    }

    @Override
    public String getName() {
        return "Triangle";
    }
}
