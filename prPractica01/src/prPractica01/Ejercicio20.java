package prPractica01;

import java.util.Scanner;

/**
 * Un biólogo está realizando un estudio de distintas especies de invertebrados y necesita una aplicación
 * que le ayude a contabilizar el número de patas que tienen en total todos los animales capturados
 * durante una jornada de trabajo. Para ello, nos ha solicitado una aplicación a la que hay que
 * proporcionar:
 * 	• El número de hormigas capturadas (6 patas).
 *  • El número de arañas capturadas (8 patas).
 *  • El número de cochinillas capturadas (14 patas).
 * La aplicación debe mostrar el número total de patas.
 */

public class Ejercicio20 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Constantes
		final short PATHORM=6;
		final short PATARA=8;
		final short PATCOCH=14;
		
		//Variables
		short numHor, numAra, numCoch, totalPatas;
		
		
		//Pedimos la cantidad de especies 
		System.out.println("Introduce la cantidad de hormigas: ");
		numHor=sc.nextShort();
		
		System.out.println("Introduce la cantidad de arañas: ");
		numAra=sc.nextShort();
		
		System.out.println("Introduce la cantidad de cochinillas: ");
		numCoch=sc.nextShort();
		
		//Calculamos el total de patas
		totalPatas = (short)((numHor*PATHORM)+(numAra*PATARA)+(numCoch*PATCOCH));
		
		
		//Mostramos el total de patas 
		System.out.println("El numero total de patas es: "+totalPatas);
		
		sc.close();
		
	}

}
