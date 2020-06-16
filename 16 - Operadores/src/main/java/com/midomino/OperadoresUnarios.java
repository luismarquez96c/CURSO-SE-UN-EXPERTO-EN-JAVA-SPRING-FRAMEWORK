package com.midomino;

public class OperadoresUnarios {

	public static void main(String[] args) {
		// CLASE 18: OPERADORES UNARIOS
		
		int edad = 24;
		
		//++ -> edad = edad + 1 -> edad += 1;
//		System.out.println( "edad: " + ++edad );
//		System.out.println( edad );
		
		//-- -> edad = edad - 1 -> edad -= 1;
		System.out.println( "edad: " + edad-- );
		System.out.println( edad );
		
		//+
		int cantidad = +1;
		cantidad = +2;
		System.out.println("cantidad: " + cantidad);
		
		//-
		cantidad = -10;
		System.out.println("cantidad: " + cantidad);

	}

}
