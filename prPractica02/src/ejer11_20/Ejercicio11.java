package ejer11_20;

import java.util.Locale;
import java.util.Scanner;

/**
 * Implementar un programa que pida por teclado un número decimal e indique si es un número casi-cero,
 * que son aquellos positivos o negativos, que se acercan a 0 por menos de 1 unidad, aunque curiosamente
 * el 0 no se considera un número casi cero. Ejemplos de números casi-cero son el 0,3, el -0,99 o el 0,123;
 * algunos números que no se consideran casi-ceros son: el 12,3, el 0 o el -1.
 */

public class Ejercicio11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		sc.useLocale(Locale.US); // Para poder utilizar el punto con los decimales
		
		float num;
		
		System.out.println("Introduce un numero para comprobar si es casi cero: ");
		num=sc.nextFloat();
		
		
		if((num<1)&&(num>-1)&&(num!=0))
			System.out.println("Este numero es casi cero");
		else if (num==0)
			System.out.println("Este numero no es casi cero");
		else
			System.out.println("Este numero no es casi cero");
		
		sc.close();
	}

}
