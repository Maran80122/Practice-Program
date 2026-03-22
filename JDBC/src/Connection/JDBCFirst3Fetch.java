package Connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCFirst3Fetch {
	

	static final String DB_URL="jdbc:mysql://localhost:3306/JDBC"; //database name
	static final String USER="root";
	static final String PASS="Maran@9095";
	
	static Connection conn1=null;
	public static void main(String args[])
	{
		try {
			conn1=DriverManager.getConnection(DB_URL,USER,PASS);
			Statement stmt=conn1.createStatement();
//			String sql="Select * from emp1 limit 3";
//			String sql="Select * from emp1 where emp_FirstName like 'S%' and emp_LastName like '%a'";
//			String sql="Select * from emp1 where emp_Destignation='Tester'";
			String sql="Select emp_FirstName,count(*) from emp1 group by emp_FirstName having count(*)>1 ";
			
			ResultSet rs=stmt.executeQuery(sql);
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
