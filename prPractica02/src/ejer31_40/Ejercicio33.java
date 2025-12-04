package ejer31_40;

import java.util.Scanner;

/**
 * Hacer un algoritmo para calcular de forma automática las n primeras potencias de un número A. Se
 * introducen por teclado los números n (exponente) y A (base).
 */

public class Ejercicio33 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int n, a;
		
		System.out.println("Introduce la base para calcular las potencias de ese numero: ");
		n=sc.nextInt();
		
		System.out.println("Introduce el exponente: ");
		a=sc.nextInt();
		
		for(int cont=0;cont<=a;cont++) {
			System.out.println(n+" ^ "+cont+" = "+(int)Math.pow(n, cont));
		}
		
		
		sc.close();
	}

}
