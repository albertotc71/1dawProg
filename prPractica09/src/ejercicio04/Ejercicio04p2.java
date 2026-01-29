package ejercicio04;

import java.util.Arrays;

public class Ejercicio04p2 {

	public static void main(String[] args) {
		
		String cadena = "Tiene la Tarara "
				+ "un vestido blanco "
				+ "con lunares rojos "
				+ "para el Jueves Santo.";
		
		
		
		/*Crea un array de caracteres cuyos elementos serán los de la cadena anterior.*/
		char [] arrayChar = cadena.toCharArray();
		System.out.println(Arrays.toString(arrayChar));
		for(int i=0;i<arrayChar.length;i++) {
			System.out.print(arrayChar[i]+" ");
		}
		
		char[] array2 = new char[cadena.length()]; 
		
		cadena.getChars(0, cadena.length(), array2, 0);
		
		System.out.println(Arrays.toString(array2));
		
		
		
		
		
		/*Sacar "blanco" con getChar y substring*/
		
		try {
			int longPalabra = "blanco".length();
			char [] array3 = new char[longPalabra];
			
			int posPalabra = cadena.indexOf("blanco");
			
			cadena.getChars(posPalabra, posPalabra+longPalabra, array3, 0);
			System.out.println(Arrays.toString(array3));
			
			
			char [] array4 = cadena.substring(posPalabra,posPalabra+longPalabra).toCharArray();
			System.out.println(Arrays.toString(array4));
			
			
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("Palabra no encontrada");
		}
		
		
		System.out.println("La palabra blanco: "+cadena.contains("blanco"));
		
		/*Convierte la subcadena que creaste anteriormente a mayúscula, y que se quede modificada 
		internamente, es decir, no solo a la hora de imprimirla.*/
		String cad3 = cadena.toUpperCase();
		System.out.println(cad3);
		
		/*Comprueba si la cadena empieza por la palabra “Hola”.*/
		
		
		System.out.println("Comprobar si empieza por Hola: "+cadena.toLowerCase().startsWith("Tiene"));
		
		/*Busca una subcadena que exista dentro de tu cadena, y otra que no exista (indexOf), recordad que 
		en la cadena original la letra ‘a’ se había cambiado a mayúscula.*/
		System.out.println("* * * * * * * ");
		System.out.println(cadena);
		
		System.out.println(cadena.indexOf("un vestido blanco")>=0?"Cadena \"un vestido blanco \" si esta":"Cadena \"un vestido blanco \" No esta");
		System.out.println(cadena.contains("un vestido blanco")?"Cadena \"un vestido blanco \" si esta":"Cadena \"un vestido blanco \" No esta");
		
		/*Busca todas las ocurrencias de una cadena.*/
		
		String cadOriginal = "\"Tiene la Tarara un vestido blanco que solo se blanco pone en el Jueves Santo";
		String cadBuscada="blanco";
		
		
	}

}
