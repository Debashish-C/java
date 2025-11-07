package package1;

public class ClassA {
    public int pub = 1;
    protected int pro = 2;
    int def = 3; // default
    private int pri = 4;

    public void show() {
        System.out.println("Public: " + pub);
        System.out.println("Protected: " + pro);
        System.out.println("Default: " + def);
        System.out.println("Private: " + pri);
    }
}
