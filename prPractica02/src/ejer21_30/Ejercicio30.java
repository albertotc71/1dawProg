package ejer21_30;

import java.util.Scanner;

/**
 * Hacer un algoritmo para mostrar por pantalla los números múltiplos de 3 que hay entre dos números
 * determinados, de forma alternativa.
 */

public class Ejercicio30 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1, num2;
		boolean sw = true;
		
		System.out.println("Dime un numero para sacar los multiplos de 3 que hay entre ese numero y el siguiente: ");
		num1 = sc.nextInt();
		
		System.out.println("Dime otro numero");
		num2 = sc.nextInt();
		
		for (int cont=num1;cont<=num2;cont++) {
			if((cont%6==0)&&sw==true) {
				System.out.println(cont);
				sw=false;
			}
			else
				sw=true;
		}
		
		sc.close();
	}

}
