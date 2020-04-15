<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration page</title>
<style>
    
        *{margin: 0; padding: 0;}
        
       header{
    background-image: linear-gradient(rgba(0,0,0,0.5),rgba(0,0,0,0.5)),url();
    height: 100vh;
    background-size: cover;
    background-position: center;
}
        
        .form-wrap{ width: 320px; background: Cornsilk; padding: 40px 20px; box-sizing: border-box; position: fixed; left: 50%; top: 50%; transform: translate(-50%, -50%);
        border-radius: 15px;
        }
        h1{text-align: center; color: #000; font-weight: normal; margin-bottom: 20px;
        border-radius: 20px;
        
        }
        
        input{width: 100%; background: none; border: 1px solid #1b4f72; border-radius: 3px; padding: 6px 15px; box-sizing: border-box; margin-bottom: 20px; font-size: 16px;
         color: mediumseagreen;
        font-family: Century Gothic;}
        
        input[type="submit"]{ background: #191970; border: 0; cursor: pointer; color: #6969696;}
        input[type="submit"]:hover{ background: #008B8B; transition: .6s;}
        
        ::placeholder{color: 0d4261;}
        
        
    </style>

</head>

<body background="resources/static/images/back3.jpg">
<header>
<div class="form-wrap">
        
            <form:form id="registrationform" action="saveCustomer" method="post" modelAttribute="customer">
            
            
                <h1>Register here</h1>
                <input type="text" name="fname" placeholder="First Name" required tabindex="2" type="text">
                <input type="text"  name="lname"placeholder="Last Name" required tabindex="3" type="text">
                <input type="text" name="Email"placeholder="Email" required tabindex="1" type="email">
                <input type="text" name="phoneNo" placeholder="phone number" required tabindex="5" type="tel"
pattern="[0-9]{10}"> 
                <input type="password"name="password" placeholder="Password" required tabindex="4" type="email">
                <input type="password" placeholder="Confirm Password">
                <input type="submit" value="Register" >
            
            </form:form>
        
        </div>
  </header>
</body>
</html>