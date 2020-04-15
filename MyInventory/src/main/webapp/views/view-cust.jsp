<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Manager</title>
<link rel="stylesheet" href="/resources/static/css/productscss.css">
</head>
<body background="resources/static/images/back8.jpg">
<header>
<div align="center">
Welcome Admin

    <h1>Customer List</h1>
    <!--<img src="/resources/static/images/image.png"><br><br>-->
    <hr>
    
    <table class="content-table">
        <thead>
            <tr>
                <th>Customer ID</th>
                <th>Email</th>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Password</th>
                <th>Phone No.</th>
            </tr>
        </thead>
        <tbody>
        <c:forEach var="customer" items="${listCustomer}">
        
        <!--  <!-- construct an "update" link with customer id ->
							<c:url var="updateLink" value="/edit">
								<c:param name="id" value="${customer.id}" />
							</c:url>
-->
							<!-- construct an "delete" link with customer id -->
							<c:url var="deleteLink" value="/delete">
								<c:param name="id" value="${customer.id}" />
							</c:url>
        
            <tr>
                <td>${customer.id}</td>
                <td>${customer.email}</td>
                <td>${customer.fname}</td>
                <td>${customer.lname}</td>
                <td>${customer.password}</td>
                <td>${customer.phoneNo}</td>
                <td>
                   	<!-- display the update link --> 
									<a href="${updateLink}">Update</a>
									| <a href="${deleteLink}"
									onclick="if (!(confirm('Are you sure you want to delete this customer?'))) return false">Delete</a>
                </td>
               
            </tr>
             </c:forEach>
        </tbody>
    </table>
</div>  
</header> 
</body>
</html>