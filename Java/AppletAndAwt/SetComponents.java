package  AppletAndAwt;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*<applet code="SetComponents" width="500" height="500"> </applet> */
public class SetComponents extends Applet implements ActionListener {
    TextField t1, t2;
    Button button;
    Label l1, l3, l2;

    public void init() {
        l3 = new Label();
        l1 = new Label("First number");
        l2 = new Label("Second number");
        t1 = new TextField();
        t2 = new TextField();
        button = new Button("Find");
        setLayout(null);
        l1.setBounds(100, 100, 100, 20);
        t1.setBounds(200, 100, 100, 20);
        l2.setBounds(100, 130, 100, 20);
        t2.setBounds(200, 130, 100, 20);
        button.setBounds(200, 160, 30, 20);
        l3.setBounds(200, 180, 200, 20);
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(button);
        add(l3);
        SetComponents ob=new SetComponents();
        button.addActionListener(ob);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int a, b;  
        a = Integer.parseInt(t1.getText());
        b = Integer.parseInt(t2.getText());
        if (a > b)
            l3.setText("The largest number is:" + a);
        else
            l3.setText("The largest number is:" + b);
    }

}
