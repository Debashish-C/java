class Counter {
    static int count = 0; // Static variable
    
    public Counter() {
        count++; // Increment count each time object is created
    }
    
    // Static method
    public static void displayCount() {
        System.out.println("Total objects created: " + count);
    }
    
    // Instance method
    public void displayInstanceInfo() {
        System.out.println("This is instance " + count);
    }
}

public class StaticDemo {
    public static void main(String[] args) {
        Counter.displayCount(); // Calling static method without object
        
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        
        Counter.displayCount(); // Static method call
        
        c1.displayInstanceInfo();
        c2.displayInstanceInfo();
        c3.displayInstanceInfo();
    }
}