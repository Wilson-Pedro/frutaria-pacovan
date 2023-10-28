package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import connection.ConnectionFactory;
import model.bean.Fruta;

public class FrutaDAO {

	public void create(Fruta fruta) {
		
		Connection conn = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		
		String sql = "INSERT INTO tb_fruta (nome, valor, estoque) VALUES (?, ?, ?)";
		
		try {
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, fruta.getNome());
			stmt.setDouble(2, fruta.getValor());
			stmt.setInt(3, fruta.getEstoque());
			
			stmt.executeUpdate();
			
			System.out.println("Salvo com Sucesso!");
		} catch (SQLException e) {
			throw new RuntimeException("Erro ao salvar " + e);
			
		} finally {
			ConnectionFactory.closeConnection(conn, stmt);
		}
		
	}
}
