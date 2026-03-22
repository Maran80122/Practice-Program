package Connection1;

import java.sql.Connection;
import java.sql.*;

public class updatereparedStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int salary=2039440;
		 try {
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1","root","Maran@9095");
				PreparedStatement pst=con.prepareStatement("update employee1 set salary="+ salary);
				int rows=pst.executeUpdate();
				System.out.println("affected"+rows);
				
		 }
		 catch(SQLException e) {
			 System.out.println(e);
			 
		 }
		 
		
		
	}

}
