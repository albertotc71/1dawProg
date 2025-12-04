package ejer1_10;

import java.util.Scanner;

/**
 * Realizar un algoritmo que permita saber si un número es mayor, menor o igual a cero.
 */

public class Ejercicio04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Dime un numero para comprobar si es mayor, menor o igual a cero");
		numero = sc.nextInt();
		
		if(numero > 0)
			System.out.println("El numero es mayor que 0");
		else if (numero < 0)
			System.out.println("El numero es menor que 0");
		else
			System.out.println("El numero es igual que 0");
		
		System.out.println(numero>0?"El numero es mayor que 0":
							(numero<0)?"El numero es menor que 0":
							"El numero es igual que 0");
		
		sc.close();
	}

}
