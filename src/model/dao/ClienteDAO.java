package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import connection.ConnectionFactory;
import model.bean.Cliente;

public class ClienteDAO {
	
    public void create(Cliente cliente) {
		
		Connection conn = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		
		String sql = "INSERT INTO tb_cliente (nome, cpf, numero, endereco) VALUES (?, ?, ?, ?)";
		
		try {
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, cliente.getNome());
			stmt.setString(2, cliente.getCpf());
			stmt.setString(3, cliente.getNumero());
			stmt.setString(4, cliente.getEndereco());
			
			stmt.executeUpdate();
			
			System.out.println("Salvo com Sucesso!");
		} catch (SQLException e) {
			throw new RuntimeException("Erro ao salvar " + e);
			
		} finally {
			ConnectionFactory.closeConnection(conn, stmt);
		}
	}
}
