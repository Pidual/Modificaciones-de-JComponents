package src;

import java.awt.*;
import javax.swing.JComponent;
import javax.swing.plaf.basic.BasicButtonUI;


public class MyButton extends BasicButtonUI{
    

    public void paint(Graphics g,JComponent c) {
        Graphics2D g2d = (Graphics2D)g;
        int xPoints[]= { 0,50,100};
        int yPoints[] ={100,0,100};
        g2d.setColor(Color.RED);
        g2d.fillPolygon(xPoints, yPoints, 3);
        super.paint(g2d, c);
    }

}
