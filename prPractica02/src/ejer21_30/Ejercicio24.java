package ejer21_30;

import java.util.Scanner;

/**
 *  Programa que calcule el producto de dos números enteros positivos mediante sumas sucesivas, no
 *  podéis utilizar la operación de multiplicación. 
 */

public class Ejercicio24 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1, num2, multi=0;
		
		System.out.println("Dime un numero para multiplicarlo: ");
		num1 = sc.nextInt();
		
		System.out.println("Dime otro numero: ");
		num2 = sc.nextInt();
		
		for(int cont=0;cont<num2;cont++) {
			multi = multi+num1;
		}
		System.out.println("La multiplicacion es: "+multi);
		
		sc.close();
	}

}
