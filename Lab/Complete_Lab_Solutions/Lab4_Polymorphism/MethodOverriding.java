class BankMO {
    double getRateOfInterest() {
        return 0.0;
    }
}

class SBIMO extends BankMO {
    @Override
    double getRateOfInterest() {
        return 8.4;
    }
}

class ICICIMO extends BankMO {
    @Override
    double getRateOfInterest() {
        return 7.3;
    }
}

class AXISMO extends BankMO {
    @Override
    double getRateOfInterest() {
        return 9.7;
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        BankMO bank; // Superclass reference
        
        bank = new SBIMO();
        System.out.println("SBI Rate of Interest: " + bank.getRateOfInterest());
        
        bank = new ICICIMO();
        System.out.println("ICICI Rate of Interest: " + bank.getRateOfInterest());
        
        bank = new AXISMO();
        System.out.println("AXIS Rate of Interest: " + bank.getRateOfInterest());
    }
}