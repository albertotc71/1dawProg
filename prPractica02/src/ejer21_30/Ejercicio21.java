package ejer21_30;

import java.util.Scanner;

/**
 * Programa que imprima la tabla de multiplicar de un número entero (entre 1 y 10). 
 */

public class Ejercicio21 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println("Dime un numero para sacar la tabla de multiplicar: ");
		num = sc.nextInt();
		
		for(int i=1;i<=10;i++) {
			System.out.println(num+" x "+i+" = "+(num*i));
		}
		
		
		sc.close();
	}

}
