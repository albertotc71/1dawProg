package prPractica01;

import java.util.Scanner;

/**
 * Escribir un programa que convierta un número dado en segundos en el equivalente de minutos y
 * segundos.  
 */

public class Ejercicio13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Variables
		byte segundos=0, minutos=0;
		int tiempo;
		
		
		//Pedimos la cantidad que se va a convertir
		System.out.println("Dime la cantidad que quieras convertir en minutos y segundos: ");
		tiempo=sc.nextInt();
		
		//Calculamos los minutos y segundos
		if(tiempo>=60) {
			minutos=(byte) (tiempo/60);
			segundos= (byte)(tiempo%60);
		}
		else
			segundos = (byte) tiempo;
		
		System.out.println("La cantidad introducida es "+minutos+" minutos y "+segundos+" segundos");
		
		sc.close();
	}

}
