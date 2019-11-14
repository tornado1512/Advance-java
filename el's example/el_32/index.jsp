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
  <%
	String s1=null;
	String s2="";
	String s3="mohan";
	request.setAttribute("a",s1);
	request.setAttribute("b",s2);
	request.setAttribute("c",s3);
  %>
  ${empty a}</br></br></br>
  ${empty b}</br></br></br>
  ${empty c}</br></br></br>
 </body>
</html>
