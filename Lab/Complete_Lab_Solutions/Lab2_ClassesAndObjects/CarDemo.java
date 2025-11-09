class Car {
    String brand;
    String model;
    int year;
    double price;
    
    // Default constructor
    public Car() {
        this.brand = "Unknown";
        this.model = "Unknown";
        this.year = 0;
        this.price = 0.0;
    }
    
    // Constructor with brand and model
    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.year = 2023;
        this.price = 0.0;
    }
    
    // Constructor with all parameters
    public Car(String brand, String model, int year, double price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
    }
    
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: $" + price);
        System.out.println("-------------------");
    }
}

public class CarDemo {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car("Toyota", "Camry");
        Car car3 = new Car("Honda", "Civic", 2022, 25000);
        
        car1.displayInfo();
        car2.displayInfo();
        car3.displayInfo();
    }
}