package Connection1;

import java.sql.*;


public class callingStatement {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1","root","Maran@9095");
			CallableStatement cst=con.prepareCall("{call GetEmp()}");
			ResultSet rs=cst.executeQuery();
			
			while(rs.next())
			{
				System.out.println("Id is"+rs.getInt(1));
				System.out.println("Name is"+rs.getString(2));
				System.out.println("salary is"+rs.getInt(3));
				
			}
		}
			catch(SQLException e)
			{
				System.out.println(e);
			}
	
	}

}
