/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.frutaria;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import model.bean.Fruta;
import model.dao.FrutaDAO;

public class ModelFrutas extends AbstractTableModel {

	private static final long serialVersionUID = 1L;

	FrutaDAO dao = new FrutaDAO();
	List<Fruta> frutas = dao.buscarTodos();

	String[] colunas = {"nome", "valor", "estoque" };

	@Override
	public int getRowCount() {
		return frutas.size();
	}

	@Override
	public int getColumnCount() {
		return colunas.length;
	}

	public String getColumnName(int collumn) {
		return colunas[collumn];
	}

	public void cadastrarFrutas(Fruta fruta) {
		frutas.add(fruta);
		this.fireTableDataChanged();
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		int num = 0;
		while (num < dao.getTotalLinhas()) {
			if (columnIndex == 0) {
				return frutas.get(rowIndex).getNome();
			} else if (columnIndex == 1) {
				return frutas.get(rowIndex).getValor();
			} else {
				return frutas.get(rowIndex).getEstoque();
			}
		}
		return null;
	}
}
