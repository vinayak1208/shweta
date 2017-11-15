<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet" type="text/css" href="../css/style.css"/>
</head>
<body>
<div class = "bgimg">
<div class="banner">
<h1>Asset Management System</h1> <p align = "right">Welcome <br/>${sessionScope.username}<br/><a href="logout.asset">LogOut</a></p>
</div>
<div class="base">   
<a href="Home.asset">Home</a> 
<a href="raiseRequest.asset">Raise Request</a>
<div class="dropdown">

		<button class="dropbtn">View Request</button>
	  	<div class="dropdown-content">
    <c:forEach var="allocId" items ="${allocId}">
     <a href="viewStatus.asset?allocationId=${allocId.allocationId}"><c:out value=" ${allocId.allocationId}"></c:out><br></a>
    </c:forEach>
    </div>
    </div>
<a href="contact.asset">Contact</a>
</div>
<table align="center" id="assetTable">
<tr>
<th>Name</th>
<th>Contact No</th>
<th>Email Id</th>
</tr>
<tr>
<th>Shweta Tripathi</th>
<td>8447483127</td>
<td>shweta.a.tripathi@capgemini.com</td>
</tr>
<tr>
<th>Vinayak Kedia</th>
<td>9874241638</td>
<td>vinayak.kedia@capgemini.com</td>
</tr>
<tr>
<th>Sayantani Banerjee</th>
<td>8981239264</td>
<td>sayantani.banerjee@capgemini.com</td>
</tr>
<tr>
<th>Rahul Mukherjee</th>
<td>9163213703</td>
<td>rahul.mukherjee@capgemini.com</td>
</tr>
<tr>
<th>Rohit Khandagale</th>
<td>8268263292</td>
<td>rohit.khandagale@capgemini.com</td>
</tr>
<tr>
<th>Pranjali Gupta</th>
<td>8958531183</td>
<td>pranjali.gupta@capgemini.com</td>
</tr>
<tr>
<th>Snehal Bagade</th>
<td>8411061349</td>
<td>snehal.bagade@capgemini.com</td>
</tr>
</table>
<div class="footer">
<span>&copy;All rights reserved</span>
</div>
</div>
</body>
</html>