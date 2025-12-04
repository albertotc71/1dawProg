package ejer41_50;

import java.util.Scanner;

/**
 * Con la ayuda de la clase Random, o bien el método random de la clase Math, simular el lanzamiento de 
 * una moneda al aire y visualizar por pantalla si ha salido cara o cruz. Repetir el proceso tantas veces como
 * se quiera. 
 */

public class Ejercicio46 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char opcion;
		int aleatorio;
		
		do{
			aleatorio = (int) (Math.random()*2+1);
			if(aleatorio==1)
				System.out.println("Ha salido --> Cara");
			else
				System.out.println("Ha salido --> Cruz");
			System.out.print("Desea volver a tirar la moneda (S/N): ");
			opcion=sc.next().charAt(0);
			opcion=Character.toUpperCase(opcion);
			
		}
		
		while(opcion!='N');
			
		
		
		sc.close();
		
	}

}
