package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//<read record means select * from emmployee is a rea a record>
// read in a table should be used in a executeQuery . it is useed in a resultset

public class JDBCDEMO {
	
	public static void readRecords() throws Exception
	{
	String URL="jdbc:mysql://localhost:3306/jdbcdemo";
	String user="root";
	String pass="Maran@9095";
	String query="select * from emmployee";
	try {
	Connection con=DriverManager.getConnection(URL,user,pass);
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery(query);
	while(rs.next())
	{
	System.out.println("id is"+rs.getInt(1));	
	System.out.println("name is"+rs.getString(2));
	System.out.println("salary is"+rs.getInt(3));
	}
	}
	catch(SQLException e)
	{
		 e.printStackTrace();
		
	}
	}
	public static void main(String[] args) throws Exception {
	{
		readRecords();
	}
	
}
}