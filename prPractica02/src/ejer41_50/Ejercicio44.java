package ejer41_50;

import java.util.Scanner;

/**
 *  Introducir la nota de una asignatura por teclado, que esté comprendida entre 0 y 10 y escribir la nota
 *  en  letra, atendiendo a: 
 */

public class Ejercicio44 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int nota;
		
		System.out.println("Introduce una nota: ");
		nota = sc.nextInt();
		
		switch(nota) {
		case 0,1,2 -> System.out.println("Muy deficiente");
		case 3,4 -> System.out.println("Deficiente");
		case 5 -> System.out.println("Suficiente");
		case 6 -> System.out.println("Bien");
		case 7,8 -> System.out.println("Notable");
		case 9,10 -> System.out.println("Sobresaliente");
		default -> System.out.println("No es una nota");
		}
		
		sc.close();
	}

}
