package ejer11_20;

import java.util.Scanner;

/**
 * Diseñar un algoritmo para leer las longitudes de los lados de un triángulo y determine que tipo de
 * triángulo es, de acuerdo a los siguientes casos: suponiendo que A es el mayor de los lados y que B y C
 * corresponden a los otros 2 lados:
 * Si A >= B + C    No es un triángulo
 * Si A² = B² + C²   Triángulo rectángulo
 * Si A² > B² + C²   Triángulo obtusángulo
 * Si A² < B² + C²   Triángulo acutángulo
 */

public class Ejercicio14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int ladoA, ladoB, ladoC;
		
		System.out.println("Introduce el primer lado de un triangulo: ");
		ladoA = sc.nextInt();
		
		System.out.println("Introduce el segundo lado de un triangulo: ");
		ladoB = sc.nextInt();
		
		System.out.println("Introduce el tercer lado de un triangulo: ");
		ladoC = sc.nextInt();
		
		
		if(ladoA>=ladoB+ladoC)
			System.out.println("No es un triangulo");
		else
			if(Math.pow(ladoA, 2)==Math.pow(ladoB, 2)+Math.pow(ladoC, 2))
				System.out.println("Es un triangulo rectangulo");
			else if (Math.pow(ladoA, 2)>Math.pow(ladoB, 2)+Math.pow(ladoC, 2))
				System.out.println("Es un triangulo obtusangulo");
			else if (Math.pow(ladoA, 2)<Math.pow(ladoB, 2)+Math.pow(ladoC, 2))
				System.out.println("Es un triangulo acutangulo");
		
		sc.close();
		
	}

}
