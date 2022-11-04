package com.jacaranda.ejercicio2Calculadora;
import com.jacaranda.ejercicio2Calculadora.DivByZeroException;

public class Calculadora {

	private String cadena;
		
	
	public Calculadora(String cadena) {
		if(cadena.isBlank() || cadena.length()<3 || cadena == null) {
			throw new ExecutionFailure("[ERROR] Execution Failure code-001");
		}
		else {
			this.cadena = cadena;				
		}
	}

	/*
	 * Este metodo sirve para sacar el Numero 2
	 */
	public Double sacarN2() {
		
		String n2 = "";
			for(Integer i = 0; i<this.cadena.length()-1;i++) {
			
				if(comprobarSignos(this.cadena, i)){
					n2 = cadena.substring(i+1);
			}
		}
			
			if(n2.isEmpty() || n2==null) {
				throw new ExecutionFailure("[ERROR] Execution Failure code-004");
			}
		return Double.valueOf(n2);
	}
	
	/*
	 * Este metodo sirve para sacar el Numero 1
	 */
	public Double sacarN1() {
		
		String n1 = "";
			for(Integer i = 0; i<this.cadena.length()-1;i++) {
			
				if(comprobarSignos(this.cadena, i)){
					n1 = this.cadena.substring(0, i);
			}
		}
			
		if(n1.isEmpty() || n1==null) {
			throw new ExecutionFailure("[ERROR] Execution Failure code-003");
		}
			
		return Double.valueOf(n1);
	}
	
	/*
	 * Este metodo sirve para determinar el signo
	 */
	public String determinarSigno() {
		String signo = "";
		for(Integer i = 0; i<this.cadena.length()-1;i++) {
		
			if (this.cadena.charAt(i) == 'x') {
				signo = "x";
			}
			else if (this.cadena.charAt(i) == '+') {
				signo = "+";
			}
			else if (this.cadena.charAt(i) == '-') {
				signo = "-";
			}
			else if (this.cadena.charAt(i) == '/') {
				signo = "/";
			}
			
		}
		
		if(signo.isEmpty() || signo==null) {
			throw new ExecutionFailure("[ERROR] Execution Failure code-002");
		}
		
		return signo;
	}

	/*
	 * Este metodo sirve para calcular
	 */
	public String calcular() {
		Double resultado = 0.0;
		
		String signo = determinarSigno();
		Double number1 = sacarN1();
		Double number2 = sacarN2();
		
		if(signo == "x") {
			resultado = multip(number1,number2);
		}
		else if(signo == "+") {
			resultado = suma(number1,number2);
		}
		else if(signo == "-") {
			resultado = resta(number1,number2);
		}
		else if(signo == "/") {
			resultado = div(number1,number2);
		}
		else {
			throw new ExecutionFailure("[ERROR] Unexpected error on calculating the numbers");
		}
		
		return String.valueOf(resultado);
	}

	/*
	 * Este metodo sirve para comprobar el signo
	 */
	private boolean comprobarSignos(String cadena, Integer i) {
		return cadena.charAt(i) == 'x'
				|| cadena.charAt(i) == '+'
				|| cadena.charAt(i) == '-'
				|| cadena.charAt(i) == '/';
	}

	
	
	
	
	
	/*
	 * Sumar
	 */
	public double suma(Double number1, Double number2) {
		
		return number1 + number2;
	}
	
	/*
	 * Restar
	 */
	public Double resta(Double numb1, Double numb2) {
		return numb1 - numb2;
	}
	
	/*
	 * Multiplicar
	 */
	public Double multip(Double numb1, Double numb2) {
		return numb1*numb2;
	}
	
	/*
	 * Dividir
	 */
	public Double div(Double numb1, Double numb2) {
		
		if(numb2 == 0) {
			throw new DivByZeroException("[Error] You can not divide by zero");
		}
		else {
			return numb1/numb2;
		}
	}

	

	
	
}
