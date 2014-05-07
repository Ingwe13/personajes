/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pj;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author usuario
 */
public class ModeloTabla extends AbstractTableModel {

    List<Personaje> list;

    public void setDataList(List<Personaje> list) {
        this.list = list;
    }

    @Override
    public int getRowCount() {
        //indica las filas

        return list.size();

    }

    @Override
    public int getColumnCount() {
        //indica las columnas
        return 7;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Personaje personaje = list.get(rowIndex);
        switch (columnIndex) {
            //Indica
            case 0:
                return personaje.getNombre();
  

            case 1:
                return personaje.getEdad();
 
      
            case 2:
                return personaje.getRaza();
            
            case 3:
                return personaje.getAlianza();
                
            case 4:
                return personaje.getFechaDeNacmiento();
                
            case 5:
                return personaje.getFechaDeDefuncion();
       
            case 6:
                return personaje.getDinero();
            default:
                return null;
// (REPETIR CON TODOS)                 
            }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Nombre";
   
            case 1:
                return "Edad";
   
            case 2:
                return "Raza";
            case 3:
                return "Alianza";
                
            case 4:
                return "Fecha De Nacimiento";
   
            case 5:
                return "Fecha de defuncion";
                
            case 6:
                return "Dinero";
   
            default:
                return "";
        }
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return super.getColumnClass(columnIndex); //To change body of generated methods, choose Tools | Templates.

    }
}
