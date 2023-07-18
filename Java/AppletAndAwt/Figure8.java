package AppletAndAwt;

import java.applet.Applet;
import java.awt.*;

// <applet code="Figure8" height="800" width="800"></applet> 
public class Figure8 extends Applet {
    @Override
    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.fillRect(150,150,400,400);
       g.setColor(Color.black);
       g.fillRect(200,200 ,300 , 300);
       g.setColor(Color.yellow);
       g.fillRect(250,250,200,200);
       g.setColor(Color.GREEN);
       g.fillOval(270,270,160,160);
    }
}