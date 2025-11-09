package pack1;

public class ClassA {
    public int publicVar = 1;
    protected int protectedVar = 2;
    int defaultVar = 3; // package-private
    private int privateVar = 4;

    public void display() {
        System.out.println("Public: " + publicVar);
        System.out.println("Protected: " + protectedVar);
        System.out.println("Default: " + defaultVar);
        System.out.println("Private: " + privateVar);
    }

    protected void show() {
        System.out.println("Protected method from ClassA");
    }

    void defaultMethod() {
        System.out.println("Default method from ClassA");
    }
}