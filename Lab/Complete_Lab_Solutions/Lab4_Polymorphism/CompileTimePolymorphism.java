class CalculatorCT {
    // Method overloading - same name, different parameters
    int add(int a, int b) {
        return a + b;
    }
    
    double add(double a, double b) {
        return a + b;
    }
    
    int add(int a, int b, int c) {
        return a + b + c;
    }
    
    String add(String a, String b) {
        return a + b;
    }
}

public class CompileTimePolymorphism {
    public static void main(String[] args) {
        CalculatorCT calc = new CalculatorCT();
        
        System.out.println("Integer addition: " + calc.add(5, 10));
        System.out.println("Double addition: " + calc.add(5.5, 10.5));
        System.out.println("Three numbers: " + calc.add(5, 10, 15));
        System.out.println("String concatenation: " + calc.add("Hello", " World"));
    }
}