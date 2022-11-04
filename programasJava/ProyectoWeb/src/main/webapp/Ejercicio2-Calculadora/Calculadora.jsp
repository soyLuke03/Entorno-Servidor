<%@page import="javax.swing.text.html.HTML"%>
<%@page import="com.jacaranda.ejercicio2Calculadora.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<title>Calculator</title>

	<link rel="stylesheet" href="cssCal.css">
</head>
<body>
	<div align="center" id="calculator">
		<h1>Casio</h1>
        <hr>
		
		
		
		<form method="get" action="resultadoBro.jsp" name="formulario1">
		
		
        <div id="screen">
        	<p id="ppantalla"></p>
            <input type="text" id="pantalla" name="numeroFinal" value="" >
        </div>

        <br>
        
        
            <table border="2">
                <tr align="center">
                    <td onclick="ponerNumero1()"><input type="hidden" value="1" name="1">1</td>
                    <td onclick="ponerNumero2()"><input type="hidden" value="2" name="2">2</td>
                    <td onclick="ponerNumero3()"><input type="hidden" value="3" name="3">3</td>
                    <td onclick="suma()"><input type="hidden" value="+" name="mas">+</td>
                    <td onclick="resta()"><input type="hidden" value="-" name="menos">-</td>
                </tr>

                <tr align="center">
                    <td onclick="ponerNumero4()"><input type="hidden" value="4" name="4">4</td>
                    <td onclick="ponerNumero5()"><input type="hidden" value="5" name="5">5</td>
                    <td onclick="ponerNumero6()"><input type="hidden" value="6" name="6">6</td>
                    <td onclick="mult()"><input type="hidden" value="*" name="mult">x</td>
                    <td onclick="divi()"><input type="hidden" value="/" name="div">%</td>
                </tr>

                <tr align="center">
                    <td onclick="ponerNumero7()"><input type="hidden" value="7" name="7">7</td>
                    <td onclick="ponerNumero8()"><input type="hidden" value="8" name="8">8</td>
                    <td onclick="ponerNumero9()"><input type="hidden" value="9" name="9">9</td>
                    <td onclick="punto()"><input type="hidden" value="." name="dot">.</td>
                    <td onclick="enviar_formulario()"><input  type="hidden" value="=" name="igual">=</td>
                </tr>
                
                <tr align="center">
                	<td onclick="borrar()">C</td>
                    <td onclick="ponerNumero0()"><input type="hidden" value="0" name="0">0</td>
                    <td colspan="3">Hecho por Luke</td>
                </tr>
					
            </table>
        </form>
	</div>

	<script src="jsCal.js"></script>
</body>
</html>