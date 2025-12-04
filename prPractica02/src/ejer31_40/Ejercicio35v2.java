package ejer31_40;

import java.util.Scanner;

/**
 * Hacer un algoritmo que calcule el valor de un número combinatorio a partir de dos valores, a y b, que
 * se introducen por teclado 
 * 
 *  Se debe tener en centa que para poder calcular el combinatorio de dos números se debe cumplir que
 *  a ≥ b, a ≥ 0 y b ≥ 0. 
 *  
 *  Vamos a desarrollar un metodo que calcula el factorial de un numero
 *  
 */

public class Ejercicio35v2 {

	public static void main(String[] args) {
		
		
		
		//Variables locales
		int a, b, aMenosB, numero;
		double combinatorio;
	
		
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
				combinatorio = 	factorial(a) / (factorial(b)*factorial(aMenosB));
				
				System.out.println("El combinatorio de "+a+" sobre "+b+" es "+combinatorio);
			}
			
			numero=4;
			if(factorial(numero)==-1)
				System.out.println("Error, no existe el factorial de numeros negativos");
			System.out.println("Factorial: "+factorial(-4));
	
	}
	
	/**
	 * Metodo que calcula el factorial de un numero n, recibido como parametro
	 *   Factorial(0) = 1
	 *   Factorial(n) = n x (n-1) x (n-2) x .... 1
	 * @param num --> parametro al que se calculara el factoral
	 * @return --> valor devuelto por el metodo, en este caso el factorial calculado
	 * 			--> si num es negativo, vamos a devolver -1
	 */
	public static double factorial (int num) {
		
		//Variables locales al metodo
		double fact=1;
		
		if(num<0) {
			fact=-1;
		}            
		else {			
			for(int cont=2;cont<=num;cont++) {
				fact*=cont;
			}
		}
		return fact;
	}

}
