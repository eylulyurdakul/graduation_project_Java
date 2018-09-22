package edu.sabanciuniv.cs.web.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.jdbc.Statement;

import edu.sabanciuniv.cs.domain.Program;
import edu.sabanciuniv.cs.domain.Parameter;
import edu.sabanciuniv.cs.domain.Argument;

public class DBManager {

	public boolean insertUser(String name, String ln, String u, String p) {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection mySQLCon = DriverManager.getConnection("jdbc:mysql://localhost:3306/wirest", "wirestuser", "wirest");

			PreparedStatement ps = 
					mySQLCon.prepareStatement("insert into user (name,lastname,username,password) values ('"+name+"','"+ln+"','"+u+"','"+p+"')");

			int result = ps.executeUpdate();
			if(result ==1)
			{
				return true;
			}
			else{
				return false;
			}
			}
			catch (Exception e) {
				e.printStackTrace();

			}
		return false;
	}
	
	public ResultSet getUser(String u,String p) {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection mySQLCon = DriverManager.getConnection("jdbc:mysql://localhost:3306/wirest", "wirestuser", "wirest");
			
			PreparedStatement ps = 
					mySQLCon.prepareStatement("select * from user where username=? and password=?");
			ps.setString(1, u);
			ps.setString(2,p);
			ResultSet rs =  ps.executeQuery();
			
			return rs; 
		}
		catch (Exception e) {
			e.printStackTrace();

		}
		return null;

	}
	
	public boolean insertJobArguments(ArrayList<Argument> arguments,int last_job_id)
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection mySQLCon = DriverManager.getConnection("jdbc:mysql://localhost:3306/wirest", "wirestuser", "wirest");
			for(Argument arg:arguments)
			{
				String sql_query="INSERT INTO `argument`( `jobId`, `parameterId`, `value`) VALUES (?,?,?)";
				PreparedStatement ps=mySQLCon.prepareStatement(sql_query);
				ps.setInt(1, last_job_id);
				ps.setInt(2, arg.getParameterId());
				ps.setString(3, arg.getValue());
				ps.executeUpdate();
			}
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return true;
	}
	
	public ArrayList<Parameter> getAllParameters(int programId) {
		ArrayList<Parameter> parameters = new ArrayList<>();
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection mySQLCon = DriverManager.getConnection("jdbc:mysql://localhost/wirest", "wirestuser", "wirest");

			PreparedStatement ps = mySQLCon.prepareStatement("select * from parameter where programId = ? order by position");
			ps.setInt(1, programId);
			
			ResultSet rs =  ps.executeQuery();
		
			while(rs.next())
			{
				Parameter s = new Parameter(rs.getInt("id"), rs.getString("name"), rs.getInt("programId"), rs.getString("type"), rs.getString("explanation"));
				
				parameters.add(s);
			} 
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		return parameters;
	}
	
	public ArrayList<Program> getAllPrograms() {
		ArrayList<Program> programs = new ArrayList<>();
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection mySQLCon = DriverManager.getConnection("jdbc:mysql://localhost/wirest?useSSL=false", "wirestuser", "wirest");

			PreparedStatement ps = mySQLCon.prepareStatement("select * from program");
			
			ResultSet rs =  ps.executeQuery();
		
			while(rs.next())
			{
				Program s = new Program(rs.getInt("id"), rs.getString("name"), rs.getString("explanation"), rs.getString("outfilename"));
				programs.add(s);
			} 
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		return programs;
	}
	
	
	public int insertJob (String name, String userId, String programId) {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection mySQLCon = DriverManager.getConnection("jdbc:mysql://localhost:3306/wirest", "wirestuser", "wirest");

			PreparedStatement ps =   // en son hangi job insert edildi aşağıdaki kodda
					mySQLCon.prepareStatement("insert into job (name,userId, programId) values (?,?,?)",Statement.RETURN_GENERATED_KEYS);
			ps.setString(1, name);
			ps.setInt(2, Integer.parseInt(userId));
			ps.setInt(3, Integer.parseInt(programId));

			int result = ps.executeUpdate();
			
			if(result ==1)
			{
				ResultSet rs=ps.getGeneratedKeys();
				if(rs.next())
				{
					return rs.getInt(1);
				}
				
			}
			else{
				return 0;
			}
			}
			catch (Exception e) {
				e.printStackTrace();

			}
		return 0;
	}
}
