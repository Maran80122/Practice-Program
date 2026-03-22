package jdbcdemo;

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
import java.sql.*;

//<insert a data in insert value in insert into tablename>
// insert should be in a java used in executeUpdate .it is a used in a int 
public class Jdbc1 {
		public static void insertRecords() throws Exception
		{
		String URL="jdbc:mysql://localhost:3306/jdbcdemo";
		String user="root";
		String pass="Maran@9095";
		String query="insert into emmployee values(4,'ricky',58393)";
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
			insertRecords();
		}
		
	}
	}
