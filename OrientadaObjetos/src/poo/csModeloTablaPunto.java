/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class csModeloTablaPunto extends AbstractTableModel{

    private ArrayList <csFilaPunto> lista = new ArrayList<csFilaPunto> ();
    private String [] columnas = {"i", "xi", "x", "E.R"};
    
    public csModeloTablaPunto(ArrayList <csFilaPunto> lista){
        this.lista = lista;
    }
      public csModeloTablaPunto() {
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
                return this.lista.get(fila).getX();
            case 3:
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
