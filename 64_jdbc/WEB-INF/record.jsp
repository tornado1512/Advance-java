<%@page import="java.util.ArrayList,models.User"%>
<!doctype html>
<html lang="en">
 <head>
  <meta charset="UTF-8">
  <meta name="Generator" content="EditPlus®">
  <meta name="Author" content="">
  <meta name="Keywords" content="">
  <meta name="Description" content="">
  <title>Document</title>
 </head>
 <body>
  <% ArrayList<User> users=(ArrayList)request.getAttribute("users");%>
  <table>
	<tr>
		<td>UserId</td>
		<td>UserName</td>
		<td>Email</td>
		<td>Password</td>
	</tr>
	<%for(User users:user){%>
	<tr>
		<td><%user.getUserId()%></td>
		<td><%user.getUserName()%></td>
		<td><%user.getEmail()%</td>
		<td><%user.getPassword()%></td>
	</tr>
	<%}%>
  </table>
 </body>
</html>
