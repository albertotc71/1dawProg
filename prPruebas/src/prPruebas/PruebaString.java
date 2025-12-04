package prPruebas;

import java.util.Scanner;

public class PruebaString {

	public static void main(String[] args) {
		
		String cadena;
		
		Scanner sc = new Scanner(System.in);
		
		//Prueba metodo nextLine
		System.out.print("Introduzca una cadena: ");
		cadena = sc.nextLine();
		System.out.println(cadena);
		
		
		//Prueba metodo next
		System.out.print("Introduzca otra cadena: ");
		cadena = sc.next();
		System.out.println(cadena);
		
		
		sc.close();
	}

}
