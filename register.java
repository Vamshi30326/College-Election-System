package CES_project;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class register
 */
@WebServlet("/register")
public class register extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String role = request.getParameter("role");
		System.out.println(username);
		System.out.println(role);
		
		try
		{  
		  Class.forName("com.mysql.jdbc.Driver");
		  Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ces","root","vamshi123");
		  PreparedStatement ps = con.prepareStatement("insert into ces_login2 values(?,?,?)");  		     
		     ps.setString(1,username);  
		     ps.setString(2, password);
		     ps.setString(3, role);
		     int i = ps.executeUpdate();  
		     if(i>0)  
		     System.out.print("REGISTERED SUCCESSFULLY...");  
		     System.out.print("<a href='login.html'>Login</a>");

		}
		catch (Exception ex)
		{
		     ex.printStackTrace();
		}  
	}

}
