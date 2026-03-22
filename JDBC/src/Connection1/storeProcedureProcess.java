package Connection1;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

public class storeProcedureProcess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int id=1;
//		
//		try {
//			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1","root","Maran@9095");
//			CallableStatement cst=con.prepareCall("{call GetEmById(?)}");
//			cst.setInt(1, id);
//			
//			ResultSet rs=cst.executeQuery();
//			
//			while(rs.next())
//			{
//				System.out.println("Id is"+rs.getInt(1));
//				System.out.println("Name is"+rs.getString(2));
//				System.out.println("salary is"+rs.getInt(3));
//				
//			}
//		}
//			catch(SQLException e)
//			{
//				System.out.println(e);
//			}
//		
//	}
//
//}	
		
		
		int id=1;
		
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1","root","Maran@9095");
			CallableStatement cst=con.prepareCall("{call GetNamById(?,?)}");
			cst.setInt(1, id);
			cst.registerOutParameter(2,Types.VARCHAR);
			
			cst.executeUpdate();
			
			System.out.println(cst.getString(2));
			
		}
		
			catch(SQLException e)
			{
				System.out.println(e);
			}
	
	}
}
