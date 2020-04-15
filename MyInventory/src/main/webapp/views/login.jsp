<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Form</title>
<link rel="stylesheet" type="text/css" href="/resources/static/css/logincss.css">
</head>
<body background="/resources/static/images/back5.jpg">
<header>
<div class="loginbox">
        <img src="/resources/static/images/pic2.jpg" class="pic2">
        <h1>Login Here</h1>
         <form:form id="loginform" action="loginCustomer" method="post" modelAttribute="customer">
            <p>Username</p>
            <input type="text"name="email" placeholder="Enter your Email id">
            <p>password</p>
            <input type="password" name="password" placeholder="Enter password">
            <input type="submit" name=""value="Login">
            
                                                                
        </form:form>
    </div>
    <div style="color: red">${error}</div>
    </header>
</body>
</html>