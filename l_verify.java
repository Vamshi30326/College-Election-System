package CES_project;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class l_verify
 */
@WebServlet("/l_verify")
public class l_verify extends HttpServlet {
	private static final long serialVersionUID = 1L;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String role = request.getParameter("role");
		
		//if(login.validate(username , password , role))
		//if (role.validate("Admin"))
//		if(username == "rishik") {
			RequestDispatcher rd =request.getRequestDispatcher("vote.html");
			 rd.forward(request, response);
		/*
		//else if (role=="voter")
		{
			RequestDispatcher rd =request.getRequestDispatcher("vote.html");
			rd.forward(request, response);
		}*/
		/*else
		{
			System.out.print("WRONG CREDENTIALS");
		}*/
	//	out.close();
	}
}