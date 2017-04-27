<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/login_header/login_header.jsp" %>
 <!doctype html>
 <html lang="en">
 <head>
 	<meta charset="UTF-8" />
 	<meta name="viewport" content="width=device-width">
 	<title>Hanbit Hospital</title>
 	 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
     <script src="https://d1p7wdleee1q2z.cloudfront.net/post/search.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
 	<link rel="stylesheet" href="${context}/resources/css/reset.css"/>
 	<link rel="stylesheet" href="${context}/resources/css/app.css"/>
 	<script src="${context}/resources/js/app.js"></script>
 	<script src="${context}/resources/js/cookie.js"></script>
 	<script src="${context}/resources/js/fileUpload.js"></script>
 	

 </head>
 <body>
  <nav id='boot-nav' class="navbar navbar-inverse">
  <div class="container-fluid">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a id="brand" href="#">${context}</a>
    </div>
    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
        <li class="active"><a id="" href="#">Hospital<span class="sr-only">(current)</span></a></li>
        <li><a id="bbs" href="#">BBS</a></li>
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Algorithm<span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a id="series" href="#">Series</a></li>
            <li><a id="arr" href="#">Array</a></li>
            <li><a id="matrix" href="#">Matrix</a></li>
            <li><a id="math" href="#">Math</a></li>
            <li><a id="appl" href="#">Application</a></li>
          </ul>
        </li>
      </ul>
      <form class="navbar-form navbar-left">
        <div class="form-group">
          <input type="text" class="form-control" placeholder="Search">
        </div>
        <button type="submit" class="btn btn-default">Submit</button>
      </form>
      <ul class="nav navbar-nav navbar-right">
        <li><a href="#">Link</a></li>
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">OOP <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a id="encap" href="#">Encapsulation</a></li>
            <li><a id="inhreit" href="#">Inheritance</a></li>
            <li><a id="poly" href="#">Polymorphism</a></li>
          </ul>
        </li>
      </ul>
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>
<div id="wrapper">
</div>
  <script>
 	app.context.init('${context}');
  </script>
   </body>
 </html>