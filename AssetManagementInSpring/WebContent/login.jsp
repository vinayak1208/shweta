<%@ taglib uri ="http://java.sun.com/jsp/jstl/core" prefix = "c" %>
 
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/style.css"/>
</head>

<body>

<div class="banner">
<h1>Asset Management System</h1>
</div>
  <div class="bgimg">
	  <form  action="checkLogin.asset">
	  
	  <table class="LoginTable" align = "center">
	<!-- <tr><td colspan = "2"><h1 align = "center">Login</h1></td></tr> -->

		<tr>
			<td><h3>User name</h3></td>
			<td><input type = "text" name = "userName"/></td>
		</tr>
		
		<c:if test="${user!=null}">
			
			<tr>
				<td></td>
				
				<td>
					<font color="red" size = "2px">
						<b><i><c:out value="${user}"></c:out></i></b>
					</font>
				</td>
			</tr>
		</c:if>
		<tr>
			<td><h3>Password</h3></td>
			<td><input type = "password" name = "userPassword" /></td>
		</tr>
		
		<c:if test="${pass!=null}">
			<tr>
				<td></td>
				
				<td>
					<font color="red" size = "2px">
						<b><i><c:out value="${pass}"></c:out></i></b>
					</font>
				</td>
			</tr>
		</c:if>
		
		<tr>
			<td></td>
			<td><input type = "submit" value = "LogIn"/></td>
		</tr>
		
		<tr>
			<td colspan = "2" align = "center">
				<font color = "red"><b><c:out value="${message}"></c:out></b></font>
			</td>
		</tr>
	</table>
	
	
	  </form>

	</div>
<div class="footer">
<span>&copy;All rights reserved</span>
</div>



</body>
</html>
