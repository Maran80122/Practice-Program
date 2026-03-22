package Connection;



import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CallableStatementstoreProcedure {

	static final String DB_URL = "jdbc:mysql://localhost:3306/jdbc1"; // db - database name
	static final String USER = "root";       // DB username
	static final String PASS = "Maran@9095"; // DB password

	public static void main(String[] args) {
		try {
			Connection conn1 = DriverManager.getConnection(DB_URL, USER, PASS);
			// call storeprocedure(?,?,?,?)
			CallableStatement stmt=conn1.prepareCall
					("{call sample(?,?,?,?)}");
			stmt.setInt(1, 800);
			stmt.setString(2, "manoj");
			stmt.setString(3, "M");
			stmt.setString(4, "ITI");
			stmt.executeQuery();
			System.out.println(" records inserted ");
		} catch (SQLException e) {
			System.out.println( e.getMessage());
		}
	}
}