let numero1 = document.getElementsByName("1");
let numero2 = document.getElementsByName("2");
let numero3 = document.getElementsByName("3");
let numero4 = document.getElementsByName("4");
let numero5 = document.getElementsByName("5");
let numero6 = document.getElementsByName("6");
let numero7 = document.getElementsByName("7");
let numero8 = document.getElementsByName("8");
let numero9 = document.getElementsByName("9");
let numero0 = document.getElementsByName("0");



document.getElementsByTagName("input")[0].style.display="none";


function enviar_formulario(){
	
	let texto = document.getElementById("ppantalla").textContent;
	document.getElementById("pantalla").value = texto;
	
	
	document.formulario1.submit();
	document.getElementById("ppantalla").innerText = "";
 }


function borrar(){
	document.getElementById("ppantalla").innerText = "";
	document.getElementById("pantalla").value = "";
}

function ponerNumero1(){
	
	document.getElementById("ppantalla").innerText += numero1[0].value;
}
function ponerNumero2(){
	
	document.getElementById("ppantalla").innerText += numero2[0].value;
}
function ponerNumero3(){
	
	document.getElementById("ppantalla").innerText += numero3[0].value;
}
function ponerNumero4(){
	
	document.getElementById("ppantalla").innerText += numero4[0].value;
}
function ponerNumero5(){
	
	document.getElementById("ppantalla").innerText += numero5[0].value;
}
function ponerNumero6(){
	
	document.getElementById("ppantalla").innerText += numero6[0].value;
}
function ponerNumero7(){
	
	document.getElementById("ppantalla").innerText += numero7[0].value;
}
function ponerNumero8(){
	
	document.getElementById("ppantalla").innerText += numero8[0].value;
}
function ponerNumero9(){
	
	document.getElementById("ppantalla").innerText += numero9[0].value;
}
function ponerNumero0(){
	
	document.getElementById("ppantalla").innerText += numero0[0].value;
}

function suma(){
	
	if(document.getElementById("ppantalla").textContent.endsWith(".") == false){
		if(document.getElementById("ppantalla").textContent.endsWith("+") == false){
			if(document.getElementById("ppantalla").textContent.endsWith("-") == false){
				if(document.getElementById("ppantalla").textContent.endsWith("x") == false){
					if(document.getElementById("ppantalla").textContent.endsWith("/") == false){
						if(!document.getElementById("ppantalla").textContent == ""){
							document.getElementById("ppantalla").innerText += "+";
						}
					}
				}
			}
		}
		
	}
		
	
}

function resta(){
	
	if(document.getElementById("ppantalla").textContent.endsWith(".") == false){
		if(document.getElementById("ppantalla").textContent.endsWith("+") == false){
			if(document.getElementById("ppantalla").textContent.endsWith("-") == false){
				if(document.getElementById("ppantalla").textContent.endsWith("x") == false){
					if(document.getElementById("ppantalla").textContent.endsWith("/") == false){
						if(!document.getElementById("ppantalla").textContent == ""){
							document.getElementById("ppantalla").innerText += "-";
						}
					}
				}
			}
		}
		
	}
}

function mult(){
	
	if(document.getElementById("ppantalla").textContent.endsWith(".") == false){
		if(document.getElementById("ppantalla").textContent.endsWith("+") == false){
			if(document.getElementById("ppantalla").textContent.endsWith("-") == false){
				if(document.getElementById("ppantalla").textContent.endsWith("x") == false){
					if(document.getElementById("ppantalla").textContent.endsWith("/") == false){
						if(!document.getElementById("ppantalla").textContent == ""){
							document.getElementById("ppantalla").innerText += "x";
	
						}
					}
				}
			}
		}
		
	}
}

function divi(){
	
	if(document.getElementById("ppantalla").textContent.endsWith(".") == false){
		if(document.getElementById("ppantalla").textContent.endsWith("+") == false){
			if(document.getElementById("ppantalla").textContent.endsWith("-") == false){
				if(document.getElementById("ppantalla").textContent.endsWith("x") == false){
					if(document.getElementById("ppantalla").textContent.endsWith("/") == false){
						if(!document.getElementById("ppantalla").textContent == ""){
							document.getElementById("ppantalla").innerText += "/";
						}
					}
				}
			}
		}
		
	}
	
}

function punto(){
	
	if(document.getElementById("ppantalla").textContent.endsWith(".") == false){
		if(document.getElementById("ppantalla").textContent.endsWith("+") == false){
			if(document.getElementById("ppantalla").textContent.endsWith("-") == false){
				if(document.getElementById("ppantalla").textContent.endsWith("x") == false){
					if(document.getElementById("ppantalla").textContent.endsWith("/") == false){
						if(!document.getElementById("ppantalla").textContent == ""){
							document.getElementById("ppantalla").innerText += ".";
						}
					}
				}
			}
		}
		
	}
}
