package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertVar {
	public static void insertvar() throws Exception
	{
	String URL="jdbc:mysql://localhost:3306/jdbcdemo";
	String user="root";
	String pass="Maran@9095";
	
//	<insert variable>
	int id=5;
	String name="gav";
	int salary=453332;
	
	
	
	String query="insert into emmployee values("+id+",'"+name+"',"+salary+")";
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
		insertvar();
	}
	
}
}	
