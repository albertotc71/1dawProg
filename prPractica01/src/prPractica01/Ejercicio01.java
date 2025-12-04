package prPractica01;

import java.util.Scanner;

/**
 * Hacer un programa que pida al usuario su edad, y muestre la edad que tendrá el próximo año.
 * @param args
 */

public class Ejercicio01 {
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		byte edad;
		
		//Pedimos la edad del usuario
		System.out.println("Dime la edad que tienes este año");
		edad = sc.nextByte();
		
		//Mostramos la edad que tendra el año que viene
		System.out.println("La edad que tendras el año que viene es: "+(edad+1));
		
		sc.close();
	}

}
