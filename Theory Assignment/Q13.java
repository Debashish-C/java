import utils.math.PrimeTools;

class AdvancedPrime extends PrimeTools {
    void checkNumber(int n) {
        if (isPrime(n))
            System.out.println(n + " is Prime.");
        else
            System.out.println(n + " is Not Prime.");
    }
}

public class Q13 {
    public static void main(String[] args) {
        AdvancedPrime ap = new AdvancedPrime();
        ap.checkNumber(17);
    }
}
