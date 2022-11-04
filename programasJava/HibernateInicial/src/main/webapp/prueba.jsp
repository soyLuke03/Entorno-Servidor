<%@page import="org.hibernate.internal.build.AllowSysOut"%>
<%@page import="com.jacaranda.model.Usuario"%>
<%@page import="com.jacaranda.model.pruebaDAO"%>
<%@page import="com.jacaranda.model.Producto"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
	pruebaDAO dao = new pruebaDAO();
	
	Usuario user1 = new Usuario(1, "Un usuario");
	dao.addOrUpdateDB(user1.getId(), user1.getNombre());
	Usuario user2 = new Usuario(2, "Dos usuario");
	dao.addOrUpdateDB(user2.getId(), user2.getNombre());
	
	Producto pr1 = new Producto("100","Una coca cola");
	user2.addProducto(pr1);
	dao.addOrUpdateProducto(String.valueOf(pr1.getId()),pr1.getNombreItem());
	

	System.out.println(user2.getProductos());
	
	dao.cerrarConexion();
	%>


</body>
</html>