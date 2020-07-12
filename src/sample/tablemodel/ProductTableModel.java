/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.tablemodel;

import java.util.Vector;
import javax.swing.table.AbstractTableModel;
import sample.dtos.ProductDTO;

/**
 *
 * @author Admin
 */
public class ProductTableModel extends AbstractTableModel{
    private String[] header;
    private Vector<ProductDTO> data;

    public ProductTableModel(String[] header) {
        this.header = new String[header.length];
        for(int i=0; i<header.length; i++){
            this.header[i]=header[i];
        }
        
          this.data=new Vector<>();
    }

    public Vector<ProductDTO> getData() {
        return data;
    }

    @Override
    public int getRowCount() {
        return data.size();
    }

    @Override
    public int getColumnCount() {
        return header.length;
    }

    @Override
    public String getColumnName(int column){
        return (column>=0 && column<header.length)?header[column]:"";
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       ProductDTO product=data.get(rowIndex);
       switch(columnIndex){
           case 0:  return product.getId();
           case 1:  return product.getName();
           case 2:  return product.getPrice();
           case 3: return product.getQuantity();
       }
       return null;
    }


}
