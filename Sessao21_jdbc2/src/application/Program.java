package application;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;

public class Program {

	public static void main(String[] args) {
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		
		try {
			// instanciando a coneção com o banco
			conn = DB.getConnection();
			// usando a conexão para executar operações com o banco
			st = conn.createStatement();
			// salvando o resultado das alterações
			rs = st.executeQuery("select * from department");
			
			while (rs.next()) {
				// imprimindo valores que estão no ResultSet
				System.out.println(rs.getInt("Id") + ", " + rs.getString("Name"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			DB.closeResultSet(rs);
			DB.closeStatement(st);
			DB.closeConnection();
		}

	}

}
