package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
			throw new RuntimeException("Erro ao salvar: " + e);
			
		} finally {
			ConnectionFactory.closeConnection(conn, stmt);
		}
	}
    
    public List<Cliente> buscarTodos() {
		Connection conn = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		List<Cliente> list = new ArrayList<>();
		
		String sql = "SELECT * FROM tb_cliente";
		try {
			stmt = conn.prepareStatement(sql);
			rs = stmt.executeQuery();
			
			while(rs.next()) {
				Cliente cliente = new Cliente();
				cliente.setId(rs.getInt("id"));
				cliente.setNome(rs.getString("nome"));
				cliente.setCpf(rs.getString("cpf"));
				cliente.setNumero(rs.getString("numero"));
				cliente.setEndereco(rs.getString("endereco"));
				
				list.add(cliente);
			}
		} catch (SQLException e) {
			throw new RuntimeException("Erro ao buscar todas os clientes: " + e);
			
		} finally {
			ConnectionFactory.closeConnection(conn, stmt, rs);
		}
		
		return list;
	}
}
