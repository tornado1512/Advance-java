<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
<c:choose>
	<c:when test="${param.price<=200}">
		<h1>Buy it</h1>
	</c:when>
	<c:when test="${param.price<=400}">
		<h1>buy it later</h1>
	</c:when>
	<c:otherwise>
		<h1>dont buy</h1>
	</c:otherwise>
</c:choose>

 <%--
 <% int price=Integer.parseInt(request.getParameter("price"));%>
  <%if(price<=200) {%>
  <h1>Buy It!<h1>
  <%}else if(price<=400) {%>
  <h1>Buy It later!<h1>
  <%}else{%>
  <h1>Dont buy it</h1>
  <%}%>
  --%>
 </body>
</html>
