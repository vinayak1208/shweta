<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="CustomerComplaint.css" rel="stylesheet">
</head>
<body>
<h1>Check Status</h1>
<hr>
<br>

<div class="mydiv">
<form action="CustomerComplaintId.cust">
<table>
<tr>
<td>Complaint Id</td>
<td><input type="text" name="complaintId" required/>
</td>
</tr>
</table>
<br>
<br>
<input type="submit" value="CheckStatus">
</form>
</div>	
<table>
<tr>
<td>Complaint Id</td>
<td>Description</td>
<td>Status</td>
</tr>
<tr>
<td>${bean.complaintId}</td>
<td>${bean.description}</td>
<td>${bean.status}</td>
</tr>
</table>



<br>
<br>

<div class="mydiv">
<a href="RegisterComplaint.cust">Raise Complaint</a>
</div>
</body>
</html>