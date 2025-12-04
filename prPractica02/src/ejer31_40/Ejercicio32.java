package ejer31_40;

import java.util.Scanner;

/**
 *  Hacer un algoritmo para calcular el valor máximo y el valor mínimo de una lista de números que se
 *  introducen por teclado, se terminará la operación cuando se introduzca el número 0, en este caso no
 *  sabremos cuántos valores se van a introducir. 
 */

public class Ejercicio32 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num, min=Integer.MAX_VALUE, max=Integer.MIN_VALUE;
		
		System.out.println("Dime un numero para averiguar cual es el maximo y el minimo: ");
		num=sc.nextInt();
		
		while(num!=0) {
			if(num<min)
				min=num;
			if(num>max)
				max=num;
			System.out.println("Dime otro numero: ");
			num = sc.nextInt();
		}
		
		System.out.println("El valor maximo es "+max+" y el minimo es "+min);
		
		
		sc.close();
	}

}
