package shapes;

class Circle extends Shape {
    private double myRadius;

    Circle(double theRadius) {
        myRadius = theRadius;
    }

    public double getArea() {
        return myRadius * myRadius * Math.PI;
    }

    public String getName() {
        return "Circle";
    }


}
