import java.applet.Applet;
import java.awt.Graphics;

/*
<applet code="ParamApplet" width=400 height=200>
<param name="name" value="John Doe">
<param name="age" value="25">
</applet>
*/

public class ParamApplet extends Applet {
    private String name;
    private String age;

    public void init() {
        name = getParameter("name");
        age = getParameter("age");

        if (name == null) name = "Unknown";
        if (age == null) age = "0";
    }

    public void paint(Graphics g) {
        g.drawString("Name: " + name, 50, 60);
        g.drawString("Age: " + age, 50, 80);
        g.drawString("Welcome to Java Applet Programming!", 50, 120);
    }
}