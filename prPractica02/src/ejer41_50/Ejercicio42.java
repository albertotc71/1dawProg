package ejer41_50;

import java.util.Scanner;

/**
 * Hacer un algoritmo para calcular si un número es primo o no. En matemáticas, un número primo es un
 * número natural mayor que 1 que tiene únicamente dos divisores positivos distintos: él mismo y el 1. 
 */

public class Ejercicio42 {

	public static void main(String[] args) {
		
		
		int num;
		boolean primo=true;

		
		Scanner sc = new Scanner(System.in);


		
		System.out.println("Dime un numero para ver si es primo o no: ");
		num = sc.nextInt();

		 
		if(num>1) {
			for(int cont=2;cont==num/2;cont++) {
				if(num%cont==0 && primo==true)
					primo=false;
			}
			if(primo==false)
				System.out.println("No es un numero primo");
			else
				System.out.println("Es un numero primo");

		}
		else
			System.out.println("No es ni primo ni compuesto");



		
		sc.close();
	}

}
