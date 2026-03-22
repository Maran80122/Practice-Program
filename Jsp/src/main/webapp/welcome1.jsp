<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
String jdbcURL="jdbc:mysql://localhost:3306/db";
String username="root";
String password="root";
Connection conn=null;

try
{
	Class.forName("com.mysql.cj.jdbc.Driver");
	conn=DriverManager.getConnection(jdbcURL,username,psssword);
	// Get the driver data
	
	DatabaseMetaData metaData = conn.getMetaData();
	String driverName=metaData.getDriverName();
	out.println("JDBC Driver Name"+driverName);
}
catch(Exception e)
{
	out.println("Error"+e.getMessage());
}
finally
{
	if(conn!=null)
	{
		try
		{
			conn.close();
		}
		catch(SQLException e)
		{
			out.println("error closed"+e.getMessage());
			
		}
	}
}












out.print("welcome"+request.getParameter("uname"));
String driver=config.getInitParameter("name");
out.print("<br/> driver name is "+ driver);
%>


</body>
</html>