class ParentO {
    // Method overloading examples
    void display(int a) {
        System.out.println("Parent display(int): " + a);
    }
    
    void display(String s) {
        System.out.println("Parent display(String): " + s);
    }
    
    void show() {
        System.out.println("Parent show()");
    }
}

class ChildO extends ParentO {
    // Method overriding
    @Override
    void show() {
        System.out.println("Child show() - Overridden method");
    }
    
    // Method overloading in child class
    void display(double d) {
        System.out.println("Child display(double): " + d);
    }
}

public class OverloadingVsOverriding {
    public static void main(String[] args) {
        ChildO child = new ChildO();
        
        System.out.println("=== Method Overloading Examples ===");
        child.display(10);        // From Parent
        child.display("Hello");   // From Parent  
        child.display(5.5);       // From Child
        
        System.out.println("\n=== Method Overriding Examples ===");
        ParentO parentRef = new ChildO();
        parentRef.show(); // Calls Child's overridden method
    }
}