<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="bookticket" method="post">
        <h1> Ticket booking</h1>
      <p>  coustmer name<input type="text" name="name"></p>
      <p>  source<input type="text" name="source"></p>
      <p>  destination<input type="text" name="destination"></p>
      <p>  package type<input type="text" name="packagetype"></p>
      <button>Submit</button>
      
    </form>
    <p> you ticket is booked with id ${pojo1}</p>
      <a href="linkticket">click here to get ticket data</a>
</body>
</html>