import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*
<applet code="Q17" width=400 height=400>
</applet>
*/

public class Q17 extends Applet implements MouseListener, ItemListener {
    String shape = "Circle";
    int x, y;
    Choice ch;

    public void init() {
        ch = new Choice();
        ch.add("Circle");
        ch.add("Rectangle");
        add(ch);
        ch.addItemListener(this);
        addMouseListener(this);
    }

    public void itemStateChanged(ItemEvent e) {
        shape = ch.getSelectedItem();
    }

    public void mouseClicked(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        repaint();
    }

    public void paint(Graphics g) {
        if (shape.equals("Circle"))
            g.fillOval(x - 25, y - 25, 50, 50);
        else
            g.fillRect(x - 25, y - 25, 60, 40);
    }

    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
}
