package ejer51_55;

import java.util.Scanner;

/**
 * Diseñar un algoritmo que lee una lista de números enteros terminada en 0, y que encuentre y escriba en
 * pantalla la posición de la primera y última ocurrencia del número 12 dentro de la lista. Si el número 12
 * no está en la lista, el algoritmo debería escribir 0. Por ejemplo, si el octavo número de la lista es el único
 * 12, entonces 8 sería la primera y la última posición de las ocurrencias de 12. 
 */

public class Ejercicio54 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num, posicion=0, primera=0, ultima=0;
		
		System.out.println("Introduzca un numero: ");
		num = sc.nextInt();
		
		while(num!=0) {
			if(num==12) {
				if(primera==0) {
					primera=posicion;
				}
				ultima=posicion;
			}
			
			System.out.println("Introduzca un numero: ");
			num = sc.nextInt();
		}
		if(primera==0)
			System.out.println("No se ha encontrado ningun 12");
		else
			System.out.println("Primera posicion: "+primera+ "\nUltima posicion: "+ultima);
		
		sc.close();
	}

}
