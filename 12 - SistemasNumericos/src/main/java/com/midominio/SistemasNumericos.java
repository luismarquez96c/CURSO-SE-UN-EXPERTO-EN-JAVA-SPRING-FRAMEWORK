package com.midominio;

public class SistemasNumericos {

	public static void main(String[] args) {
		// CLASE 12: SISTEMAS NUMÉRICOS

		int variableDecimal = 227;
		int variableBinaria = 0b11100011 ;
		int variableOctal = 0343;
		int variableHexadecimal = 0xE3;
		
		var variable = 0b0010;
		
		System.out.println( "Variable decimal: " + variableDecimal );
		System.out.println( "Variable binaria: " + variableBinaria);
		System.out.println( "Variable octal: " + variableOctal );
		System.out.println( "Variable hexadecimal: " + variableHexadecimal);
		
		System.out.println("227 * 227 + : " + ( variableBinaria * variableOctal + variable ) );
		
	}

}
