package Connection1;
import java.sql.*;
public class rollBack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1","root","Maran@9095");
			Statement stst=con.createStatement();
			con.setAutoCommit(false);
			stst.addBatch("update employee1 set salary=55000 where emp_id=1");
			stst.addBatch("update employee1 set salary=55000 where emp_id=2");
			stst.addBatch("update employee1 set salary=55000 where emp_id=3");
			stst.addBatch("update employee1 set salary=55000 where emp_id=4");
			
		int results[]=stst.executeBatch();
		for(int i:results)
		{
			if(i>0)
			{
				continue;
			}
			else
			{
				con.rollback();
			}
		}
		con.commit();
		}
	catch(SQLException e)
		{
		  System.out.println(e);
		}

	}

}
