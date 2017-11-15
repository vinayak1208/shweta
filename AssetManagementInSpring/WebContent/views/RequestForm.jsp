<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
          <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
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
<div class="tablebase">
<form:form action="insertRequest.asset" modelAttribute="allocation">
<table align="center">
<tr>
<td><h3>Asset Id:</h3></td>
<td><form:select path="assetId">
<form:option value="">--Select--</form:option>
			<c:forEach  items="${assetIds}" var="assetIds" >
				<form:option value="${assetIds.assetId}">${assetIds.assetId} - ${assetIds.assetName}</form:option>
			</c:forEach>
</form:select>
</td>

</tr>

<tr>
<td><h3>Employee Id:</h3></td>
<td><form:select path="empNo">
<form:option value="">--Select--</form:option>
			<c:forEach  items="${empIds}" var="empIds" >
				<form:option value="${empIds.empNo}">${empIds.empNo} - ${empIds.ename}</form:option>
			</c:forEach>
</form:select>
</td>

</tr>

<tr>
<td><h3>Quantity:</h3></td>
<td><form:input path="requestedQuantity"/><form:errors path="requestedQuantity"/></td>
</tr>

<tr>
<td></td>
<td><input type="submit" value="Submit"></td>
</tr>
</table>
</form:form>
</div>
</div>
<div class="footer">
<span>&copy;All rights reserved</span>
</div>

</body>
</html>