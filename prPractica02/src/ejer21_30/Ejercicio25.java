package ejer21_30;

import java.util.Scanner;

/**
 *  Programa que obtenga el cociente y el resto de dos números enteros positivos mediante restas y sumas,
 *  no podéis utilizar las operaciones de división (/) y de resto (%). 
 */

public class Ejercicio25 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int dividendo, divisor, cociente=0;
		
		System.out.println("Dime un numero para dividirlo: ");
		dividendo = sc.nextInt();
		
		System.out.println("Dime otro numero: ");
		divisor = sc.nextInt();
		
		if(divisor==0) {
			System.out.println("Error, no se puede dividir por 0");
		}
		
		else {			
			do {
				dividendo=dividendo-divisor;
				cociente++;
				
			}
			
			while(dividendo>=divisor);		
			System.out.println("El resultado de la division es "+cociente+" y de resto "+dividendo);
			
		}
		sc.close();
	}

}
