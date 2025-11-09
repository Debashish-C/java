package pack2;

import pack1.ClassA;

public class B extends ClassA {
    public void test() {
        ClassA obj = new ClassA();
        obj.display(); // Public method accessible

        // obj.show(); // Protected not accessible via object reference from another package
        // obj.defaultMethod(); // Default not accessible from another package

        // But protected is accessible through inheritance
        show();

        // Using inherited public method
        display();
    }

    public static void main(String[] args) {
        B b = new B();
        b.test();
    }
}