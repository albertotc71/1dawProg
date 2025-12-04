package ejer21_30;

import java.util.Scanner;

public class Ejercicio30v2 {
/**
 * Hacer un algoritmo para mostrar por pantalla los números múltiplos de 3 
 * que hay entre dos números determinados, de forma alternativa.
 * @param args
 */
	public static void main(String[] args) {
		// Creamos las variables
		int num1, num2;
		
		
		//Iniciamos Scanner
		Scanner sc = new Scanner(System.in);
		
		
		//Pedimos los numeros
		System.out.println("Dime dos numeros para mostrar los multiplos de 3: ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		
		//Comprobamos los numeros y hacemos el bucle
		if(num1<num2) {
			for(int cont=num1; cont<=num2;cont++) {
				if((cont%6)==0)
					System.out.print(cont+" ");
					
			}
		}
		
		
		
		//Cerramos Scanner
		sc.close();
		

	}

}
