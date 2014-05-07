/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pj;

import java.text.DateFormat;
import java.util.Date;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author usuario
 */
public class FechaNacRenderer extends DefaultTableCellRenderer{
    
    public FechaNacRenderer() {
     
        setHorizontalAlignment(SwingConstants.RIGHT);
    }


    @Override
    public void setValue(Object aValue) {
        String result = "";
        if ((aValue != null) && (aValue instanceof Date)) {
            DateFormat formateadorFechaMedia = DateFormat.getDateInstance(DateFormat.MEDIUM);
            result = formateadorFechaMedia.format(aValue);
        }
        setText(result);
    }

}
