package com.midomino;

public class OperadorTernario {

	public static void main(String[] args) {
		// CLASE 21: OPERADOR TERNARIO
		
		// CONDICION ? VALOR SI LA CONDICI�N ES VERDADERA : EL VALOR SI LA CONDIC�N ES FALSA
		
		char genero = 'F';
		
		int edad = 18;
		
		String mensaje = genero == 'M' ? "Bienvenido" : "Bienvenida";

		
		System.out.println( mensaje + " " + ( edad >= 18 ? "eres menor de edad" : "eres menor de edad" ) );
		
	}

}
