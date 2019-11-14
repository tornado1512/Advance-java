<%@page import="models.Student,java.util.*"%>

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
  <h1>Next Jsp Page</h1>

  <%ArrayList<Student> students=(ArrayList)request.getAttribute("students");%>
	<table border="1">
		<tr>
			<td>Name</td>
			<td>Age</td>
			<td>College</td>
			<td>Degree</td>
		</tr>
		<%for(Student st:students){%>
		<tr>
		<td><%=st.getName()%></td>
		<td><%=st.getAge()%></td>
		<td><%=st.getCollege()%></td>
		<td><%=st.getDegree()%></td>
		</tr>
		<%}%>
	</table>

 </body>
</html>
