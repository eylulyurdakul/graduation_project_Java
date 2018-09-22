package edu.sabanciuniv.cs.web;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.ResultSet;
import java.util.ArrayList;

import edu.sabanciuniv.cs.domain.Parameter;
import edu.sabanciuniv.cs.domain.Program;
import edu.sabanciuniv.cs.domain.Argument;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.sabanciuniv.cs.web.db.DBManager;

/**
 * Servlet implementation class JobSubmissionServlet
 */
@WebServlet("/JobSubmissionServlet")
public class JobSubmissionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JobSubmissionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		DBManager dbMan= new DBManager();
		ArrayList<Program> programs = dbMan.getAllPrograms();
		req.setAttribute("programs", programs);
		req.getRequestDispatcher("jobsubmission.jsp").forward(req, resp);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String programId = req.getParameter("programId");
		String programName=req.getParameter("programName");
		DBManager dbMan= new DBManager();
		int lastJobId = dbMan.insertJob(req.getSession().getAttribute("name").toString(),req.getSession().getAttribute("userId").toString(), programId);
		
		ArrayList<Parameter> parameters = dbMan.getAllParameters(Integer.parseInt(programId));
		ArrayList<Argument> arguments = new ArrayList<Argument>();
		
		for(Parameter p : parameters) {
			Argument a= new Argument();
			a.setValue(req.getParameter(Integer.toString(p.getId())));
			a.setParameterId(p.getId());
			arguments.add(a);
		}
		
		StringBuilder sb=new StringBuilder();
		sb.append("java -cp C:\\Users\\eylulyurdakul\\Desktop\\jobs ");     // commandi database'e pathiyle yaz. burada da sadece command olsun. 
		sb.append(programName);  // historyde sadece programın adı ve argumanları ve süresi olsun. 
		for(Argument arg : arguments) {
			sb.append(" " + arg.getValue() );
		}
		
		dbMan.insertJobArguments(arguments,lastJobId);
		
		System.out.println(sb.toString());
		
		req.getRequestDispatcher("success.jsp").forward(req, resp);

		
        Process proc = Runtime.getRuntime().exec(sb.toString());
        BufferedReader reader = new BufferedReader(new InputStreamReader(proc.getInputStream()));

          String line = "";
          while((line = reader.readLine()) != null) {
              System.out.print(line + "\n");
          }
          
		
		
	}

}
