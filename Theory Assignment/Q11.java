interface RemoteControllable {
    void start();
    void stop();
    void status();
}

class Drone implements RemoteControllable {
    public void start() { System.out.println("Drone started."); }
    public void stop() { System.out.println("Drone stopped."); }
    public void status() { System.out.println("Drone flying status: Active."); }
}

class Robot implements RemoteControllable {
    public void start() { System.out.println("Robot started."); }
    public void stop() { System.out.println("Robot stopped."); }
    public void status() { System.out.println("Robot operational."); }
}

class Car implements RemoteControllable {
    public void start() { System.out.println("Car engine on."); }
    public void stop() { System.out.println("Car engine off."); }
    public void status() { System.out.println("Car status: Running."); }
}

public class Q11 {
    public static void main(String[] args) {
        RemoteControllable rc;

        rc = new Drone();
        rc.start(); rc.status(); rc.stop();

        rc = new Robot();
        rc.start(); rc.status(); rc.stop();

        rc = new Car();
        rc.start(); rc.status(); rc.stop();
    }
}
