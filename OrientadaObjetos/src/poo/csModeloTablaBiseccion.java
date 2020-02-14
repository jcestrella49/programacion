package poo;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class csModeloTablaBiseccion extends AbstractTableModel {
    
    private ArrayList <csFilaBiseccion> lista = new ArrayList<csFilaBiseccion> ();
    private String [] columnas = {"i", "xi", "xs", "xr", "Fxi", "Fxr", "Signo", "E.R"};

    public csModeloTablaBiseccion(ArrayList<csFilaBiseccion> lista) {
        this.lista = lista;
    }

    public csModeloTablaBiseccion() {
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
                return this.lista.get(fila).getXs();
            case 3:
                return this.lista.get(fila).getXr();
            case 4:
                return this.lista.get(fila).getFxi();
            case 5:
                return this.lista.get(fila).getFxr();
            case 6:
                return this.lista.get(fila).getSigno();
            case 7:
                return this.lista.get(fila).getErrorCalculado();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return this.columnas[column]; //To change body of generated methods, choose Tools | Templates.
    }
    
    
      
}