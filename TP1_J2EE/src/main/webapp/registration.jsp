<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="header.jsp" %>
	<form action="RegistrationServlet" mathod="post">
		<table id="table-1">
			<thead>
				<tr> <td>Registration  form:<td></tr>
			</thead>
			<tbody>
				<tr>
					<td>First name: </td>
					<td><input type="text" name="fname"></td>
				</tr>
				<tr>
					<td>Last name: </td>
					<td><input type="text" name="lname"></td>
				</tr>
				<tr>
					<td>Date of birth: </td>
					<td><input type="date" name="dbirth"></td>
				</tr>
				<tr>
				<tr>
					<td>email: </td>
					<td><input type="email" name="email"></td>
				</tr>
				<tr>
					<td>Mobile: </td>
					<td><input type="text" name="mobile"></td>
				</tr>
				<tr>
					<td>Username: </td>
					<td><input type="text" name="uname"></td>
				</tr>
				<tr>
					<td>Password: </td>
					<td><input type="password" name="password"></td>
				</tr>
								<tr>
					<td>Confirm Password: </td>
					<td><input type="password" name="cpassword"></td>
				</tr>
			</tbody>
			<tfoot>
				<tr>
					<th>Create your account</th>
					<th><input type="submit" name="submit" value="Register"></th>
					<th><input type="reset" value="Reset form"></th>
				</tr>
			</tfoot>
		</table>
	</form>
	<hr>
	you already have an account, <a href="login.jsp">login</a>
	
	
	<%@ include file="footer.jsp" %>
</body>
</html>