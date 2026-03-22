package com.crud.index;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Servlet implementation class UserNew
 */
@WebServlet("/UserNew")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String action = request.getParameter("action");
		if(action==null) 
			action="list";
		switch(action) {
		case "new":
			showAddForm(request,response);
			break;
		case "insert":
			insertUser(request,response);
			break;
		case "delete":
			deleteUser(request,response);
			break;
		case "edit":
			showEditForm(request,response);
			break;
		case "update":
			updateUser(request,response);
			break;
			default:
			listUsers(response);
		}
		
	}
	private void  showAddForm(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<h2>Add a New User</h2>");
		out.println("form action ='user?action=insert'method='post'>");
		out.println("Id: <input type = 'number' name='id'/<br/>");
		out.println("Name: <input type = 'text' name='name'/<br/>");
		out.println("Email: <input type = 'email' name='email'/<br/>");
		out.println("<input type = 'submit' value='Add'/>");
		out.println("</form>");
		out.println("</body><html>");
		}
	private void insertUser(HttpServletRequest request, HttpServletResponse response)throws IOException{
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		try(Connection conn = DButil.getConnection()){
			String sql = "Insert into Users(name.email) values(?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1,id);
			ps.setString(2,name);
			ps.setString(3,email);
			ps.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		response.sendRedirect("user");
		
	}
	private void listUsers( HttpServletResponse response)throws IOException{
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<h2>User List</h2>");
		out.println("<a href='user?action=new'>AddUser</a><br><br>");
		out.println("<table border='1'><tr>"
				+ "<th>ID</th>"
				+ "<th>Name</th>"
				+ "<th>Email</th>"+
				"<th>Actions</th></tr>");
		
	
try(Connection conn = DButil.getConnection()){
	String sql = "Select * from Users";
	PreparedStatement ps = conn.prepareStatement(sql);
	ResultSet rs =ps.executeQuery();
	while(rs.next()) {
		int id = rs.getInt("id");
		out.println("<tr><td>"+id+"</td>");
		out.println("<td>"+rs.getString("name")+"</td>");
		out.println("<td><a href='user?action=edit&id'="+id+">Edit</a>|"
				+ "<a href ='user?action=delete&id=\"+id+\"onclick = 'return confirm(\'Delete?\");'>"
				+ "Delete</a></td></tr>");
	}
}
catch(SQLException ex) {
	ex.printStackTrace();
}
	
	}
	private void updateUser(HttpServletRequest request, HttpServletResponse response)throws IOException{
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		try(Connection conn = DButil.getConnection()){
			String sql = "Update users set name =?, email=? WHERE id=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(2,name);
			ps.setString(3,email);
			ps.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
			
		}
	private void deleteUser(HttpServletRequest request, HttpServletResponse response)throws IOException{
		int id = Integer.parseInt(request.getParameter("id"));
		try(Connection conn = DButil.getConnection()){
			String sql = "Delete * from Users id=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1,id);
			ps.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
			
		}
	private void showEditForm(HttpServletRequest request, HttpServletResponse response)throws IOException{
		PrintWriter out= response.getWriter();
		int id = Integer.parseInt(request.getParameter("id"));
		try(Connection conn = DButil.getConnection()){
			String sql = "Select * from Users Where id=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1,id);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				out.println("<html><body>");
				out.println("<h2>Edit User</h2>");
				out.println("<form action='user?action=insert' method='post'>");
				out.println("Id: <input type='number' name='id' value='" + id + "'/><br/>");
				out.println("Name: <input type='text' name='name' value='" + rs.getString("name") + "'/><br/>");
				out.println("Email: <input type='email' name='email' value='" + rs.getString("email") + "'/><br/>");
				out.println("<input type='submit' value='Update'/>");
				out.println("</form>");
				out.println("</body></html>");
			}
				
			}
		catch(SQLException ex) {
			ex.printStackTrace();
		}
			
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}