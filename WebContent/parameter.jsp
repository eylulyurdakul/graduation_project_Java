<%@include file="index.jsp"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.ArrayList" %> 
<%@ page import="edu.sabanciuniv.cs.domain.Parameter" %> 
<% ArrayList<Parameter> parameterList = (ArrayList) request.getAttribute("parameters"); %> 

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">


<title>Enter parameters</title>
</head>
<body>


<div class="container">
	<form action="JobSubmissionServlet" method="post">
	<input type="hidden" name="programId" value=<%=request.getAttribute("programId") %> >
	<input type="hidden" name="programName" value=<%=request.getAttribute("programName") %> >
	
    <div class="row clearfix">
		<div class="col-md-12 column">
			<table class="table table-bordered table-hover" id="tab_logic">
				<thead>
					<th>
						Parameter Name
					</th>
					<th>
						Parameter Explanation
					</th>
					<th>
						Parameter Value
					</th>
					
				</thead>
				<tbody>
				<% for (Parameter parameter : parameterList) {%>
						<tr>
						<td class="text-center">
							<%= parameter.getName() %>
						</td>
						<td>
						<%= parameter.getExplanation() %>
						</td>
						<td>
						<input type="text" name='<%= parameter.getId() %>'  placeholder=' <%= parameter.getType() %>' class="form-control"/>
						</td>
						</tr>
							<% } %> 
					
                    
				</tbody>
			
			</table>
		</div>
	</div>
	<input type="submit" value="Submit" class="btn btn-info btn-block">
	</form>
</div>
   

</body>
</html>