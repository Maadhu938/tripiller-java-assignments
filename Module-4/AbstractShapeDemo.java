// Shape.java
abstract class Shape {
    abstract double area();
    
    void display() {
        System.out.println("Area: " + area());
    }
}

// Circle.java
class Circle extends Shape {
    private double radius;
    
    Circle(double radius) {
        this.radius = radius;
    }
    
    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

// Rectangle.java
class Rectangle extends Shape {
    private double length;
    private double width;
    
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    @Override
    double area() {
        return length * width;
    }
}

// Main.java
public class AbstractShapeDemo {
    public static void main(String[] args) {
        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(4.0, 6.0);
        
        System.out.print("Circle ");
        circle.display();
        
        System.out.print("Rectangle ");
        rectangle.display();
    }
}