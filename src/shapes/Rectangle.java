package shapes;

class Rectangle extends Shape{
    private double myLength;
    private double myWidth;

    Rectangle(double theLength, double theWidth) {
        myLength = theLength;
        myWidth = theWidth;
    }

    @Override
    public double getArea() {
        return myLength * myWidth;
    }

    @Override
    public String getName() {
        return "Rectangle";
    }

}
