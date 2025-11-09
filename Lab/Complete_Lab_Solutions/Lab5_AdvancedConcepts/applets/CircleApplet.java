import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

/*
<applet code="CircleApplet" width=400 height=400>
</applet>
*/

public class CircleApplet extends Applet {
    public void paint(Graphics g) {
        // Set background color
        setBackground(Color.WHITE);

        // Draw a red circle
        g.setColor(Color.RED);
        g.fillOval(100, 100, 200, 200);

        // Draw a blue border
        g.setColor(Color.BLUE);
        g.drawOval(100, 100, 200, 200);

        // Add text
        g.setColor(Color.BLACK);
        g.drawString("This is a colored circle", 130, 330);
    }
}