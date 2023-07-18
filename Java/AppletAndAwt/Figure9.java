package AppletAndAwt;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
// <applet code="Figure9" height="1000" width="1000"></applet>
public class Figure9 extends Applet {
    public void paint(Graphics g){
        g.setColor(Color.blue);
        int[]t1={400,500,500};
        int[]t2={400,400,300};
        g.fillPolygon(t1, t2, 3);
        // int[]t3={500,600,500};
        // int[]t4={400,400,300};
        // g.setColor(Color.yellow);
        // g.fillPolygon(t3, t4, 3);
        // int[]t5={500,600,500};
        // int[]t6={400,400,500};
        // g.setColor(Color.green);
        // g.fillPolygon(t5, t6, 3);
    }
}
