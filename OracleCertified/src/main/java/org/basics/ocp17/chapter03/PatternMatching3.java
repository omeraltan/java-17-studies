package org.basics.ocp17.chapter03;

sealed interface Shape permits Circle, Rectangle, Square, Triangle {}
record Circle(double radius) implements Shape {}
record Rectangle(double width, double height) implements Shape {}
record Square(double side) implements Shape {}
record Triangle(double base, double height) implements Shape {}

public class Example4 {

    public static void main(String[] args) {
        printArea(new Circle(3));
        printArea(new Rectangle(4,5));
        printArea(new Square(6));
    }

    public static void printArea(Shape shape){
        switch (shape){
            case Circle c -> System.out.println("Area of circle: " + (Math.PI * c.radius() * c.radius()));
            case Rectangle r -> System.out.println("Area of rectangle: " + (r.width() * r.height()));
            case Square s -> System.out.println("Area of square: " + (s.side() * s.side()));
            default -> throw new IllegalStateException("Unexpected value: " + shape);
        }
    }

}

/**
 *
 * Eğer Shape sealed olmasaydı ve biz tüm olasılıkları yazmasaydık:
 * O zaman Java compile error verir çünkü bu özellik Java’nın type-safety yaklaşımının önemli bir parçasıdır.
 *
 */
