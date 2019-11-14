<%@page import="javax.servlet.http.*"%>

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
 <div>
	<%String message=(String)request.getAttribute("errMesg");%>
	<%if(message!=null){%>
	<%=message%>
	<%}%>
 </div>
  <form action="validate.do">
  UserName<input type="text" name="uname"/></br></br>
  Email<input type="email" name="email"></br></br>
  Password<input type="password" name="passw"></br></br>
  Repassword<input type="password" name="rpassw"></br></br>
  <input type="submit" >
  </form>
 </body>
</html>
