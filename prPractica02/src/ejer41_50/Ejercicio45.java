package ejer41_50;

import java.util.Scanner;

/**
 * Hacer un algoritmo para que nos calcule la estadística de una serie de notas introducidas por teclado.
 * La serie finalizará con la introducción del 0,
 */

public class Ejercicio45 {

	public static void main(String[] args) {
		
		int nota, contNotas=0;
		double insuficiente=0, suficiente=0, bien=0, notable=0, sobresaliente=0;
		
		try(Scanner sc = new Scanner(System.in)){
			
			System.out.print("Introduce la nota: ");
			nota = sc.nextInt();



			while(nota!=0) {
				
				if(nota>10||nota<0) {
					System.out.println("Nota no valida");
				}
				else {
					switch(nota) {
					case 1 : 
					case 2 :
					case 3 : 
					case 4 : insuficiente++; break;
					case 5 : suficiente++; break;
					case 6 : bien++; break;
					case 7 : 
					case 8 : notable++; break;
					case 9 : 
					case 10 : sobresaliente++; break;
					}//end switch
				}//end else
				
				System.out.print("Introduce la nota: ");
				nota = sc.nextInt();
			}//end while
			contNotas=(int) (insuficiente+suficiente+bien+notable+sobresaliente);
			
			if(insuficiente>0)
				System.out.println((insuficiente*100)/contNotas+" % de insuficientes");
			
			if(suficiente>0)
				System.out.println((suficiente*100)/contNotas+" % de suficientes");
			
			if(bien>0)
				System.out.println((bien*100)/contNotas+" % de bien");
			
			if(notable>0)
				System.out.println((notable*100)/contNotas+" % de notables");
			
			if(sobresaliente>0)
				System.out.println((sobresaliente*100)/contNotas+" % de sobresaliente");
			
		}
		
	}

}
