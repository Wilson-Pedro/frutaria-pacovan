package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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

	public void deletePorNome(String nome) {
		Connection conn = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;

		String sql = "DELETE FROM tb_fruta WHERE nome = ?";

		try {
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, nome);

			stmt.executeUpdate();

			System.out.println(nome + " deletado com Sucesso!");
		} catch (SQLException e) {
			throw new RuntimeException("Erro ao deletar fruta: " + e);

		} finally {
			ConnectionFactory.closeConnection(conn, stmt);
		}
	}

	public List<Fruta> buscarTodos() {
		Connection conn = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		List<Fruta> list = new ArrayList<>();

		String sql = "SELECT * FROM tb_fruta";
		try {
			stmt = conn.prepareStatement(sql);
			rs = stmt.executeQuery();

			while (rs.next()) {
				Fruta fruta = new Fruta();
				fruta.setId(rs.getInt("id"));
				fruta.setNome(rs.getString("nome"));
				fruta.setValor(rs.getDouble("valor"));
				fruta.setEstoque(rs.getInt("estoque"));

				list.add(fruta);
			}
		} catch (SQLException e) {
			throw new RuntimeException("Erro ao buscar todas as frutas: " + e);

		} finally {
			ConnectionFactory.closeConnection(conn, stmt, rs);
		}

		return list;
	}

	public Fruta buscarFrutaPorNome(String nome) {
		Connection conn = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		Fruta fruta = new Fruta("Não encontrado", 0.0, 0);

		String sql = "SELECT * FROM tb_fruta WHERE nome = ?";

		try {
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, nome);

			rs = stmt.executeQuery();

			if (rs.next()) {
				fruta = new Fruta();
				fruta.setId(rs.getInt("id"));
				fruta.setNome(rs.getString("nome"));
				fruta.setValor(rs.getDouble("valor"));
				fruta.setEstoque(rs.getInt("estoque"));
			}

		} catch (SQLException e) {
			throw new RuntimeException("Erro ao buscar " + nome
					+ "Erro: " + e);

		} finally {
			ConnectionFactory.closeConnection(conn, stmt, rs);
		}

		return fruta;
	}

	public int getTotalLinhas() {
		Connection conn = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		ResultSet rs = null;

		String sql = "SELECT COUNT(*) AS totalLinhas FROM tb_fruta";

		int allRows = 0;
		try {
			stmt = conn.prepareStatement(sql);
			rs = stmt.executeQuery();

			if (rs.next()) {
				allRows = rs.getInt("totalLinhas");
			}
		} catch (SQLException e) {
			throw new RuntimeException("Erro ao pegar número linhas " + e);

		} finally {
			ConnectionFactory.closeConnection(conn, stmt, rs);
		}

		return allRows;
	}

	public void update(Fruta fruta) {

		Connection conn = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;

		String sql = "UPDATE tb_fruta SET nome = ?, valor = ?, estoque = ? WHERE nome = ?";

		try {
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, fruta.getNome());
			stmt.setDouble(2, fruta.getValor());
			stmt.setInt(3, fruta.getEstoque());
			stmt.setString(4, fruta.getNome());

			stmt.executeUpdate();

			System.out.println("Fruta atualizado com sucesso com Sucesso!");
		} catch (SQLException e) {
			throw new RuntimeException("Erro ao salvar " + e);

		} finally {
			ConnectionFactory.closeConnection(conn, stmt);
		}
	}

	public void update(Fruta fruta, int id) {

		Connection conn = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;

		String sql = "UPDATE tb_fruta SET nome = ?, valor = ?, estoque = ? WHERE id = ?";

		try {
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, fruta.getNome());
			stmt.setDouble(2, fruta.getValor());
			stmt.setInt(3, fruta.getEstoque());
			stmt.setInt(4, id);

			stmt.executeUpdate();

			System.out.println("Fruta atualizado com sucesso com Sucesso!");
		} catch (SQLException e) {
			throw new RuntimeException("Erro ao salvar " + e);

		} finally {
			ConnectionFactory.closeConnection(conn, stmt);
		}
	}
}
