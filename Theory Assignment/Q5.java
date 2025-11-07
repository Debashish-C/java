class Vehicle {
    String brand;

    Vehicle(String brand) {
        this.brand = brand;
        System.out.println("Vehicle constructor called");
    }

    void displayInfo() {
        System.out.println("Brand: " + brand);
    }
}

class Car extends Vehicle {
    String model;

    Car(String brand, String model) {
        super(brand); // constructor chaining
        this.model = model;
        System.out.println("Car constructor called");
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Model: " + model);
    }
}

class ElectricCar extends Car {
    int batteryCapacity;

    ElectricCar(String brand, String model, int batteryCapacity) {
        super(brand, model);
        this.batteryCapacity = batteryCapacity;
        System.out.println("ElectricCar constructor called");
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }
}

public class Q5 {
    public static void main(String[] args) {
        ElectricCar e = new ElectricCar("Tesla", "Model S", 100);
        e.displayInfo();
    }
}
