
package poo;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class csModeloTablaNewton extends AbstractTableModel{
    
    private ArrayList <csFilaNewton> lista = new ArrayList<csFilaNewton> ();
    private String [] columnas = {"i", "xi", "Fxi", "Fdxi", "Raiz", "E.R"};
    
    public csModeloTablaNewton(ArrayList <csFilaNewton> lista){
        this.lista = lista;
    }
      public csModeloTablaNewton() {
    }

    @Override
    public int getRowCount() {
         return this.lista.size();
    }

    @Override
    public int getColumnCount() {
        return this.columnas.length;
    }

    @Override
    public Object getValueAt(int fila, int columna) {
        switch (columna){
            case 0:
                return this.lista.get(fila).getI()+1;
            case 1:
                return this.lista.get(fila).getXi();
            case 2:
                return this.lista.get(fila).getFxi();
            case 3:
                return this.lista.get(fila).getFdxi();
            case 4:
                return this.lista.get(fila).getRaiz();
            case 5:
                return this.lista.get(fila).getErrorCalculado();
            default:
                return null;
        }
    }
    
    @Override
     public String getColumnName(int column) {
        return this.columnas[column];
    }
    
}
