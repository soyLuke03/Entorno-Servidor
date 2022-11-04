<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>salida.jsp</title>
</head>
<body>

	<%String nombre = request.getParameter("Nombre"); %>
	<%String edad = request.getParameter("Edad");%>


	<p>Hola  <%= nombre %></p>
	
	<p>
	<%if(Integer.valueOf(edad) <= 17){
		%>Eres un poco joven bro
	<%}
	else if(Integer.valueOf(edad) >18 && Integer.valueOf(edad) <30){
		%>Eres un chaval
	<%}else{
		%>Eres un viejo tio...<% 
	}%>
	</p>
	
</body>
</html>