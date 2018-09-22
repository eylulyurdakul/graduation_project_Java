<%@include file="index.jsp"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<link rel="stylesheet" href="/wirestProject/profile.css" type="text/css"/>
<title>Insert title here</title>
</head>
<body>


<link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css" rel="stylesheet">
<div class="container">
  <div class="row">
    <div class="col-sm-3">
      <a href="mail-compose.html" class="btn btn-danger btn-block btn-compose-email">Compose Email</a>
      <ul class="nav nav-pills nav-stacked nav-email shadow mb-20">
        <li class="active">
          <a href="#mail-inbox.html">
            <i class="fa fa-inbox"></i> ${sessionScope.username}  <span class="label pull-right">7</span>
          </a>
        </li>
        <li>
          <a href="#mail-compose.html"><i class="fa fa-envelope-o"></i> Send Mail</a>
        </li>
        <li>
          <a href="#"><i class="fa fa-certificate"></i> Important</a>
        </li>
        <li>
          <a href="#">
            <i class="fa fa-file-text-o"></i> Drafts <span class="label label-info pull-right inbox-notification">35</span>
          </a>
        </li>
        <li><a href="#"> <i class="fa fa-trash-o"></i> Trash</a></li>
      </ul>&lt;!&ndash; /.nav &ndash;&gt;

      <h5 class="nav-email-subtitle">More</h5>
      <ul class="nav nav-pills nav-stacked nav-email mb-20 rounded shadow">
        <li>
          <a href="#">
            <i class="fa fa-folder-open"></i> Promotions  <span class="label label-danger pull-right">3</span>
          </a>
        </li>
        <li>
          <a href="#">
            <i class="fa fa-folder-open"></i> Job list
          </a>
        </li>
        <li>
          <a href="#">
            <i class="fa fa-folder-open"></i> Backup
          </a>
        </li>
      </ul>&lt;!&ndash; /.nav &ndash;&gt;
    </div>
    <div class="col-sm-9">

      &lt;!&ndash; resumt &ndash;&gt;
      <div class="panel panel-default">
        <div class="panel-heading resume-heading">
          <div class="row">
            <div class="col-lg-12">
              <div class="col-xs-12 col-sm-4">
                <figure>
                  <img class="img-circle img-responsive" alt="" src="/images/husnu-yenigun.jpg">
                </figure>
                <div class="row">
                  <div class="col-xs-12 social-btns">
                    <div class="col-xs-3 col-md-1 col-lg-1 social-btn-holder">
                      <a href="#" class="btn btn-social btn-block btn-google">
                        <i class="fa fa-google"></i> </a>
                    </div>
                    <div class="col-xs-3 col-md-1 col-lg-1 social-btn-holder">
                      <a href="#" class="btn btn-social btn-block btn-facebook">
                        <i class="fa fa-facebook"></i> </a>
                    </div>
                    <div class="col-xs-3 col-md-1 col-lg-1 social-btn-holder">
                      <a href="#" class="btn btn-social btn-block btn-twitter">
                        <i class="fa fa-twitter"></i> </a>
                    </div>
                    <div class="col-xs-3 col-md-1 col-lg-1 social-btn-holder">
                      <a href="#" class="btn btn-social btn-block btn-linkedin">
                        <i class="fa fa-linkedin"></i> </a>
                    </div>
                    <div class="col-xs-3 col-md-1 col-lg-1 social-btn-holder">
                      <a href="#" class="btn btn-social btn-block btn-github">
                        <i class="fa fa-github"></i> </a>
                    </div>
                    <div class="col-xs-3 col-md-1 col-lg-1 social-btn-holder">
                      <a href="#" class="btn btn-social btn-block btn-stackoverflow">
                        <i class="fa fa-stack-overflow"></i> </a>
                    </div>
                  </div>


                </div>
              </div>
              <div class="col-xs-12 col-sm-8">
                <ul class="list-group">
                  <li class="list-group-item">${sessionScope.username} </li>
                  <li class="list-group-item">Software Engineer</li>
                  <li class="list-group-item"> Sabancı University </li>
                  <li class="list-group-item"><i class="fa fa-phone"></i> 000-000-0000 </li>
                  <li class="list-group-item"><i class="fa fa-envelope"></i> john@example.com</li>
                </ul>
              </div>
            </div>
          </div>
        </div>


        <div class="bs-callout bs-callout-danger">
          <h4>Key Expertise</h4>
          <ul class="list-group">
            <li class="list-group-item"> Lorem ipsum dolor sit amet, ea vel prima adhuc </li>
            <li class="list-group-item"> Lorem ipsum dolor sit amet, ea vel prima adhuc</li>
            <li class="list-group-item"> Lorem ipsum dolor sit amet, ea vel prima adhuc</li>
            <li class="list-group-item"> Lorem ipsum dolor sit amet, ea vel prima adhuc</li>
            <li class="list-group-item">Lorem ipsum dolor sit amet, ea vel prima adhuc</li>
            <li class="list-group-item"> Lorem ipsum dolor sit amet, ea vel prima adhuc</li>
          </ul>
        </div>
        <div class="bs-callout bs-callout-danger">
          <h4>Language and Platform Skills</h4>
          <ul class="list-group">
            <a class="list-group-item inactive-link" href="#">
              <div class="progress">
                <div data-placement="top" style="width: 80%;"
                     aria-valuemax="100" aria-valuemin="0" aria-valuenow="80" role="progressbar" class="progress-bar progress-bar-success">
                  <span class="sr-only">80%</span>
                  <span class="progress-type">Java/ JavaEE/ Spring Framework </span>
                </div>
              </div>
              <div class="progress">
                <div data-placement="top" style="width: 70%;" aria-valuemax="100" aria-valuemin="0" aria-valuenow="1" role="progressbar" class="progress-bar progress-bar-success">
                  <span class="sr-only">70%</span>
                  <span class="progress-type">PHP/ Lamp Stack</span>
                </div>
              </div>
              <div class="progress">
                <div data-placement="top" style="width: 70%;" aria-valuemax="100" aria-valuemin="0" aria-valuenow="1" role="progressbar" class="progress-bar progress-bar-success">
                  <span class="sr-only">70%</span>
                  <span class="progress-type">JavaScript/ NodeJS/ MEAN stack </span>
                </div>
              </div>
              <div class="progress">
                <div data-placement="top" style="width: 65%;" aria-valuemax="100" aria-valuemin="0" aria-valuenow="1" role="progressbar" class="progress-bar progress-bar-warning">
                  <span class="sr-only">65%</span>
                  <span class="progress-type">Python/ Numpy/ Scipy</span>
                </div>
              </div>
              <div class="progress">
                <div data-placement="top" style="width: 60%;" aria-valuemax="100" aria-valuemin="0" aria-valuenow="60" role="progressbar" class="progress-bar progress-bar-warning">
                  <span class="sr-only">60%</span>
                  <span class="progress-type">C</span>
                </div>
              </div>
              <div class="progress">
                <div data-placement="top" style="width: 50%;" aria-valuemax="100" aria-valuemin="0" aria-valuenow="50" role="progressbar" class="progress-bar progress-bar-warning">
                  <span class="sr-only">50%</span>
                  <span class="progress-type">C++</span>
                </div>
              </div>
              <div class="progress">
                <div data-placement="top" style="width: 10%;" aria-valuemax="100" aria-valuemin="0" aria-valuenow="50" role="progressbar" class="progress-bar progress-bar-danger">
                  <span class="sr-only">10%</span>
                  <span class="progress-type">Go</span>
                </div>
              </div>
              <div class="progress-meter">
                <div style="width: 25%;" class="meter meter-left"><span class="meter-text">I suck</span></div>
                <div style="width: 25%;" class="meter meter-left"><span class="meter-text">I know little</span></div>
                <div style="width: 30%;" class="meter meter-right"><span class="meter-text">I'm a guru</span></div>
                <div style="width: 20%;" class="meter meter-right"><span class="meter-text">I''m good</span></div>
              </div>
            </a>
          </ul>
        </div>

      </div>
    </div>
    &lt;!&ndash; resume &ndash;&gt;

  </div>
</div>
</div>

</body>
</html>