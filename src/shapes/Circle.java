package shapes;

public class Circle extends Shape {
    private double myRadius;

    public Circle(double theRadius) {
        myRadius = theRadius;
    }

    public double getArea() {
        return myRadius * myRadius * Math.PI;
    }

    public String getName() {
        return "Circle";
    }


}
