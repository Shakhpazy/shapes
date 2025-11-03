package shapes;

public class Rectangle extends Shape{
    private double length;
    private double width;

    public Rectangle(double theLength, double theWidth) {
        length = theLength;
        width = theWidth;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public String getName() {
        return "Rectangle";
    }

}
