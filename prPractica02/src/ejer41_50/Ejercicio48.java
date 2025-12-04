package ejer41_50;

import java.util.Scanner;

/**
 * Simular 100 tiradas de 2 dados y contar las veces que entre los dos suman 10.
 */

public class Ejercicio48 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		byte dado1, dado2, cont=0;
		
		for(int i = 1;i<=100;i++) {
			dado1= (byte)(Math.random()*6+1);
			dado2= (byte)(Math.random()*6+1);
			System.out.print("\nDado 1 "+dado1+" Dado 2 "+dado2);
			
			if(dado1+dado2==10)
				cont++;
		}
		
		System.out.println("\nSe han sumado entre los dos dados 10 "+cont+" veces");
		
		sc.close();
	}

}
