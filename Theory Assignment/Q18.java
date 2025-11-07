import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
/* <applet code="BouncingBallApplet" width=400 height=300></applet> */
public class BouncingBallApplet extends Applet implements Runnable {
    int x = 50, y = 50, radius = 20;
    int dx = 2, dy = 3;  // speed
    Thread t;
    boolean running = false;

    public void start() {
        if (t == null) {
            running = true;
            t = new Thread(this);
            t.start();
        }
    }

    public void stop() {
        running = false;
        t = null;
    }

    public void run() {
        while (running) {
            x += dx;
            y += dy;

            // Bounce off walls
            if (x < 0 || x > getWidth() - radius) dx = -dx;
            if (y < 0 || y > getHeight() - radius) dy = -dy;

            repaint();

            try {
                Thread.sleep(20); // smooth animation
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.fillOval(x, y, radius, radius);
    }
}
