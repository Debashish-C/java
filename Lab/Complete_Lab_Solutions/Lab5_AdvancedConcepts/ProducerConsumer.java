class SharedResourcePC {
    private int data;
    private boolean available = false;

    public synchronized void produce(int value) {
        while (available) {
            try {
                wait(); // Wait for consumer to consume
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }

        data = value;
        available = true;
        System.out.println("Produced: " + data);
        notify(); // Notify consumer
    }

    public synchronized int consume() {
        while (!available) {
            try {
                wait(); // Wait for producer to produce
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return -1;
            }
        }

        available = false;
        System.out.println("Consumed: " + data);
        notify(); // Notify producer
        return data;
    }
}

class ProducerPC implements Runnable {
    private final SharedResourcePC resource;

    public ProducerPC(SharedResourcePC resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            resource.produce(i);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }
    }
}

class ConsumerPC implements Runnable {
    private final SharedResourcePC resource;

    public ConsumerPC(SharedResourcePC resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            int val = resource.consume();
            if (val == -1) return;
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }
    }
}

public class ProducerConsumer {
    public static void main(String[] args) {
        SharedResourcePC resource = new SharedResourcePC();

        Thread producer = new Thread(new ProducerPC(resource), "Producer");
        Thread consumer = new Thread(new ConsumerPC(resource), "Consumer");

        producer.start();
        consumer.start();

        try {
            producer.join();
            consumer.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Producer-Consumer demo finished.");
    }
}