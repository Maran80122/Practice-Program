package Connection1;
import java.sql.*;
public class insertData {

	public static void main(String args[]) {
		
		String url="jdbc:mysql://localhost:3306/jdbc1";
		String uname="root";
		String pass="Maran@9095";
//		String query="insert into employee1 values(3,'varun',453433)";
		
//		or
		int id=5;
		String name="akash";
		int salary=3434323;
		String query="insert into employee1 values("+id+",'"+ name +"',"+ salary+");";
		try {
			Connection con=DriverManager.getConnection(url,uname,pass);
			Statement stmt=con.createStatement();
			int rows=stmt.executeUpdate(query);
			System.out.println("number of rows"+rows);
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
	}
	
}
