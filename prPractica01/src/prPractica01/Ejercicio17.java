package prPractica01;

import java.util.Scanner;

/**
 * Escribir un programa que reciba 4 números naturales a, b, c y d y que calcule:
 */

public class Ejercicio17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Variables
		int a,b,c,d,total;
		
		//Pedimos los 4 numeros
		System.out.println("Introduce el primer numero: ");
		a=sc.nextInt();
		
		System.out.println("Introduce el segundo numero: ");
		b=sc.nextInt();
		
		System.out.println("Introduce el tercer numero: ");
		c=sc.nextInt();
		
		System.out.println("Introduce el cuarto numero: ");
		d=sc.nextInt();
		
		
		//Calculamos con la formula
		total=(int) ((Math.pow(a, b)+Math.pow(c, d))*(Math.pow(a, c)+Math.pow(b, d)));
		
		
		//Mostrar el total
		System.out.println("El valor total es: "+total);
		
		sc.close();
	}

}
