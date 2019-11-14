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
  <link rel="stylesheet" href="css/index.css"/>
  <script src="js/index.js"></script>
 </head>
 <body>
 <div>
	<%String message=(String)request.getAttribute("errMesg");%>
	<%if(message!=null){%>
	<%=message%>
	<%}%>
 </div>
  <form action="validate.do" id="register">
  UserName<input type="text" name="uname" id="um"/>
  <span id="ummsg"  class="errmsg">*username must be greater than 3 </span>
  </br></br>
  Email<input type="email" name="email" id="em">
  <span id="emmsg" class="errmsg">invalid format of email</span>
  </br></br>
  Password<input type="password" name="passw" id="pw">
  <span id="pwmsg" class="errmsg">Password must be between 3 and 12 characters</span>
  </br></br>
  confirm password<input type="password" name="rpassw" id="rpw">
  <span id="rpwmsg " class="errmsg" >confirm passsword not match</span>
  </br></br>
  <input type="submit" >
  </form>
 </body>
</html>
