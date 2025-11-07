package package2;
import package1.ClassA;

public class ClassB extends ClassA {
    public void accessDemo() {
        System.out.println("Public: " + pub);   // ✅ Accessible
        System.out.println("Protected: " + pro); // ✅ via inheritance
        // System.out.println(def);   ❌ Not accessible (different package)
        // System.out.println(pri);   ❌ Not accessible (private)
    }
}
