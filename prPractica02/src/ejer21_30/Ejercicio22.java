package ejer21_30;

import java.util.Scanner;

/**
 * Programa que calcula la media aritmética de una serie de números introducidos por teclado, que finaliza
 * con la introducción del valor 0. 
 */

public class Ejercicio22 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		float media=0;
		int num, cont=0;
		
		System.out.println("Dime un numero para calcular la media aritmetica: ");
		num = sc.nextInt();
		
		while(num!=0) {
			
			media = num+media;
			cont++;
			System.out.println("Dime otro numero: ");
			num = sc.nextInt();
		}
		
		if(cont==0) {
			System.out.println("No has introducido ningun numero");
		}
		else {			
			System.out.println("La media es: "+media/cont);
		}
		
		
				
		sc.close();
	}

}
