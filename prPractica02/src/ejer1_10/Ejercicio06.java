package ejer1_10;

import java.util.Scanner;

/**
 * Diseñar un algoritmo que nos permita saber el mayor de dos números introducidos. Controlar el caso de
 * que sean iguales.
 */

public class Ejercicio06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.println("Dime un numero: ");
		num1 = sc.nextInt();
		
		System.out.println("Dime otro numero: ");
		num2 = sc.nextInt();
		
		
		if(num1>num2)
			System.out.println("El primer numero es mayor que el segundo");
		else if (num1<num2)
			System.out.println("El segundo numero es mayor que el primero");
		else
			System.out.println("Los numeros son iguales");
		
		
		sc.close();
	}

}
