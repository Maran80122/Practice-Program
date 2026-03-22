package Connection1;
import java.sql.*; 

public class Program1 {

	public static void main(String[] args) {
		
		// this is one method  read a data from mysql to  java
		
//				try {
//					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1","root","Maran@9095");
//					Statement stmt=con.createStatement();
//					ResultSet rs=stmt.executeQuery("select * from employee1");
//					rs.next();
//					System.out.println("ID is "+rs.getInt(1));
//					System.out.println("Name is "+rs.getString(2));
//					System.out.println("Salary is "+rs.getInt(3));
//					
//					
//				} catch (SQLException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//	
				
				//another method is a  read a data from mysql to  java
				
				String url="jdbc:mysql://localhost:3306/jdbc1";
				String name="root";
				String pass="Maran@9095";
				String query="select * from employee1";
				
			
				try {
					Connection con = DriverManager.getConnection(url,name,pass);
					Statement stm=con.createStatement();
					ResultSet rs=stm.executeQuery(query);
					
					while(rs.next())
					{
						System.out.println("Id is"+rs.getInt(1));
						System.out.println("Name is"+rs.getString(2));
						System.out.println("Name is"+rs.getInt(3));
						
					}
					con.close();
					
				} 
				 
				
				catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
				
				
				

	}

}
