package src;

import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class MyPanel extends JPanel{

    private TImage tImage;

    public MyPanel(){
        tImage = new TImage();
        String [] headers = {"2011","2012","2013","2014"};
        Object [][]data = {{10,20,30,40},{5,15,20,25},{100,200,300,400}};
        DefaultTableModel dtm = new DefaultTableModel(data,headers);
        tImage.fillData(dtm);
        add(tImage);
    }

}
