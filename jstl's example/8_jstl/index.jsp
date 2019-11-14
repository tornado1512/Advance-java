<%@page import ="java.util.HashMap"%>
<!doctype html>
<html lang="en">
 <head>
  <meta charset="UTF-8">
  <title>Document</title>
 </head>
 <body>
   <%HashMap map=new HashMap();%>
  <%map.put("a1",11);%>
  <%map.put("a2",21);%>
  <%map.put("a3",31);%>
  <%map.put("a4",41);%>
  <%session.setAttribute("abc",map);%>
  <a href="next.jsp">click here</a>
 </body>
</html>
