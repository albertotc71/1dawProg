package prPractica01;

import java.util.Scanner;

/**
 * Realizar un programa que calcule la media aritmética de tres valores que se han leído de teclado, y
 * muestre el resultado por pantalla.
 * @param args
 */


public class Ejercicio03 {
	
	
	
	public static void main(String[] args) {
		
		float num1, num2, num3;
		
		Scanner sc = new Scanner(System.in);
		
		//Pedimos 3 numeros por teclado para realizar la media
		System.out.println("Introduce el primer numero: ");
		num1 = sc.nextFloat();
		
		System.out.println("Introduce el segundo numero: ");
		num2 = sc.nextFloat();
		
		System.out.println("Introduce el tercer numero: ");
		num3 = sc.nextFloat();
		
		//Calculamos y mostramos la media aritmetica de esos 3 numeros
		System.out.println("La media de esos 3 numeros es: "+((num1+num2+num3)/3));
		
		sc.close();
		
	}

}
