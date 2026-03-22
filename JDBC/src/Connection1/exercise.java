package Connection1;

import java.sql.*;

public class exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// read a data from mysql to java
		
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1","root","Maran@9095");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from student1");
			while(rs.next())
			{
				System.out.println("ID is "+rs.getInt(1));
				System.out.println("Name is"+rs.getString(2));
				System.out.println("Cgpa is "+rs.getDouble(3));
			
		}
		}
			catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
}
