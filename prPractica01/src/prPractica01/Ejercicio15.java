package prPractica01;

import java.util.Locale;
import java.util.Scanner;

/**
 *  Diseñar un algoritmo que a partir de la base y la altura de un triángulo muestre como resultado su
 *  superficie. (superficie  = b · h / 2).
 */

public class Ejercicio15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		
		//Variables
		float base, altura, superficie;
		
		//Pedimos la base y la altura
		System.out.println("Dime la base del triangulo: ");
		base = sc.nextFloat();
		
		
		System.out.println("Dime la altura del triangulo: ");
		altura = sc.nextFloat();
		
		
		superficie = base*altura/2;
		
		System.out.println("La superficie de ese triangulo es: "+superficie);
		
		sc.close();
	}

}
