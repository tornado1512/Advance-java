<%@page import ='models.*'%>
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
 <body><!--  -->
 <h1>Next Page</h1>
 <%String uname=request.getParameter("uname");%>
 <%String email=request.getParameter("email");%>
 <%String passw=request.getParameter("passw");%>
 <%String [] food=request.getParameterValues("food");%>
 Username:<%=uname%></br>
 Email:<%=email%></br>
 Password:<%=passw%></br>

			<%for(int i=0;i<food.length;i++){ %>
				Food Option <%= i+1 %>: <%= food[i] %><br />
	<% } %>
	

 </body>
</html>
