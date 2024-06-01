package org.basics.solid;

/**
 *  (Open / Closed Principle)
 *  Bir sınıf, genişletmeye açık ancak değiştirmeye kapalı olmalıdır.
 *  Bu prensip, yeni işlevsellik eklemek için mevcut kodu değiştirmek yerine mevcut kodu genişletmeyi teşvik eder.
 */

interface Shape {
    double area();
}

class Rectangle implements Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

public class AreaCalculator {
    public double calculateTotalArea(Shape[] shapes) {
        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.area();
        }
        return totalArea;
    }
}

