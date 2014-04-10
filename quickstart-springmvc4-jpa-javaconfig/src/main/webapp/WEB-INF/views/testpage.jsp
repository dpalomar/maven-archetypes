<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="Tags.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@ include file="header.jsp" %>
<title><spring:message code="page.login.title"></spring:message></title>
</head>
<body>
<div class="wrap">
<div class="navbar navbar-inverse navbar-fixed-top">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".nav-collapse">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#"><spring:message code="page.project.title"></spring:message></a>
        </div>
        <div class="navbar-collapse collapse">
            <ul class="nav navbar-nav">
                <li class="active"><a href="#"><spring:message code="page.home"></spring:message></a></li>
                <li><a href="#about"><spring:message code="page.about"></spring:message></a></li>
                <li><a href="#contact"><spring:message code="page.contact"></spring:message></a></li>
            </ul>
            <ul class="nav navbar-nav navbar-right">
                <li> <a href="/signin" ><spring:message code="page.signin"></spring:message></a></li>
                <li><a href="/logout" ><spring:message code="page.logout"></spring:message></a></li>
            </ul>
        </div>
        <!--/.nav-collapse -->
    </div>
</div>
<div>
	<h1>Welcome. It works</h1>
</div>
</div>
</body>
</html>