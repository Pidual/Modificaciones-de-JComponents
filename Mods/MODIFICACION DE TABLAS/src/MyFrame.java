package src;

import javax.swing.JFrame;


public class MyFrame extends JFrame{
    
    private MyPanel panel;

    public MyFrame(){
        super("MyFrame");
        this.setSize(800,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initComponents();
        this.setVisible(true);
       
    }
    
    private void initComponents(){
        panel = new MyPanel();
        add(panel);
    }

    public static void main(String[] args) {
        new MyFrame();
    }
}
