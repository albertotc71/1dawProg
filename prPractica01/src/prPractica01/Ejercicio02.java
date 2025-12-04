package prPractica01;

import java.util.Scanner;

/**
 * Escribir un programa que pida el año actual y el de nacimiento del usuario. 
 * Debe calcular su edad, suponiendo que en el año en curso el usuario ya ha cumplido años.
 * @param args
 */

public class Ejercicio02 {
	
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		short anioAct, anioUsu;
		
		//Pedimos el año actual
		System.out.println("Dime el año en el que estamos: ");
		anioAct=sc.nextShort();
		
		//Pedimos el año en el que nacio el usuario
		System.out.println("Dime tu año de nacimiento: ");
		anioUsu = sc.nextShort();
		
		//Mostramos la edad que tiene el usuario
		System.out.println("La edad que tienes es: "+(anioAct-anioUsu));
		
		sc.close();
		
	}

}
