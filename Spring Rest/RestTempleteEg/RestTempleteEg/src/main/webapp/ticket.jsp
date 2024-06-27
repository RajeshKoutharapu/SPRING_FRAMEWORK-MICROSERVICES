<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="getticket" method="get">
  <p>Enetr ticket id <input type="text" name="id"></p>
  <button>sumit</button>
</form>
     
  <p> Name : ${data.id}</p>
  <hr>
    <p>Location :${data.name}</p>  <hr>
      <p>Age : ${data.source}</p>  <hr>
        <p> Doctor name:${data.destination}</p>  <hr>
          <p> RigesterDay :${data.packagetype}</p>  <hr>
            

</body>
</html>