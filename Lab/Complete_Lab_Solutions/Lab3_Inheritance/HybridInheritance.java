interface AHI {
    void methodA();
}

interface BHI {
    void methodB();
}

interface CHI extends AHI, BHI {
    void methodC();
}

class Base {
    void baseMethod() {
        System.out.println("Base class method");
    }
}

class Derived extends Base implements CHI {
    @Override
    public void methodA() {
        System.out.println("Method A");
    }
    
    @Override
    public void methodB() {
        System.out.println("Method B");
    }
    
    @Override
    public void methodC() {
        System.out.println("Method C");
    }
}

public class HybridInheritance {
    public static void main(String[] args) {
        Derived obj = new Derived();
        obj.baseMethod();
        obj.methodA();
        obj.methodB();
        obj.methodC();
    }
}