package prRepaso;

/**
 * Programa que calcule el cuadrado de los 100 primeros números pares.
 */

public class Ejercicio1 {

	public static void main(String[] args) {
		
		for(int cont=0;cont<200;cont++) {
			if((cont%2)==0)
				System.out.println("El cuadrado de "+cont+" es: "+Math.pow(cont, 2));
		}
		
	}

}
