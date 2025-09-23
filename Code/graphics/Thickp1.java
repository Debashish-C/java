import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

class VP extends Frame {
    VP(int xdim, int ydim) {
        setSize(xdim, ydim);
        setBackground(Color.white);
        setVisible(true);
    }

    public void drawPoint(int x0, int y0, int thick) {
        int k;
        Graphics g = getGraphics();
        g.setColor(Color.blue);
        for (k = 0; k < thick; k++) {
            g.drawLine(x0, y0 + k, x0 + thick, y0 + k);
        }
    }

    public void paint(Graphics g) {
        int i, j, k;
        int x0 = 50, y0 = 50;
        int x1, y1, x2, y2;
        int thickness;
        g.setColor(Color.green);
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 4; j++) {
                drawPoint(x0 + 30 * i, y0 + 30 * j, 3);
            }
        }
    }
}

public class Thickp1 {
    public static void main(String[] args) {
        VP vp1 = new VP(400, 400);
    };
}
