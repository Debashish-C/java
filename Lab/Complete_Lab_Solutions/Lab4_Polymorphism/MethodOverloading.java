class AreaCalculator {
    // Calculate area of circle
    double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }
    
    // Calculate area of square
    double calculateArea(double side, String shape) {
        if (shape.equalsIgnoreCase("square")) {
            return side * side;
        }
        return 0;
    }
    
    // Calculate area of rectangle
    double calculateArea(double length, double width) {
        return length * width;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        AreaCalculator calculator = new AreaCalculator();
        
        System.out.println("Circle Area: " + calculator.calculateArea(5.0));
        System.out.println("Square Area: " + calculator.calculateArea(4.0, "square"));
        System.out.println("Rectangle Area: " + calculator.calculateArea(4.0, 6.0));
    }
}