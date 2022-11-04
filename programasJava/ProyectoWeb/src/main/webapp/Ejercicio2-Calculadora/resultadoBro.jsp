<%@page import="com.jacaranda.ejercicio2Calculadora.ExecutionFailure"%>
<%@page import="com.jacaranda.ejercicio2Calculadora.DivByZeroException"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.jacaranda.ejercicio2Calculadora.Calculadora" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="cssCal.css">
</head>
<body>
		
		
			<div align="center" id="calculator">
		<h1>Casio del chino</h1>
        <hr>
		
		
		
		<form>
		
		
        <div id="screen">
        	<p id="ppantalla">
		<%
			try{
            String numero = request.getParameter("numeroFinal");
            Calculadora calculator = new Calculadora(numero);

				out.println(calculator.calcular());
			}
			catch(DivByZeroException msg){
				out.println(msg.getMessage());
			}
			
        %>
		</p>
            <input type="text" id="pantalla" name="numeroFinal" value="" >
        </div>

        <br>
        
        
            <table border="2">
                <tr align="center">
                    <td><input type="hidden" value="1" name="1">1</td>
                    <td><input type="hidden" value="2" name="2">2</td>
                    <td><input type="hidden" value="3" name="3">3</td>
                    <td><input type="hidden" value="+" name="mas">+</td>
                    <td><input type="hidden" value="-" name="menos">-</td>
                </tr>

                <tr align="center">
                    <td><input type="hidden" value="4" name="4">4</td>
                    <td><input type="hidden" value="5" name="5">5</td>
                    <td><input type="hidden" value="6" name="6">6</td>
                    <td><input type="hidden" value="*" name="mult">x</td>
                    <td><input type="hidden" value="/" name="div">%</td>
                </tr>

                <tr align="center">
                    <td><input type="hidden" value="7" name="7">7</td>
                    <td><input type="hidden" value="8" name="8">8</td>
                    <td><input type="hidden" value="9" name="9">9</td>
                    <td><input type="hidden" value="." name="dot">.</td>
                    <td><input  type="hidden" value="=" name="igual">=</td>
                </tr>
                
                <tr align="center">
                	<td onclick="document.location = 'Calculadora.jsp';">C</td>
                    <td><input type="hidden" value="0" name="0">0</td>
                    <td colspan="3">Hecho por Luke</td>
                    
                    
                </tr>
					
            </table>
        </form>
	</div>

	<script src="jsCal.js"></script>
</body>
</html>