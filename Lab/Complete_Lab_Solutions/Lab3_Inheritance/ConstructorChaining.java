class A {
    public A() {
        System.out.println("Class A constructor");
    }
}

class B extends A {
    public B() {
        super(); // Implicit call to super()
        System.out.println("Class B constructor");
    }
}

class C extends B {
    public C() {
        super(); // Implicit call to super()
        System.out.println("Class C constructor");
    }
}

public class ConstructorChaining {
    public static void main(String[] args) {
        C obj = new C();
    }
}