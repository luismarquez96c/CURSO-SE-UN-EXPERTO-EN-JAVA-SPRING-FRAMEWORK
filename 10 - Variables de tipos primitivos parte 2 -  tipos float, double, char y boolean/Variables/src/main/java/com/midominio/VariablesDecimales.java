package com.midominio;

public class VariablesDecimales {

	public static void main(String[] args) {
		//CLASE 10.1: VARIABLES DE TIPO DECIMAL
		
		float precioProducto = 9.99F;
		
		double cantidadGramosArina = 250.7845121D;
		
		//variableDecimal será de tipo double por defecto
		var variableDecimal = 1.9;
		
		System.out.println( "El precio de mi producto es: " + precioProducto );

		System.out.println( "La cantidad de gramos de arina es: " + cantidadGramosArina );
		
		System.out.println( "Valor de variableDecimal: " + variableDecimal );
	}

}
