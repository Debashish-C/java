class ShapeHI {
    void display() {
        System.out.println("This is a shape");
    }
}

class Square extends ShapeHI {
    double side;
    
    public Square(double side) {
        this.side = side;
    }
    
    double area() {
        return side * side;
    }
}

class Rectangle extends ShapeHI {
    double length, width;
    
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    double area() {
        return length * width;
    }
}

class Triangle extends ShapeHI {
    double base, height;
    
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    
    double area() {
        return 0.5 * base * height;
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Square square = new Square(5);
        Rectangle rectangle = new Rectangle(4, 6);
        Triangle triangle = new Triangle(3, 4);
        
        square.display();
        System.out.println("Square Area: " + square.area());
        
        rectangle.display();
        System.out.println("Rectangle Area: " + rectangle.area());
        
        triangle.display();
        System.out.println("Triangle Area: " + triangle.area());
    }
}