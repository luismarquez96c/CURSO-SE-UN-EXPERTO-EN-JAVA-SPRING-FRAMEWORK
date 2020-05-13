package com.midominio;

public class VariablesChar {

	public static void main(String[] args) {
		// CLASE 10.2: VARIABLES DE TIPO CHAR
		
		char caracter = 'A';
		char caracterASCII = 65;
		char caracterUnicode = '\u007A';
		
		var caracterVar = '\u0041';
		
		System.out.println("Mi caracter es: " + caracter);
		System.out.println("Mi caracter desde tabla ascii es: " + caracterASCII );
		System.out.println("Mi caracter desde tabla unicode es: " + caracterUnicode);
		System.out.println("Mi caracter usando palabra reservada var: " + caracterVar );
		
	}

}
