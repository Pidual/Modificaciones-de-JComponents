package src;

import javax.swing.JPanel;

import java.awt.Dimension;

import javax.swing.JButton;

public class MyPanel extends JPanel{

    private JButton button1;

    public MyPanel(){
        button1 = new JButton("Mi botton 1");
        button1.setPreferredSize(new Dimension(100,100)); //hace el botton grandisimo
        button1.setBorderPainted(false);
        button1.setUI(new MyButton());
        add(button1);
    }

}
