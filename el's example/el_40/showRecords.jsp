<%@taglib prefix="s" uri="project1"%>
<%@taglib prefix="t" uri="project2"%>
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
  ${s:showStates(sessionScope.states)}

  </br></br></br>

  ${t:showCities(sessionScope.cities)}
 </body>
</html>
