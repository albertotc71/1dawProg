package prRepaso;

import java.util.Scanner;

/**
 * Diseñar un programa para determinar si un número entero es múltiplo de 3, 4 o 5.
 */

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		
		System.out.println("Introduce un numero para saber si es multiplo de 3, 4 o 5: ");
		num = sc.nextInt();
		
		if((num%3)==0 && (num%4)==0 && (num%5)==0)
			System.out.println("Este numero si es multiplo de 3, 4 y 5");
		else
			System.out.println("No es multiplo de 3, 4 o 5");
		
		
		sc.close();
	}

}
