package prPractica01;

import java.util.Scanner;

/**
 * Diseña un programa que solicite al usuario su edad, y a continuación indique si es mayor o menor de
 * edad, os podéis ayudar del operador condicional, no se puede utilizar la sentencia condicional if.
 * @param args
 */

public class Ejercicio06 {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		byte edad;
		
		//Preguntamos por la edad del usuario
		System.out.println("Dime tu edad: ");
		edad=sc.nextByte();
		
		//Mostramos si es menor o mayor de edad el usuario
		System.out.println(edad>=18?"Eres mayor de edad":"Eres menor de edad");
		
		
		sc.close();
		
		
	}

}
