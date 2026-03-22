package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCUpdateStatement {
	
	
	static final String DB_URL="jdbc:mysql://localhost:3306/JDBC"; //database name
	static final String USER="root";
	static final String PASS="Maran@9095";
	
	// connection throw the driver manager
	// using try established connection and statement
	
	
	static Connection conn1=null;  //connection to be null
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			try {
				conn1=DriverManager.getConnection(DB_URL,USER,PASS);
				//create the statement  w.r.t. SQL
				Statement stmt=conn1.createStatement();
					String sql="UPDATE emp1 set emp_LastName='dev' where emp_id=3";
					stmt.executeUpdate(sql);
				 final String query="select * from emp1";
					ResultSet rs=stmt.executeQuery(query);
			//printing the record  using next()
				while(rs.next())
				{
					System.out.println("ID"+" "+rs.getInt(1));
					System.out.println("FirstName"+" "+rs.getString(2));
					System.out.println("LastName"+" "+rs.getString(3));
					System.out.println("Destingation"+" "+rs.getString(4));
					
				}
			}
			catch(SQLException e)
			{
				System.out.println(e);
			}

	}

}
