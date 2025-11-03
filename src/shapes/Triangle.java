package shapes;

class Triangle extends Shape {
    private double myLength;
    private double myWidth;

    Triangle(double theLength, double theWidth) {
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
