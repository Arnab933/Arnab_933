import java.applet.Applet;
import java.awt.*;
// <applet code="LifeCycle" height="100" width="400"></applet>
public class LifeCycle extends Applet {
    int c=0;
   public void init(){
    System.out.println("Init Method "+c++);
   }
   public void start(){
    System.out.println("Start method "+c++);
   }
   public void stop(){
    System.out.println("Stop method "+c++);
   }
   public void destroy(){
    System.out.println("Destroy method "+c);
   }
   public void paint(Graphics g ){
    System.out.println("Paint method "+c++);
    g.drawString("I am arnab", 100, 100);
   }
}