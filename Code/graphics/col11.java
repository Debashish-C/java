import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

import javax.swing.text.StyledEditorKit;

class Z {
    public int x0, y0, xdist, ydist;

    public Z(int a, int b, int width, int height) {
        x0 = a;
        y0 = b;
        xdist = width;
        ydist = height;

    }
}

class VIEWPORT extends Frame {
    VIEWPORT(Color col, Z z1) {
        setSize(z1.xdist, z1.ydist);
        setBackground(col);
        setVisible(true);
    }

    public void paint(Graphics g) {
        Color[] col = {
                Color.blue,
                Color.black,
                Color.cyan,
                Color.gray,
                Color.green,
                Color.magenta,
                Color.red,
                Color.pink,
                Color.yellow
        };
        String[] name = {
                "blue",
                "black",
                "cyan",
                "gray",
                "green",
                "magenta",
                "red",
                "pink",
                "yellow"
        };

        int i;
        for (i = 0; i < 9; i++) {
            g.setColor(col[i]);
            g.fillRect(100, 100 + i * 20, 200, 200);
            g.drawString(name[i], 460, 180 + i * 20);
            delay(1000);
        }
    }

    public void delay(long n) {
        long t1, t2;
        t1 = System.currentTimeMillis();
        t1 = t1 + n;
        t2 = System.currentTimeMillis();
        while (t2 < t1) {
            t2 = System.currentTimeMillis();
        }
    }
}

public class col11 {
    public static void main(String[] args) {
        char x1;

        Z za = new Z(80, 80, 540, 540);
        VIEWPORT win1 = new VIEWPORT(Color.white, za);

    }
}
