package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import connection.ConnectionFactory;
import model.bean.Cliente;
import model.bean.Fruta;

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
			
			System.out.println("Cliente salvo com Sucesso!");
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
    
    public Cliente buscarClientePorId(int id) {
    	Connection conn = ConnectionFactory.getConnection();
    	PreparedStatement stmt = null;
    	ResultSet rs = null;
    	Cliente cliente = new Cliente();
    	
    	String sql = "SELECT * FROM tb_cliente WHERE id = ?";
    	
    	try {
    		stmt = conn.prepareStatement(sql);
    		stmt.setInt(1, id);
    		
    		rs = stmt.executeQuery();
    		
    		if(rs.next()) {
    			cliente.setId(rs.getInt("id"));
    			cliente.setNome(rs.getString("nome"));
    			cliente.setCpf(rs.getString("cpf"));
    			cliente.setNumero(rs.getString("numero"));
    			cliente.setEndereco(rs.getString("endereco"));
    		}
    		
    	} catch (SQLException e) {
    		throw new RuntimeException("Erro ao buscar cliente: " + e);
    	} finally {
    		ConnectionFactory.closeConnection(conn, stmt);
    	}
    	return cliente;
    }
    
    public void update(Cliente cliente, int id) {
		Connection conn = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		
		String sql = "UPDATE tb_cliente SET nome = ?, cpf = ?, numero = ?, endereco = ? WHERE id = ?";
		
		try {
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, cliente.getNome());
			stmt.setString(2, cliente.getCpf());
			stmt.setString(3, cliente.getEndereco());
			stmt.setString(4, cliente.getNome());
			stmt.setInt(5, id);
			
			stmt.executeUpdate();
			
			System.out.println("Cliente atualizado com sucesso com Sucesso!");
		} catch (SQLException e) {
			throw new RuntimeException("Erro ao salvar " + e);
			
		} finally {
			ConnectionFactory.closeConnection(conn, stmt);
		}	
	}
    
    public void deletePorId(int id) {
		Connection conn = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		
		String sql = "DELETE FROM tb_cliente WHERE id = ?";
		
		try {
			stmt = conn.prepareStatement(sql);
			stmt.setInt(1, id);
			
			stmt.executeUpdate();
			
			System.out.println("Cliente deletado com sucesso!");
		} catch (SQLException e) {
			throw new RuntimeException("Erro ao deletar cliente: " + e);
			
		} finally {
			ConnectionFactory.closeConnection(conn, stmt);
		}
	}
}
