package shapes;

public class ShapeFactory {

    private static final int DEFAULT_RADIUS = 0;

    public static Shape createShape(String type, double... params) {
        return switch (type.toLowerCase()) {
            case "circle" -> new Circle(params[0]);
            case "rectangle" -> new Rectangle(params[0], params[1]);
            case "square" -> new Rectangle(params[0], params[0]);
            case "triangle" -> new Triangle(params[0], params[1]);
            default -> new Circle(DEFAULT_RADIUS);
        };
    }
}