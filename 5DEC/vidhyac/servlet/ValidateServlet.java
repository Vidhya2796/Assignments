package com.vidhyac.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vidhyac.dao.IUserDAO;
import com.vidhyac.dao.InvalidUserException;
import com.vidhyac.dao.UserDAO;
import com.vidhyac.util.DAOUtility;

/**
 * Servlet implementation class ValidateServlet
 */
@WebServlet("/validate")
public class ValidateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName,password;
		PrintWriter out=response.getWriter();
		
		userName=request.getParameter("userName");
		password=request.getParameter("password");
		String userType="Invalid";
		try {
			 userType=getUserType(userName,password);
		 
		
		RequestDispatcher requestDispatcher=null; 
		
		
		if (userType.equals("Admin")) {
			//out.print("<h1>Hello Admin "+userName+"</h1>");
			requestDispatcher=request.getRequestDispatcher("/admin");//its like giving address...giving addr doesn't mean we reached the area..Inorder to reach that area physically with the help of address using requestdispatcher's forward function
		}
		else if (userType.equals("User")) {
			requestDispatcher=request.getRequestDispatcher("/user");
			//out.print("<h1>Hello User "+userName+"</h1>");
		}
		else {
			requestDispatcher=request.getRequestDispatcher("/invalid");
			//out.print("<h1>Invalid User!</h1>");
		}
		requestDispatcher.forward(request, response);
		
		//out.print("<h1>Hello Everyone!</h1>");
		}catch (InvalidUserException e) {
			//out.print("<h1>Invalid User!</h1>");
			out.println(e.getMessage());
		}
		
	}



	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	//below is method definition
	private String getUserType(String userName, String password) {//interface method(Movie ticket booking in online...that BookMyShow acts like a interface to book ticket for a particular theatre..that theatre is an actual object)
		//return "Admin";
		//creating UserDAO object and refering it to the IUserDAO interface-->this is called loose coupling
		//IUserDAO dao=new UserDAO();//DAO-->Data Access Object
		IUserDAO dao=DAOUtility.getUserDAO();
		return dao.getUserType(userName, password);//method calling
	}

}
