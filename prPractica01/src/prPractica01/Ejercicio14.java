package prPractica01;

import java.util.Scanner;

/**
 *   Realizar un programa que realiza y muestra las operaciones aritméticas básicas de dos números
 *   pasados a nuestro programa. Las operaciones aritméticas básicas son, suma, resta, multiplicación y
 *   división. 
 */

public class Ejercicio14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Variables
		int num1, num2, suma, resta, multi;
		float divi;
		
		
		//Pedimos los dos numeros
		System.out.println("Introduce un numero: ");
		num1 = sc.nextInt();
		
		System.out.println("Introduce otro numero: ");
		num2 = sc.nextInt();
		
		
		
		//Realizamos las operaciones
		suma = num1+num2;
		resta = num1-num2;
		multi = num1*num2;
		divi = (float)num1/num2;
		
		
		//Mostramos los resultados
		System.out.println("La suma de esos numeros es: "+suma);
		System.out.println("La resta de esos numeros es: "+resta);
		System.out.println("La multiplicacion de esos numeros es: "+multi);
		if(num2==0)
			System.out.println("Error no se puede dividir por 0");
		else
			System.out.println("La division de esos numeros es: "+divi);			
		
		
		sc.close();
		
	}

}
