package br.com.indra.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexao {

	static String url = "jdbc:postgresql://localhost:5432/endereco";
	static String usuario = "postgres";
	static String senha = "postgres";
	static Connection con;

	public static Connection getConexao() throws SQLException {

		try {
			
			Class.forName("org.postgresql.Driver");
			if (con == null) {
				con = DriverManager.getConnection(url, usuario, senha);
			}
			return con;
		} catch (ClassNotFoundException e) {
			throw new SQLException(e.getMessage());
		}
	}
}
