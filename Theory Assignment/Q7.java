class Payment {
    void processPayment() {
        System.out.println("Processing generic payment...");
    }
}

class CreditCard extends Payment {
    void processPayment() {
        System.out.println("Processing payment via Credit Card.");
    }
}

class PayPal extends Payment {
    void processPayment() {
        System.out.println("Processing payment via PayPal.");
    }
}

class UPI extends Payment {
    void processPayment() {
        System.out.println("Processing payment via UPI.");
    }
}

public class Q7 {
    public static void main(String[] args) {
        Payment p;

        p = new CreditCard();
        p.processPayment();  // runtime polymorphism

        p = new PayPal();
        p.processPayment();

        p = new UPI();
        p.processPayment();
    }
}
