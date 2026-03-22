package Connection1;

import java.sql.*;

public class insertPreparedStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String url="jdbc:mysql://localhost:3306/jdbc1";
		String uname="root";
		String pass="Maran@9095";
		
		int id=4;
		String name="deva";
		int salary=222443;
		String query="insert into employee1 values(?,?,?)";
		try {
			Connection con=DriverManager.getConnection(url,uname,pass);
			PreparedStatement pst=con.prepareStatement(query);
			pst.setInt(1,id);
			pst.setNString(2,name);
			pst.setInt(3,salary);
			int rows=pst.executeUpdate();
			System.out.println("affected"+rows);
			
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}

	}

}
