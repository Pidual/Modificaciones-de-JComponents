package src;

import java.awt.Component;
import java.awt.Font;

import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class CellRender extends DefaultTableCellRenderer{

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
            int row, int column) {
        Component cellComponent = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        setBorder(null);
        setOpaque(false);
        setFont( new Font ("Consolas" , Font.PLAIN , 12));
        return cellComponent;
    }
    
}
