package ejer11_20;

import java.util.Scanner;

/**
 * Diseñar un algoritmo que lee un número y un valor entre 1 y 3, y en función de este último calcula:
 * 1.-  El cuadrado del número
 * 2.-  El cubo del número
 * 3.-  La raíz cuadrada del número
 */

public class Ejercicio13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		byte opcion;
		int num;
		
		System.out.println("Dime alguna de estas opciones: 1-El cuadrado de un numero; 2-El cubo de un numero; 3-La raiz cuadrada de un numero");
		opcion = sc.nextByte();
		if(opcion>=1&&opcion<=3) {
			System.out.println("Introduce el numero que quieres realizar alguna de las opciones anteriores");
			num = sc.nextInt();

			if(opcion==1)
				System.out.println("El cuadrado de "+num+" es: "+Math.pow(num, 2));
			else if (opcion==2)
				System.out.println("El cubo de "+num+" es: "+Math.pow(num, 3));
			else 
				if(num<=0)
					System.out.println("No se puede calcular la raiz");
				else
				System.out.println("La raiz cuadrada de "+num+" es: "+Math.sqrt(num));
		}
		
		else
			System.out.println("Error, opcion incorrecta");
		
		
		
		sc.close();
		
	}

}
