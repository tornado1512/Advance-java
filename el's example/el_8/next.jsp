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
 <body>
 <h1>Next Page</h1>
 <%String uname=request.getParameter("uname");%>
 <%String email=request.getParameter("email");%>
 <%String passw=request.getParameter("passw");%>
 Username:<%=uname%></br>
 Email:<%=email%></br>
 Password:<%=passw%></br>
 
 </body>
</html>
