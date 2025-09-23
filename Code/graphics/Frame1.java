import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

public class Frame1 extends Frame {

    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.drawRect(50, 50, 100, 50);
        g.setColor(Color.blue);
        g.drawLine(200, 50, 270, 50);

    };

    public static void main(String[] args) {
        Frame1 f1 = new Frame1();
        f1.setSize(650, 650);
        f1.setBackground(Color.yellow);
        f1.setVisible(true);

    }
}