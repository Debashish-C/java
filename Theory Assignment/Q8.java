class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    float add(float a, float b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    void displayType() {
        System.out.println("Basic Calculator");
    }
}

class ScientificCalculator extends Calculator {
    @Override
    void displayType() {
        System.out.println("Scientific Calculator");
    }

    double power(double base, double exp) {
        return Math.pow(base, exp);
    }
}

public class Q8 {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println("Int Add: " + c.add(2, 3));
        System.out.println("Float Add: " + c.add(2.5f, 3.2f));
        System.out.println("Double Add: " + c.add(2.5, 3.5));
        c.displayType();

        ScientificCalculator sc = new ScientificCalculator();
        sc.displayType();
        System.out.println("Power: " + sc.power(2, 3));
    }
}
