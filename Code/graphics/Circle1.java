import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

class VP extends Frame {
    VP(int xdim, int ydim) {
        setSize(xdim, ydim);
        setBackground(Color.white);
        setVisible(true);
    }

    public void delay(long n) {
        long t1, t2;
        t1 = System.currentTimeMillis();
        t1 = t1 + n;
        t2 = System.currentTimeMillis();
        while (t2 < t1)
            t2 = System.currentTimeMillis();
    }

    public void paint(Graphics g) {
        int k;
        int x0 = 300, y0 = 300, r1 = 100;
        int x1, y1;
        double mult = 3.1416 / 180.0;
        g.setColor(Color.green);
        for (k = 0; k < 6; k++) {
            delay(1000);
            x1 = (int) Math.ceil(x0 + r1 * Math.cos(60.0 * mult * k));
            y1 = (int) Math.floor(y0 + r1 * Math.sin(60.0 * mult * k));
            g.drawOval(x1, y1, 2 * r1, 2 * r1);
        }
    }
}

public class Circle1 {
    public static void main(String[] args) {
        VP vp = new VP(660, 660);
    };
}
