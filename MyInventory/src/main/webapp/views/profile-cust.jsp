<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Your Details Here</title>
</head>
<body>
<div align="center">
        <h1>Edit Your Details</h1>
        <br />
         <form:form id="customer-profile" action="/saveCustomerP" method="post" modelAttribute="customer">
        
 
            <table border="0" cellpadding="10">
                <tr>             
                    <td>Customer ID:</td>
                    <td>
                        <input type="text" name="id" value=${customer.id} readonly="readonly" />
                    </td>
                </tr>        
                <tr>             
                    <td>Customer First Name:</td>
                    <td>
                        <input type="text" name="fname" value=${customer.fname} >
                    </td>
                </tr>
                <tr>             
                    <td>Customer Last Name:</td>
                    <td>
                        <input type="text" name="lname" value=${customer.lname} >
                    </td>
                </tr>
                <tr>
                    <td>Email:</td>
                    <td><input type="text" name="email" value=${customer.email}></td>
                </tr>
                <tr>
                    <td>Password:</td>
                    <td><input type="text" name="password" value=${customer.password} ></td>
                </tr>
                <tr>
                    <td>Phone No:</td>
                    <td><input type="text" name="phoneNo" value=${customer.phoneNo}></td>
                </tr>                            
                <tr>
                    <td colspan="2"><button type="submit">Save</button> </td>
                </tr>
            </table>
       </form:form>
    </div>
</body>
</html>