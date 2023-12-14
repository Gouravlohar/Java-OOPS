interface Shape {
    double getArea();
}

class Triangle implements Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }
}

class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(5, 8);
        Rectangle rectangle = new Rectangle(4, 6);
        Circle circle = new Circle(3);

        System.out.println("Area of Triangle: " + triangle.getArea());
        System.out.println("Area of Rectangle: " + rectangle.getArea());
        System.out.println("Area of Circle: " + circle.getArea());
    }
}
