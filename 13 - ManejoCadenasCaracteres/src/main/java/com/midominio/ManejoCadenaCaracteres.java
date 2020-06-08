package com.midominio;

public class ManejoCadenaCaracteres {

	public static void main(String[] args) {
		
		// CLASE 13: MANEJO DE CADENAS DE CARACTERES
		
		String usuario = "tecnoaprendiz";

		//equals e equalsIgnoreCase: equivale a
		System.out.println( usuario.equals("Tecnoaprendiz") );
		System.out.println( usuario.equalsIgnoreCase("Tecnoaprendiz") );
		
		//substring: sub cadena
		String nombreUsuario = "Luis Márquez";
		System.out.println( nombreUsuario.substring( 6 ) );
		System.out.println( nombreUsuario.substring(0, 4) );
		
		//replace: reemplazar
		System.out.println( nombreUsuario.replace("M", "V") );
		
		//chartAt: caracter en
		System.out.println( nombreUsuario.charAt(5) );
		
		//startsWith: comienza con?
		System.out.println( nombreUsuario.startsWith("L") );
		
	}

}
