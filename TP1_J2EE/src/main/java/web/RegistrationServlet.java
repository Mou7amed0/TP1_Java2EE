package web;

import java.io.IOException;
import java.util.Date;

import database.UserDatabase;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import metier.User;

/**
 * Servlet implementation class RegistrationServlet
 */
@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
	//private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public RegistrationServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String dbirth = request.getParameter("dbirth");
		String email = request.getParameter("email");
		String mobile = request.getParameter("mobile");
		String uname = request.getParameter("uname");
		String password = request.getParameter("password");
		
		User usr = new User(fname, lname, dbirth, email, mobile, uname, password);
		
		UserDatabase udb = new UserDatabase();
		String result = udb.insert(usr);
		response.getWriter().append("Served at: ").append(result);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String dbirth = request.getParameter("dbirth");
		String email = request.getParameter("email");
		String mobile = request.getParameter("mobile");
		String uname = request.getParameter("uname");
		String password = request.getParameter("password");
		
		User usr = new User(fname, lname, dbirth, email, mobile, uname, password);
		
		UserDatabase udb = new UserDatabase();
		String result = udb.insert(usr);		
		
	}

}
