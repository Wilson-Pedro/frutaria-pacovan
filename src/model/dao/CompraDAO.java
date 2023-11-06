package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import connection.ConnectionFactory;
import model.bean.CompraFruta;

public class CompraDAO {

	public void create(CompraFruta compra) {
		
		Connection conn = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		
		String sql = "INSERT INTO tb_compraFruta (cpf, valor_total, quantidade_comprada, compra_finalizada) VALUES (?, ?, ?, ?)";
		
		try {
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, compra.getCpf());
			stmt.setDouble(2, compra.getValorTotal());
			stmt.setInt(3, compra.getQuantidadeComprada());
			stmt.setBoolean(4, compra.isCompraFinalizada());
			
			stmt.executeUpdate();
			
			System.out.println("Salvo com Sucesso!");
		} catch (SQLException e) {
			throw new RuntimeException("Erro ao salvar " + e);
			
		} finally {
			ConnectionFactory.closeConnection(conn, stmt);
		}
	}
}
