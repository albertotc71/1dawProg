package ejer1_10;

import java.util.Scanner;

/**
 * Escribir, usando sentencias de selección, el algoritmo que calcule el grado correspondiente para una
 * determinada puntuación.
 */

public class Ejercicio05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int grado;
		
		System.out.println("Dime los puntos obtenidos: ");
		grado = sc.nextInt();
		
		if(grado<60)
			System.out.println("Es un grado E");
		else if (grado<70)
			System.out.println("Es un grado D");
		else if (grado<80)
			System.out.println("Es un grado C");
		else if (grado<90)
			System.out.println("Es un grado B");
		else
			System.out.println("Es un grado A");
		
		
		sc.close();
	}

}
