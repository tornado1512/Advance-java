<%@page import="abc.Student"%>

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
  <%Student student=(Student)request.getAttribute("student");%>
  Student name:<%=student.name%></br>
 Student age :<%=student.age%></br>
 Student college: <%=student.college%></br>
 </body>
</html>
