package AppletAndAwt;

import java.applet.Applet;
import java.awt.*;
public  class Myapplet extends Applet {
    public void paint(Graphics g){
        g.drawRect(100, 200, 100, 200);
        g.drawLine(100, 200, 200, 400);
        g.drawLine(200, 200, 100, 400);
        g.drawOval(200, 400, 100, 100);
        // g.fillOval(200, 400, 100, 100);
        g.setColor(getBackground());
    }
    
}
