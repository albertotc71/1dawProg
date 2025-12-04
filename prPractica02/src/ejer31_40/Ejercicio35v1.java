package ejer31_40;

import java.util.Scanner;

/**
 * Hacer un algoritmo que calcule el valor de un número combinatorio a partir de dos valores, a y b, que
 * se introducen por teclado 
 * 
 *  Se debe tener en centa que para poder calcular el combinatorio de dos números se debe cumplir que
 *  a ≥ b, a ≥ 0 y b ≥ 0. 
 *  
 *  No utilizare metodo para el calulo del factorial
 *  
 */

public class Ejercicio35v1 {

	public static void main(String[] args) {
		
		
		
		//Variables locales
		int a, b, aMenosB;
		double combinatorio, factA=1, factB=1, factAmB=1;
	
		
		//Crear el objeto Scanner en un try con recursos
		try(Scanner sc = new Scanner(System.in)){
			
			System.out.print("Introduce un numero para calcular el combinatorio: ");
			a=sc.nextInt();
			
			System.out.print("Introduce otro numero: ");
			b=sc.nextInt();
			
			aMenosB=a-b;
			
		}	
		
		//Se debe cumplir a ≥ b, a ≥ 0 y b ≥ 0 para poder realizar el calculo
			
			if((a<b)||(a<0)||(b<0)) {
				System.out.println("Error, no se puede calcular el combinatorio de estos numeros");
			}
			else {
				
				//Calcular el factorial de A
				for(int cont=2;cont<=a;cont++) {
					factA*=cont;
				}
				
				//Calcular el factorial de B
				for(int cont=2;cont<=b;cont++) {
					factB*=cont;
				}
				
				//Calcular el factorial de A-B
				for(int cont=1;cont<=aMenosB;cont++) {
					factAmB*=cont;
				}
				
				//Calcular el combinatorio de A sobre B
				combinatorio = factA/(factB*factAmB);
				
				System.out.println("El combinatorio de "+a+" sobre "+b+" es "+combinatorio);
			}
					
	
	}

}
