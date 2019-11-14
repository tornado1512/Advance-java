<%@page import="abc.Student"%>
<%@page import="java.util.*"%>
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
  <%ArrayList<Student> students=(ArrayList)request.getAttribute("students");%>
  <table border="1px solid blue" margin="0px auto">
		<tr>
			<th>Name</th>
			<th>Age</th>
			<th>Institution</th>
		</tr>
		<%for(Student s:students){%>
		<tr>
			<td><%=s.name%></td>
			<td><%=s.age%></td>
			<td><%=s.college%></td>
		</tr>
		<%}%>
			

  </table> 
  </body>
</html>
