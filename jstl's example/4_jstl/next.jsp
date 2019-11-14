<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
 <%--
 <%int [] a=(int [])session.getAttribute("abc");%>
 <!--
 <!--case1-->
  <%for(int i=0;i<a.length;i++){%>
  <h1><%=a[i]%></h1>
  <%}%>--%>


  <c:forEach var="x" items="${abc}">
  <h1>${x}~~~~~~~</h1>
  </c:forEach>
 </body>
</html>
