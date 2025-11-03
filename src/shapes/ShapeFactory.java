package shapes;

public class ShapeFactory {

    private static final int DEFAULT_RADIUS = 0;

    public static Shape createShape(String type, double... params) {
        switch (type.toLowerCase()) {
            case "circle":
                return new Circle(params[0]);
            case "rectangle":
                return new Rectangle(params[0], params[1]);
            case "square":
                return new Rectangle(params[0], params[0]);
            case "triangle":
                return new Triangle(params[0], params[1]);
            default:
                return new Circle(DEFAULT_RADIUS);
        }
    }
}