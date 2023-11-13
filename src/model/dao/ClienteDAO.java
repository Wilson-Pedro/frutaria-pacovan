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
		
		String sql = "INSERT INTO tb_cliente (nome, cpf, rua, bairro, cep, telefone) VALUES (?, ?, ?, ?, ?, ?)";
		
		try {
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, cliente.getNome());
			stmt.setString(2, cliente.getCpf());
			stmt.setString(3, cliente.getRua());
			stmt.setString(4, cliente.getBairro());
			stmt.setString(5, cliente.getCep());
			stmt.setString(6, cliente.getTelefone());
			
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
				cliente.setRua(rs.getString("rua"));
				cliente.setBairro(rs.getString("bairro"));
				cliente.setCep(rs.getString("cep"));
				cliente.setTelefone(rs.getString("telefone"));
				
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
    	Cliente cliente = new Cliente("Não encontrado", "Não encontrado", "Não encontrado", 
    			"Não encontrado", "Não encontrado", "Não encontrado");
    	
    	String sql = "SELECT * FROM tb_cliente WHERE id = ?";
    	
    	try {
    		stmt = conn.prepareStatement(sql);
    		stmt.setInt(1, id);
    		
    		rs = stmt.executeQuery();
    		
    		if(rs.next()) {
    			cliente.setId(rs.getInt("id"));
				cliente.setNome(rs.getString("nome"));
				cliente.setCpf(rs.getString("cpf"));
				cliente.setRua(rs.getString("rua"));
				cliente.setBairro(rs.getString("bairro"));
				cliente.setCep(rs.getString("cep"));
				cliente.setTelefone(rs.getString("telefone"));
    		}
    		
    	} catch (SQLException e) {
    		throw new RuntimeException("Erro ao buscar cliente apartit do ID: " + id
    				+ "error: "+ e);
    	} finally {
    		ConnectionFactory.closeConnection(conn, stmt);
    	}
    	return cliente;
    }
    
    public Cliente buscarClientePorCpf(String cpf) {
    	Connection conn = ConnectionFactory.getConnection();
    	PreparedStatement stmt = null;
    	ResultSet rs = null;
    	Cliente cliente = new Cliente();
    	
    	String sql = "SELECT * FROM tb_cliente WHERE cpf = ?";
    	
    	try {
    		stmt = conn.prepareStatement(sql);
    		stmt.setString(1, cpf);
    		
    		rs = stmt.executeQuery();
    		
    		if(rs.next()) {
    			cliente.setId(rs.getInt("id"));
				cliente.setNome(rs.getString("nome"));
				cliente.setCpf(rs.getString("cpf"));
				cliente.setRua(rs.getString("rua"));
				cliente.setBairro(rs.getString("bairro"));
				cliente.setCep(rs.getString("cep"));
				cliente.setTelefone(rs.getString("telefone"));
    		}
    	} catch (SQLException e) {
    		throw new RuntimeException("Erro ao buscar cliente apartit do CPF: " + cpf
    				+"erro: "+ e);
    	} finally {
    		ConnectionFactory.closeConnection(conn, stmt);
    	}
    	return cliente;
    }
    
    public void update(Cliente cliente, int id) {
		Connection conn = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		
		String sql = "UPDATE tb_cliente SET nome = ?, cpf = ?, rua = ?, bairro = ?, cep = ?, telefone = ? WHERE id = ?";
		
		try {
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, cliente.getNome());
			stmt.setString(2, cliente.getCpf());
			stmt.setString(3, cliente.getRua());
			stmt.setString(4, cliente.getBairro());
			stmt.setString(5,  cliente.getCep());
			stmt.setString(6,  cliente.getTelefone());
			stmt.setInt(7, id);
			
			stmt.executeUpdate();
			
			System.out.println("Cliente atualizado com sucesso com Sucesso!");
		} catch (SQLException e) {
			throw new RuntimeException("Erro ao salvar " + e);
			
		} finally {
			ConnectionFactory.closeConnection(conn, stmt);
		}	
	}
    
    public void update(Cliente cliente) {
		Connection conn = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		
		String sql = "UPDATE tb_cliente SET nome = ?, rua = ?, bairro = ?, cep = ?, telefone = ? WHERE cpf = ?";
		
		try {
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, cliente.getNome());
			stmt.setString(2, cliente.getRua());
			stmt.setString(3, cliente.getBairro());
			stmt.setString(4,  cliente.getCep());
			stmt.setString(5,  cliente.getTelefone());
			stmt.setString(6, cliente.getCpf());
			
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
    
    public void deletePorCpf(String cpf) {
		Connection conn = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		
		String sql = "DELETE FROM tb_cliente WHERE cpf = ?";
		
		try {
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, cpf);
			
			stmt.executeUpdate();
			
			System.out.println("Cliente deletado com sucesso!");
		} catch (SQLException e) {
			throw new RuntimeException("Erro ao deletar cliente: " + e);
			
		} finally {
			ConnectionFactory.closeConnection(conn, stmt);
		}
	}
}
