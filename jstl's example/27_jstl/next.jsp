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
		<c:when test="${param.app==1}">
			<c:redirect url="http://localhost:9090/xyz/resp.html"/>
		</c:when>
		<c:when test="${param.app==2}">
			<c:redirect url="http://www.google.com"/>
		</c:when>
		<c:when test="${param.app==3}">
			<c:redirect url="http://www.facebook.com"/>	
		</c:when>
	</c:choose>
 </body>
</html>
