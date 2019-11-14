<%@page import="models.Student"%>
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
  <%Student s1=new Student("Virat",28);
	Student s2=new Student("MSD",36);
	Student [] arr={s1,s2};
	session.setAttribute("arr",arr);
  %>
  <a href="next.jsp">NextPage</a>
 </body>
</html>
