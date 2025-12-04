package ejer11_20;

import java.util.Scanner;

/**
 * Dearrolla un programa que resuelva la siguiente serie matemática: 
 */

public class Ejercicio20 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		double suma=1;
		
		System.out.println("Introduce un numero para dividirlo entre 1: ");
		num = sc.nextInt();
		
		for (int i=2;i<=num;i++) {
			suma = suma + 1.0/i;
		}
		
		System.out.println("El resultado es: "+suma);
		
		
		sc.close();
	}

}
