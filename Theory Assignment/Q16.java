class Shared {
    int data;
    boolean available = false;

    synchronized void produce(int value) {
        while (available) {
            try { wait(); } catch (Exception e) {}
        }
        data = value;
        System.out.println("Produced: " + data);
        available = true;
        notify();
    }

    synchronized void consume() {
        while (!available) {
            try { wait(); } catch (Exception e) {}
        }
        System.out.println("Consumed: " + data);
        available = false;
        notify();
    }
}

class Producer implements Runnable {
    Shared s;
    Producer(Shared s) { this.s = s; }
    public void run() {
        for (int i = 1; i <= 5; i++)
            s.produce(i);
    }
}

class Consumer implements Runnable {
    Shared s;
    Consumer(Shared s) { this.s = s; }
    public void run() {
        for (int i = 1; i <= 5; i++)
            s.consume();
    }
}

public class Q16 {
    public static void main(String[] args) {
        Shared obj = new Shared();
        new Thread(new Producer(obj)).start();
        new Thread(new Consumer(obj)).start();
    }
}
