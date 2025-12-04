package ejer31_40;

import java.util.Scanner;

/**
 * Hacer un algoritmo que calcule el valor de un número combinatorio a partir de dos valores, a y b, que
 * se introducen por teclado, aplicando la siguiente fórmula: 
 */

public class Ejercicio35 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, factA=1, factB=1,aMenosB,factAmB=1;
		
		System.out.println("Introduce un numero para calcular el combinatorio: ");
		a=sc.nextInt();
		
		System.out.println("Introduce otro numero: ");
		b=sc.nextInt();
		
		aMenosB=a-b;
		
		
		
		if((a>=b)&&(a>=0)&&(b>=0)) {
			
			for(int cont=1;cont<=a;cont++) {
				factA*=cont;
			}
		
		
			for(int cont=1;cont<=b;cont++) {
				factB*=cont;
			}

			for(int cont=1;cont<=aMenosB;cont++) {
				factAmB*=cont;
			}

		}
		
		System.out.println("El combinatorio de "+a+" y "+b+" es "+(float)factA/(factB*factAmB));
		
		sc.close();
	}

}
