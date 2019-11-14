<!doctype html>
<html lang="en">
 <head>
  <title>Document</title>
 </head>
 <body>
	<h1>Next JSP</h1>

	1.<c:out value="${requestScope.bk.bookTitle}" /></br>
	2.<c:out value="${sessionScope.bk.bookAuthor}" /></br>
	<h1>############################################</h1>
	<c:set var="book" value="${bk}" scope="session" />
	<h1>############################################</h1>
	3.<c:out value="${requestScope.bk.bookAuthor}" /></br>
	4.<c:out value="${sessionScope.book.bookPrice}" /></br>
 </body>
</html>
