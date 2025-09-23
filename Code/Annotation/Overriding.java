package Annotation;

class A {
    public void show() {
        System.out.println("Show");
    }
}

public class Overriding extends A {
    @Override
    public void show() {
        System.out.println("Showwwing");
    }

    public static void main(String[] args) {
        System.out.println("Heloo World!!!");
    }
}
