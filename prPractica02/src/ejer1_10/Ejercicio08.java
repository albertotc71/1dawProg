package ejer1_10;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Realizar un algoritmo que lea dos valores desde teclado y diga si cualquiera de ellos divide de forma 
 * entera al otro
 */

public class Ejercicio08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1, num2;
		
		try {
			
		
		System.out.println("Dime un numero para comprobar si divide de forma entera a otro numero: ");
		num1 = sc.nextInt();
		
		System.out.println("Dime otro numero: ");
		num2 = sc.nextInt();
		
		
		if(num1%num2==0)
			System.out.println("El "+num1+" divide de forma entera a "+num2);
		else if (num1%num2==0)
			System.out.println("El "+num2+" divide de forma entera a "+num1);
		else
			System.out.println("Esos numeros no se pueden dividir de forma entera");
		
		System.out.println((num1%num2)==0?"El "+num1+" divide de forma entera a "+num2
									:(num2%num1==0)?"El"+num2+" divide de forma entera a "+num1
										:"Esos numeros no se pueden dividir de forma entera");
		}
		catch(InputMismatchException e) {
			System.out.println("Error de lectura de datos");
		}
		catch(ArithmeticException e1) {
			System.out.println("Error, no se puede dividir por 0");
		}
		
		sc.close();
	}

}
