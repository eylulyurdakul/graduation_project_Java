package edu.sabanciuniv.cs.web;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import edu.sabanciuniv.cs.web.db.DBManager;

/**
 * Servlet implementation class ControllerServlet
 */
@WebServlet("/ControllerServlet")
public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String action = req.getParameter("action");
		
		if("register".equals(action))
		{
			register(req,resp);
		}
		else if ("login".equals(action))
		{
			login(req,resp);
		}	
	}

	private void login(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		
		String u = req.getParameter("username");
		String p = req.getParameter("password");
		
		DBManager dbMan= new DBManager();
		ResultSet rs = dbMan.getUser(u,p);

		try {
			if(rs.next()){
				req.getSession().setAttribute("username", rs.getString("username"));
				req.getSession().setAttribute("name", rs.getString("name")); 
				req.getSession().setAttribute("lastname", rs.getString("lastname")); 
				req.getSession().setAttribute("userId", rs.getString("id")); 
				
				req.getRequestDispatcher("dashboard.jsp").forward(req, resp);	
			}else {
				req.getRequestDispatcher("loginfail.jsp").forward(req, resp);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

	private void register(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		String name = req.getParameter("name");
		String ln = req.getParameter("lastname");
		String u = req.getParameter("username");
		String p = req.getParameter("password");
		
		System.out.println(u + " - " + p + " - " + name + " - "+ln);
		
		DBManager dbMan= new DBManager();
		boolean result = dbMan.insertUser(name,ln,u,p);
		
		if(result) {
			req.getRequestDispatcher("login.jsp").forward(req, resp);
		}else {
			req.getRequestDispatcher("fail.jsp").forward(req, resp);
		}
		
	}


}
