package AppletAndAwt;

import java.applet.Applet;
import java.awt.*;

// <applet code="AppletDrawTriangle.java" height="800" width="800"></applet>
public class AppletDrawTriangle extends Applet{
    @Override
    public void paint(Graphics g){
     g.setColor(Color.blue );
     int[]x1={200,275,275};
     int[]y1={200,200,125};
     g.fillPolygon(x1, y1, 3);
     g.setColor(Color.yellow);
     int[]x2={275,275,350};
     int[]y2={125,200,200};
     g.fillPolygon(x2, y2, 3);
     g.setColor(Color.green);
     int[]x3={275,350,275};
     int[]y3={200,200,275};
     g.fillPolygon(x3, y3,3);
    }
}