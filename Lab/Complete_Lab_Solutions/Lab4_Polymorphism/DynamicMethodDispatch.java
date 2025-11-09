class ParentDMD {
    void show() {
        System.out.println("Parent's show method");
    }
}

class ChildDMD extends ParentDMD {
    @Override
    void show() {
        System.out.println("Child's show method");
    }
    
    void display() {
        System.out.println("Child's display method");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        ParentDMD obj = new ChildDMD(); // Parent reference, Child object
        obj.show(); // Calls Child's show method (runtime polymorphism)
        
        // obj.display(); // This would cause compile-time error
        // Parent reference cannot access Child-specific methods
    }
}