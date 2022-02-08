package src;

import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TImage extends JScrollPane {

    private JTable table;
    private final ImageIcon Image = new ImageIcon(getClass().getResource("icbf-logo.png"));


    public TImage() {
        table = new JTable();
        this.setOpaque(false);
        this.getViewport().setOpaque(false);
        table.setOpaque(false);
        this.setViewportView(table);
        table.setDefaultRenderer(Object.class, new CellRender()); //Esto llama magicamente a cell render    

    }

    public void fillData(DefaultTableModel model){
        table.setModel(model);
    }


    @Override
    protected void paintComponent(Graphics g) {
        g.drawImage(Image.getImage(), 60, 40, 400, 400, this);
    }
    
}
