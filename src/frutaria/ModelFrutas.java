/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.frutaria;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


public class ModelFrutas extends AbstractTableModel{
    ArrayList<Frutas> frutas = new ArrayList();
    
    String[] colunas = {"codigo", "nome", "valor", "estoque"};

    @Override
    public int getRowCount() {
      return frutas.size();
    }

    @Override
    public int getColumnCount() {
      return colunas.length;
    }
    public String getCollumnName(int collumn){
        return colunas[collumn];
    }
            
    public void CadastrarFrutas(Frutas f){
        frutas.add(f);
        this.fireTableDataChanged();
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
      if(columnIndex == 0){
          return frutas.get(rowIndex).getCodigo();
      }else if(columnIndex == 1){
          return frutas.get(rowIndex).getNome();
      }else if(columnIndex == 2){
          return frutas.get(rowIndex).getValor();
      }else{
          return frutas.get(rowIndex).getEstoque();
     }
    }
    
}
