package ejer51_55;

import java.util.Scanner;

/**
 * Diseñar un algoritmo que determine si la cadena “abc”, aparece en una sucesión de caracteres cuyo final
 * viene dado por un punto. No se lee una cadena, sino caracteres sueltos. 
 */

public class Ejercicio53 {

	public static void main(String[] args) {
		
		char caracter;
		boolean swA=false, swB=false, swC=false;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Introduce un caracter: ");
			caracter = sc.next().charAt(0);
			if((swA==false) || (swB==false) || (swC==false)) {				
				if(caracter=='a') {
					swA=true;}
				else if ((caracter=='b') && (swA==true) && (swB==false)) {
					swB=true;}
				else if ((caracter=='c') && (swA==true) && (swB==true)) {
					swC=true;
				}
				else {
					swA = false;
					swB = false;
					swC = false;
				}
			}
				
				
		}
		while(caracter!='.');
		
		if(swA && swB && swC)
			System.out.println("Se ha encontrado la cadena ABC");
		else
			System.out.println("No se ha encontrado la cadena ABC");
		
		sc.close();
	}

}
