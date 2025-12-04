package ejer1_10;

import java.util.Scanner;

/**
 * Hacer un algoritmo para ver si un número introducido por teclado es par o impar.
 */

public class Ejercicio07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println("Dime un numero para comprobar si es par o impar: ");
		num = sc.nextInt();
		
		
		if(num%2==0)
			System.out.println("El numero es par");
		else
			System.out.println("El numero es impar");
		
		System.out.println((num%2)==0?"El numero es par":"El numero es impar");
		
		sc.close();
		
	}

}
