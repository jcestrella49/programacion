package poo;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class csModeloTablaSecante extends AbstractTableModel{
    
    private ArrayList <csFilaSecante> lista = new ArrayList<csFilaSecante> ();
    private String [] columnas = {"i", "xi-1", "xi", "F(xi-1)", "Fxi", "Raiz", "E.R"};
    
    public csModeloTablaSecante(ArrayList <csFilaSecante> lista){
        this.lista = lista;
    }

    public csModeloTablaSecante() {
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
                return this.lista.get(fila).getXim();
            case 2:
                return this.lista.get(fila).getXi();
            case 3:
                return this.lista.get(fila).getFxim();
            case 4:
                return this.lista.get(fila).getFxi();
            case 5:
                return this.lista.get(fila).getRaiz();
            case 6:
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
