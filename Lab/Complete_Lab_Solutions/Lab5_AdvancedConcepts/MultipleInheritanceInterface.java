interface WalkableMI {
    void walk();
}

interface RunnableMI2 {
    void run();
}

interface SwimmableMI {
    void swim();
}

// Multiple inheritance through interfaces
class AthleteMI2 implements WalkableMI, RunnableMI2, SwimmableMI {
    private String name;
    
    public AthleteMI2(String name) {
        this.name = name;
    }
    
    @Override
    public void walk() {
        System.out.println(name + " is walking");
    }
    
    @Override
    public void run() {
        System.out.println(name + " is running");
    }
    
    @Override
    public void swim() {
        System.out.println(name + " is swimming");
    }
    
    public void compete() {
        System.out.println(name + " is competing in triathlon");
        walk();
        run();
        swim();
    }
}

public class MultipleInheritanceInterface {
    public static void main(String[] args) {
        AthleteMI2 athlete = new AthleteMI2("John");
        athlete.compete();
    }
}