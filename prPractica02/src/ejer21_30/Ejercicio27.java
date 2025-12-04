package ejer21_30;

import java.util.Scanner;

/**
 *  Hacer un algoritmo para calcular el factorial de un número natural positivo, se debe tener en cuenta si
 *  el número no es positivo, ya que no existe el factorial de los números negativos.
 */

public class Ejercicio27 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num,fact=1;
		
		System.out.println("Dime un numero para calcular el factorial: ");
		num = sc.nextInt();
		
		
		if(num<0)
			System.out.println("Error, no se puede calcular el factorial de un numero negativo");
		else {
			for(int cont=num;cont>0;cont--) {
				fact=fact*cont;
			}
			System.out.println("El factorial de "+num+" es: "+fact);
		}
			
		
		
		sc.close();
	}

}
