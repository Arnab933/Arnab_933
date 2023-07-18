package AppletAndAwt;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

// <applet code="House" height="500" width="500"></applet>
public class House extends Applet {
    public void paint(Graphics g){
    int x[]={200,350,500};
    int y[]={200,50,200};
    g.setColor(Color.yellow);
    g.fillPolygon(x, y, 3);
    g.setColor(Color.green);
     g.fillRect(200, 200, 300, 350);
    g.setColor(Color.red);
     g.fillRect(300, 400, 100, 150);
     int s[]={300,340,340,300};
     int t[]={400,450,500,550};
     g.setColor(Color.white);
     g.fillPolygon(s, t, 4);
     int[]t1={400,360,360,400};
     int[]t2={400,450,500,550};
     g.setColor(Color.white);
     g.fillPolygon(t1, t2, 4);
    }
}
