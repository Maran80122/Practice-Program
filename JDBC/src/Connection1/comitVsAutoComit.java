package Connection1;

import java.sql.*;

public class comitVsAutoComit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			try {
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1","root","Maran@9095");
				Statement stst=con.createStatement();
				con.setAutoCommit(false);
				int rows1=stst.executeUpdate("update employee1 set salary=55000 where emp_id=1");
				int rows2=stst.executeUpdate("update employee1 set salary=55000 where emp_id=2");
				System.out.println("sffected"+rows1);				
				System.out.println("sffected"+rows2);	
				if(rows1>0 && rows2>0)
				{
					con.commit();
				}
			}
		catch(SQLException e)
			{
			  System.out.println(e);
			}
	}

}
