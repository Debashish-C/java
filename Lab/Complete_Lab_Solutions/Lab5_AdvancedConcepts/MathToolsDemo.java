import utility.MathTools;

public class MathToolsDemo {
    public static void main(String[] args) {
        int number = 7;
        
        System.out.println("Factorial of " + number + " is: " + MathTools.factorial(number));
        System.out.println(number + " is prime: " + MathTools.isPrime(number));
        
        System.out.println("\nPrime numbers between 1 and 20:");
        for (int i = 1; i <= 20; i++) {
            if (MathTools.isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}