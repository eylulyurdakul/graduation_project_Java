package edu.sabanciuniv.cs.web;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.sabanciuniv.cs.domain.Program;
import edu.sabanciuniv.cs.domain.Parameter;
import edu.sabanciuniv.cs.web.db.DBManager;

/**
 * Servlet implementation class ParameterServlet
 */
@WebServlet("/ParameterServlet")
public class ParameterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ParameterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String programId = req.getParameter("programId");
		DBManager dbMan= new DBManager();
		ArrayList<Parameter> parameters = dbMan.getAllParameters(Integer.parseInt(programId));
		
		req.setAttribute("parameters", parameters);
		req.setAttribute("programId",programId);
		req.setAttribute("programName",req.getParameter("programName"));
		req.getRequestDispatcher("parameter.jsp").forward(req, resp);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
