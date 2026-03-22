package Connection1;
import java.sql.*;
public class DeletePreparedStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int id=5;
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1","root","Maran@9095");
			PreparedStatement pst=con.prepareStatement("delete from employee1 where emp_id="+id);
			int rows=pst.executeUpdate();
			System.out.println("affected"+rows);
		}
		catch(SQLException e)
		{
			System.out.println(e);
			
		}
	}

}
