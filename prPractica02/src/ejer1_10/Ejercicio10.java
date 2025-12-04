package ejer1_10;

/**
 *  Realizar un algoritmo para deducir el mayor de tres valores introducidos por teclado.
 */

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1, num2, num3;
		
		System.out.println("Dime un primer numero para comprobar si es el mayor: ");
		num1=sc.nextInt();
		
		System.out.println("Dime un segundo numero: ");
		num2=sc.nextInt();
		
		System.out.println("Dime un tercer numero: ");
		num3=sc.nextInt();
		
		
		if((num1>num2)&&(num1>num3))
			System.out.println("El primer numero es el mayor");
		else if ((num2>num1)&&(num2>num3))
			System.out.println("El segundo numero es el mayor");
		else if((num3>num1)&&(num3>num2))
			System.out.println("El tercer numero es el mayor");
		else
			System.out.println("Los 3 numeros son iguales");
		
		sc.close();
	}

}
