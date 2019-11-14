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
  <%User user=(User)request.getAttribute("user");%>
  <%=user.getAge()%>
  <%=user.getName()%>
  <%=user.getAddress().getState().getStateName()%>
  <%=user.getAddress().getCity().getCityName()%>
 </body>
</html>
