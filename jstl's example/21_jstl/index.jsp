<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
  <%HashMap map = new HashMap();
  map.put("abc",123);
  request.setAttribute("records",map);
  %>
  <c:out value="${records.abc}"/>
  <c:set target="${records}" property="xyz" value="456"/>
<c:out value="${records}"/>
 </body>
</html>
