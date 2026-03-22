package Connection1;
import java.sql.*;

public class exercisePreparedStmtInsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int id=4;
		String name="ricky";
		double cgpa=7.8;
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1","root","Maran@9095");
			PreparedStatement pst=con.prepareStatement("insert into student1 values(?,?,?)");
			pst.setInt(1, id);
			pst.setNString(2, name);
			pst.setDouble(3, cgpa);
			int rows=pst.executeUpdate();
		System.out.println("affected"+rows);
		}	
		catch(SQLException e)
		{
			System.out.println(e);
		}
	}

}
