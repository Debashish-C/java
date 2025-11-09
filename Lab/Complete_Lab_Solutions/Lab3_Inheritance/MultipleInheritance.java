interface Walkable {
    void walk();
}

interface RunnableMI {
    void run();
}

// Multiple inheritance achieved through interfaces
class AthleteMI implements Walkable, RunnableMI {
    @Override
    public void walk() {
        System.out.println("Athlete is walking");
    }
    
    @Override
    public void run() {
        System.out.println("Athlete is running");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        AthleteMI athlete = new AthleteMI();
        athlete.walk();
        athlete.run();
    }
}