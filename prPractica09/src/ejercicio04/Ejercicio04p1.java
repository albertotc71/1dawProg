package ejercicio04;

public class Ejercicio04p1 {

	public static void main(String[] args) {
		
		/**
		 * Crea un objeto de tipo String que contenga varias palabras 
		 */
		String cadena = "Tiene la Tarara "
				+ "un vestido blanco "
				+ "con lunares rojos "
				+ "para el Jueves Santo.";
		
		
		/**
		 * Averigua la longitud de la cadena. 
		 */
		System.out.println("Longitud cadena: "+cadena.length());
		System.out.println("Hola".length());
		
		
		/**
		 *  Muestra el carácter que se encuentra en la posición 2 de tu cadena.
		 */
		System.out.println("Caracter segunda posicion: "+cadena.charAt(1));
		System.out.println("Caracter segunda posicion: "+cadena.toCharArray()[1]);
		
		/**
		 * Mostrar todas las vocales de una cadena.
		 */
		System.out.println("Todas las vocales: ");
		char letraChar;
		String letraString;
		for(int i=0;i<cadena.length();i++) {
			
			letraChar = cadena.charAt(i);
			
			letraString = Character.toString(letraChar);
			
			if(letraString.matches("[aeiou]"))
				System.out.print(letraChar+" ");
			
		}
		
		System.out.println("\nVocales: ");
		
		for(int i=0;i<cadena.length();i++) {
			if(Character.toString(cadena.charAt(i)).matches("[aeiou]"))
				System.out.print(cadena.charAt(i)+" ");
		}
		
		System.out.println();
		/**
		 *	Extraer la penúltima letra de una cadena. 
		*/
		System.out.println("Penultima letra de una cadena: "+cadena.charAt(cadena.length()-2));
		
		/**
		 * Extrae y almacena en otro objeto del mismo tipo toda la cadena excepto los 2 primeros caracteres 
		 * (subcadena). 
		 */
		System.out.println("Toda la cadena menos los 2 primeros caracteres: "+cadena.substring(2));
		
		/**
		 * Extrae y almacena en otro objeto del mismo tipo toda la cadena excepto los 2 primeros caracteres y
		 * los dos últimos caracteres. 
		 */
		System.out.println("Toda la cadena menos los 2 primeros caracteres y los 2 ultimos caracteres: "+
							cadena.substring(2,cadena.length()-2));
		
		/**
		 * Modifica en la cadena anterior todas las veces que aparezca la vocal ‘a’ (minúscula) por  ‘A’ 
		 * (mayúscula).
		 */
		System.out.println("Modificar todas las letras a: "+ cadena.replace('a', 'A'));
		
		
		
	}

}
