import shapes.*;
import java.util.*;


public class ShapeTester {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();

        shapes.add(ShapeFactory.createShape("circle", 5));
        shapes.add(ShapeFactory.createShape("rectangle", 5, 6));
        shapes.add(ShapeFactory.createShape("square", 5));
        shapes.add(ShapeFactory.createShape("triangle", 6, 8));

        for (Shape s : shapes) {
            System.out.println(s.getName() + " area: " +  String.format("%.2f", s.getArea()));
        }
    }
}

