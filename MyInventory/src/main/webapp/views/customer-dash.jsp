<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Dashboard</title>

<link rel="stylesheet" type="text/css" href="/resources/static/css/customer-dashcss.css">

</head>
<body background="/resources/static/images/back4.jpg">
<header>
<h3 style="color:red;text-align:center;position: absolute;
    top: 20%;
    left:40%;
    font-family:"Comic Sans MS", cursive, sans-serif; 
    transform: translate(-50%,-50%);">Welcome ${customer.fname} ${customer.lname} </h3>
      <div class="main">
        <!-- <div class="logo">
              <img src="logo.png">-->
          </div>
          <ul>
              <li calss="active"><a href="profile-cust">profile</a></li>
           
              <li><a href="products-cust">Products</a></li>
              <li><a href="#">Order History</a></li>
              <li><a href="logout-cust">Log Out</a></li>
          </ul>
       </div> 
          <div class="title">
              <h1>Inventory Management System</h1>  
          </div>
          
       
    </header> 
</body>
</html>