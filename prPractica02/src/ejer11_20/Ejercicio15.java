package ejer11_20;

import java.util.Scanner;

/**
 * Programa que lea 3 números de teclado y los muestre en pantalla de forma ordenada.
 */

public class Ejercicio15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1, num2, num3;
		
		System.out.println("Introduce un primer numero para mostrarlo ordenado: ");
		num1 = sc.nextInt();
		
		System.out.println("Introduce un segundo numero para mostrarlo ordenado: ");
		num2 = sc.nextInt();
		
		System.out.println("Introduce un tercer numero para mostrarlo ordenado: ");
		num3 = sc.nextInt();
		
		
		if((num1>num2)&&(num1>num3)) {
			if(num2>num3)
				System.out.println("El orden de esos numeros es: "+num1+" "+num2+" "+num3);
			else 
				System.out.println("El orden de esos numeros es: "+num1+" "+num3+" "+num2);
		}
		else if ((num2>1)&&(num2>num3)) {
			if(num1>num3)
				System.out.println("El orden de esos numeros es: "+num2+" "+num1+" "+num3);
			else
				System.out.println("El orden de esos numeros es: "+num2+" "+num3+" "+num1);
		}
		else {
			if(num1>num2)
				System.out.println("El orden de esos numeros es: "+num3+" "+num1+" "+num2);
			else
				System.out.println("El orden de esos numeros es: "+num3+" "+num2+" "+num1);
		}
		
		sc.close();
		
	}

}
