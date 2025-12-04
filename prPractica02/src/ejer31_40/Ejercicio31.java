package ejer31_40;

import java.util.Scanner;

/**
 * Realizar un programa para calcular el valor máximo y el mínimo de una lista de n números que se
 * introducen por teclado, es decir, me indicarán cuántos valores se van a introducir, y se pedirán por 
 * teclado los que nos hayan indicado.
 */

public class Ejercicio31 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num, max=Integer.MIN_VALUE, min=Integer.MAX_VALUE, valor;
		
		
		System.out.println("Dime la cantidad de numeros para calcular el valor maximo y minimo: ");
		num = sc.nextInt();
		
		for(int cont=1;cont<=num;cont++) {
			System.out.println("Introduce un valor: ");
			valor = sc.nextInt();
			if(valor<min)
				min=valor;
			if(valor>max)
				max=valor;
		}
		
		System.out.println("El valor maximo es "+max+" y el valor minimo es "+min);
		
		sc.close();
	}

}
