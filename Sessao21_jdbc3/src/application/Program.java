package application;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import db.DB;

public class Program {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
		Connection conn = null;
		PreparedStatement st = null;
		try {
			conn = DB.getConnection();
			// comando SQL
			st = conn.prepareStatement(
					"INSERT INTO seller " +
					"(Name, Email, BirthDate, BaseSalary, DepartmentId)" +
					"VALUES " +
					"(?, ?, ?, ?, ?)",
					Statement.RETURN_GENERATED_KEYS);
			//cada ? corresponde a um dos valores de 1 a n
			st.setString(1, "Carl Purple");
			st.setString(2, "carl@gmail.com");
			st.setDate(3, new Date(sdf.parse("22/04/1985").getTime()));
			st.setDouble(4, 3000);
			st.setInt(5, 4);
			
			// quantidade de linhas afetadas
			int rowsAffected = st.executeUpdate();
			
			if (rowsAffected > 0) {
				ResultSet rs = st.getGeneratedKeys();
				while (rs.next()) {
					int id = rs.getInt(1);
					System.out.println("Done! Id = " + id);
				}
			} else {
				System.out.println("No rowns affected");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		} finally {
			DB.closeStatement(st);
			DB.closeConnection();
		}
		
		
		

	}

}
