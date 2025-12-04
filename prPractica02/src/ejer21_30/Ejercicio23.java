package ejer21_30;

import java.util.Scanner;

/**
 * Hacer un algoritmo que nos sume los números naturales, comprendidos entre dos números introducidos
 * por teclado, debéis tener en cuenta si el primero de los números no es más pequeño que el segundo. 
 */

public class Ejercicio23 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1, num2,suma=0, aux;
		
		System.out.println("Introduce un numero para sumarlo hasta el siguiente numero: ");
		num1 = sc.nextInt();
		
		System.out.println("Introduce otro numero para llegar a ese: ");
		num2 = sc.nextInt();
		
		
		//Comprobamos que el num2 sea menor que el num1 y hacemos la suma
		if(num1>num2) {
			aux=num1;
			num1=num2;
			num2=aux;
			
			
		}
		
			for(int cont=num1;cont<=num2;cont++) {
				suma = suma+cont;
			}
		
		System.out.println("La suma es: "+suma);
		
		sc.close();
	}

}
