interface Printable {
    default void process() {
        System.out.println("Printing document...");
    }
}

interface Scannable {
    default void process() {
        System.out.println("Scanning document...");
    }
}

class MultifunctionDevice implements Printable, Scannable {
    // Conflict resolved by explicitly choosing which one to call
    public void process() {
        Printable.super.process();
        Scannable.super.process();
        System.out.println("Both printing and scanning completed.");
    }
}

public class Q12 {
    public static void main(String[] args) {
        MultifunctionDevice m = new MultifunctionDevice();
        m.process();
    }
}
