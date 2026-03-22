package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;

public class InserrtUsingPreparedStmt {
	public static void insertUsingPst() throws Exception
	{
	String URL="jdbc:mysql://localhost:3306/jdbcdemo";
	String user="root";
	String pass="Maran@9095";
	
//	<insert variable>
	int id=6;
	String name="gawtham";
	int salary=453392;
	
	
	
//	String query="insert into emmployee values("+id+",'"+name+"',"+salary+")";
	
	String query="insert into emmployee values(?,?,?)";
	try {
	Connection con=DriverManager.getConnection(URL,user,pass);
	PreparedStatement pst=con.prepareStatement(query);
	pst.setInt(1,id);
	pst.setString(2,name);
	pst.setInt(3, salary);
	int row=pst.executeUpdate();
			System.out.println("numbers of row affected"+row);
	}
	catch(SQLException e)
	{
		 e.printStackTrace();
		
	}
	}
	public static void main(String[] args) throws Exception {
	{
		insertUsingPst();
	}
	
}
}	


