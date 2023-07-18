package AppletAndAwt;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;


// <applet code="F_8" height="1000" width="1000"></applet>
public class F_8 extends Applet  {
    @Override
    public void paint(Graphics g){
        g.setColor(Color.red);
        g.fillRect(400, 400, 400, 400);
        g.setColor(Color.black);
        g.fillRect(450, 450,300,300);
    }
}
