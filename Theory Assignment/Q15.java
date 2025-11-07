class TicketBooking implements Runnable {
    int totalSeats = 5;

    synchronized void bookTicket(String name, int seats) {
        if (totalSeats >= seats) {
            System.out.println(name + " booked " + seats + " seat(s).");
            totalSeats -= seats;
            System.out.println("Seats left: " + totalSeats);
        } else {
            System.out.println("Sorry " + name + ", not enough seats.");
        }
    }

    public void run() {
        bookTicket(Thread.currentThread().getName(), 2);
    }
}

public class Q15 {
    public static void main(String[] args) {
        TicketBooking tb = new TicketBooking();

        Thread t1 = new Thread(tb, "User1");
        Thread t2 = new Thread(tb, "User2");
        Thread t3 = new Thread(tb, "User3");

        t1.start();
        t2.start();
        t3.start();
    }
}
