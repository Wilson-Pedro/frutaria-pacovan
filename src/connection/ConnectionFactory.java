package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionFactory {

	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
<<<<<<< HEAD
	private static final String URL = "jdbc:mysql://localhost:3306/Frutaria-pacovan";
        private static final String USER = "root";
=======
	private static final String URL = "jdbc:mysql://localhost:3306/db_frutaria_pacovan";
	private static final String USER = "root";
>>>>>>> 0f004538e36bceb56cf5ce04c11e50ece504007d
	private static final String PASS = "";

	public static Connection getConnection() {

		try {
			Class.forName(DRIVER);

			return DriverManager.getConnection(URL, USER, PASS);

		} catch (ClassNotFoundException e) {
			throw new RuntimeException("Erro na conexão: " + e);

		} catch (SQLException e) {
			throw new RuntimeException("Erro na conexão: " + e);
		}
	}

	public static void closeConnection(Connection conn) {
		try {
			if (conn != null) {
				conn.close();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void closeConnection(Connection conn, PreparedStatement stmt) {

		closeConnection(conn);

		try {
			if (stmt != null) {
				stmt.close();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void closeConnection(Connection conn, PreparedStatement stmt, ResultSet rs) {

		closeConnection(conn, stmt);

		try {
			if (rs != null) {
				rs.close();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}