package sample;

import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
* Servlet implementation class FirstServlet
*/
//@WebServlet("/FIRSTSERVLET")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

  /**
   * Default constructor. 
   */
  public FirstServlet() {
      // TODO Auto-generated constructor stub
  }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			
			String n= request.getParameter("uname");
			out.print("welcome:"+n);
			out.print("<form action ='SecondServlet'>");
			out.print("<input type ='hidden' name = 'uname' value='"+n+"'>");
			out.print("<input type ='submit' value='go'>");
			out.print("</form>");
			out.close();

		}catch(Exception e){
			System.out.println(e);
			
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