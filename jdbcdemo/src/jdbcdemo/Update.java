package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Update {
	public static void update() throws Exception
	{
	String URL="jdbc:mysql://localhost:3306/jdbcdemo";
	String user="root";
	String pass="Maran@9095";
	

	String query="update emmployee set salary=14999 where emp_id=1 ";
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
		update();
	}
	
}
}

