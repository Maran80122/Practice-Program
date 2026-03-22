package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete {
	public static void delete() throws Exception
	{
	String URL="jdbc:mysql://localhost:3306/jdbcdemo";
	String user="root";
	String pass="Maran@9095";
	
	int id=5;
	String query="delete from emmployee where emp_id= "+id;
	try {
	Connection con=DriverManager.getConnection(URL,user,pass);
	Statement st=con.createStatement();
	int row=st.executeUpdate(query);
			System.out.println("numbers of row affected"+row);
	}
	catch(SQLException e)
	{
		 e.printStackTrace();
		
	}
	}
	public static void main(String[] args) throws Exception {
	{
		delete();
	}
	
}
}


