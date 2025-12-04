package prPractica01;

import java.util.Scanner;

/**
 * Diseñar una aplicación que calcule la longitud y el área de una circunferencia. 
 * Para ello el usuario debe introducir el radio (que puede contender decimales). 
 * @param args
 */

public class Ejercicio04 {
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		float longitud, area, radio;
		
		//Pedimos el radio de la circunferencia 
		System.out.println("Dime el radio de la circunferencia: ");
		radio = sc.nextFloat();
		
		//Calculamos la longitud
		longitud = (float)(2*Math.PI*radio);
		
		//Calculamos el area
		area = (float)(Math.PI*Math.pow(radio, 2));
		
		
		//Mostramos tanto la longitud y el area de esa circunferencia
		System.out.println("La longitud de la circunferencia es: "+longitud);
		System.out.println("El area de la circunferencia es: "+area);
		
		sc.close();
		
	}

}
