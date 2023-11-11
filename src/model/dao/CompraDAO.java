package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import connection.ConnectionFactory;
import model.bean.CompraFruta;
import model.bean.Fruta;

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
			stmt.setBoolean(4, compra.getCompraFinalizada());

			stmt.executeUpdate();

			System.out.println("Salvo com Sucesso!");
		} catch (SQLException e) {
			throw new RuntimeException("Erro ao salvar " + e);

		} finally {
			ConnectionFactory.closeConnection(conn, stmt);
		}
	}

	public void update(CompraFruta compra) {

		Connection conn = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;

		String sql = "UPDATE tb_compraFruta SET valor_total = ?, quantidade_comprada = ? WHERE cpf = ? AND compra_finalizada = ?";

		try {
			stmt = conn.prepareStatement(sql);
			stmt.setDouble(1, compra.getValorTotal());
			stmt.setInt(2, compra.getQuantidadeComprada());
			stmt.setString(3, compra.getCpf());
			stmt.setInt(4, 0);

			stmt.executeUpdate();

			System.out.println("Compra atualizado com sucesso!");
		} catch (SQLException e) {
			throw new RuntimeException("Erro ao salvar " + e);

		} finally {
			ConnectionFactory.closeConnection(conn, stmt);
		}
	}
	
	public void finalizarCompra(String cpf) {

		Connection conn = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;

		String sql = "UPDATE tb_compraFruta SET compra_finalizada = ? WHERE cpf = ? AND compra_finalizada = ?";

		try {
			stmt = conn.prepareStatement(sql);
			stmt.setInt(1, 1);
			stmt.setString(2, cpf);
			stmt.setInt(3, 0);

			stmt.executeUpdate();

			System.out.println("Compra finalizada com sucesso!");
		} catch (SQLException e) {
			throw new RuntimeException("Erro ao salvar " + e);

		} finally {
			ConnectionFactory.closeConnection(conn, stmt);
		}
	}

	public CompraFruta buscarCompraNaoFinalizada(String cpf) {
		Connection conn = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		CompraFruta compra = new CompraFruta();

		String sql = "SELECT * FROM tb_compraFruta WHERE cpf = ? AND compra_finalizada = ?";

		try {
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, cpf);
			stmt.setString(2, "0");

			rs = stmt.executeQuery();

			if (rs.next()) {
				compra.setId(rs.getInt("id"));
				compra.setCpf(rs.getString("cpf"));
				compra.setValorTotal(rs.getDouble("valor_total"));
				compra.setQuantidadeComprada(rs.getInt("quantidade_comprada"));
				compra.setCompraFinalizada(rs.getBoolean("compra_finalizada"));
			}

			System.out.println("Fruta achada com Sucesso!");
		} catch (SQLException e) {
			throw new RuntimeException("Compra não encontrada: " + e);

		} finally {
			ConnectionFactory.closeConnection(conn, stmt, rs);
		}

		return compra;
	}
	
	public CompraFruta buscarCompraNaoFinalizada() {
		Connection conn = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		CompraFruta compra = new CompraFruta();

		String sql = "SELECT * FROM tb_compraFruta WHERE compra_finalizada = ?";

		try {
			stmt = conn.prepareStatement(sql);
			stmt.setInt(1, 0);

			rs = stmt.executeQuery();

			if (rs.next()) {
				compra.setId(rs.getInt("id"));
				compra.setCpf(rs.getString("cpf"));
				compra.setValorTotal(rs.getDouble("valor_total"));
				compra.setQuantidadeComprada(rs.getInt("quantidade_comprada"));
				compra.setCompraFinalizada(rs.getBoolean("compra_finalizada"));
			}

			System.out.println("Fruta achada com Sucesso!");
		} catch (SQLException e) {
			throw new RuntimeException("Compra não encontrada: " + e);

		} finally {
			ConnectionFactory.closeConnection(conn, stmt, rs);
		}

		return compra;
	}

	public boolean existeCompraNaoFinalizadoComCpf(String cpf) {
		Connection conn = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		ResultSet rs = null;

		String sql = "SELECT * FROM tb_compraFruta WHERE cpf = ? AND compra_finalizada = ?";

		try {
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, cpf);
			stmt.setInt(2, 0);

			rs = stmt.executeQuery();

			if (rs.next()) {
				System.out.println("Compra achada com Sucesso!");
				return true;
			} else {
				System.out.println("Compra não encontrada!");
				return false;
			}

		} catch (SQLException e) {
			throw new RuntimeException("Compra não encontrada: " + e);

		} finally {
			ConnectionFactory.closeConnection(conn, stmt);
		}
	}
}
