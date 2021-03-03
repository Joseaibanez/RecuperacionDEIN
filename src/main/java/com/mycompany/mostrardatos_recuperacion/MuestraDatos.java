/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mostrardatos_recuperacion;
import java.io.IOException;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author Besitzer
 */
public class MuestraDatos extends AbstractTableModel {

    /**
     * @param args the command line arguments
     */
    private String archivo;
    private List<String> listaLineas;
    private Lineas lineas = new Lineas();
    public MuestraDatos(List<String> listaLineas) throws IOException {
        this.listaLineas = listaLineas;
    }
    
    public static void main(String[] args) {
        
    }

    public  List<String> getListaLineas() {
        return listaLineas;
    }
    
    @Override
    public int getRowCount() {
        return listaLineas.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return listaLineas.get(rowIndex);
    }
    
    
}
