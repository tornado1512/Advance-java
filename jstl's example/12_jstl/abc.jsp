<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html lang="en">
 <head>
  <title>Document</title>
 </head>
 <body>
 <table border="2">
 <c:forEach var="ar" items="${list}">
	<tr>
		<c:forEach var="y" items="${ar}">
			<td>${y}</td>
		</c:forEach>
	</tr>
 </c:forEach>
  </table>
 </body>
</html>
