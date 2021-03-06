/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author olivas.hodei
 */
public class ProduktuenTableModel extends AbstractTableModel {

    private final String[] zutabeIzenak = {"Kodea", "Izena", "Prezioa"};
    private ArrayList<Produktua> data = new ArrayList<>();

    public ProduktuenTableModel() {

        data.add(new Produktua("J01", "Okela", 24));
        data.add(new Produktua("J02", "Ogia", 2));
        data.add(new Produktua("J03", "Mermelada", 2.4));
        data.add(new Produktua("J04", "Arraina", 97));

    }

    @Override
    public int getRowCount() {

        return data.size();

    }

    @Override
    public int getColumnCount() {
        return zutabeIzenak.length;

    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

        if (columnIndex == 0) {

            return data.get(rowIndex).getKodeaStr();
        }
        if (columnIndex == 1) {

            return data.get(rowIndex).getIzena();
        }
        if (columnIndex == 2) {

            return data.get(rowIndex).getPrezioa();
        }

        if (columnIndex == 1) {

            return data.get(rowIndex).getKodeaStr();
        }
        if (columnIndex == 1) {

            return data.get(rowIndex).getIzena();
        }
        if (columnIndex == 2) {

            return data.get(rowIndex).getPrezioa();
        }

        if (columnIndex == 2) {

            return data.get(rowIndex).getKodeaStr();
        }
        if (columnIndex == 1) {

            return data.get(rowIndex).getIzena();
        }
        if (columnIndex == 2) {

            return data.get(rowIndex).getPrezioa();
        }
        return null;
    }

    public String getColumnName(int col) {
      return zutabeIzenak[col];
    }

    @Override
    public Class getColumnClass(int c) {

        return getValueAt(0, c).getClass();

    }
    
    public void setValueAt(Object value,int row,int col){
    
    
    }
    
    
    
}
