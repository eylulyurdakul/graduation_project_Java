<%@include file="index.jsp"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.ArrayList" %> 
<%@ page import="edu.sabanciuniv.cs.domain.Program" %> 
<% ArrayList<Program> programList = (ArrayList) request.getAttribute("programs"); %> 
 
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<link rel="stylesheet" href="/wirestProject/jobsubmission.css" type="text/css"/>

<title>Insert title here</title>
</head>
<body>

<div class="container" id="tourpackages-carousel">

  <div class="row">

<% for (Program program : programList) {%>

  

    <div class="col-xs-18 col-sm-6 col-md-3">
      <div class="thumbnail">
        <img src="/wirestProject/images/5.png" alt="">
        <div class="caption">
          <h4><%= program.getName()  %></h4>
          <p><%= program.getExplanation() %></p>
          <p><a href="ParameterServlet?programId=<%= program.getId() %>&programName=<%=program.getName() %>" class="btn btn-info btn-s" role="button">Select job</a> </p>
        </div>
      </div>
    </div>

<% } %>    


  </div><!-- End row -->

</div><!-- End container -->

</body>
</html>