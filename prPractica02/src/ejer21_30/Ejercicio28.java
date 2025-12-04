package ejer21_30;

import java.util.Scanner;

/**
 *  Hacer un algoritmo que imprima, sume y cuente los números pares que hay entre dos números 
 *  determinados, debéis tener en cuenta si el primero de los números no es más pequeño que el segundo 
 */

public class Ejercicio28 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1, num2, suma=0, aux, contPares=0;
		
		System.out.println("Introduce un numero para contar todos los numeros pares y sumarlos: ");
		num1 = sc.nextInt();
		
		System.out.println("Introduce otro numero: ");
		num2 = sc.nextInt();
		
		
		if(num1<num2) {
			for(int cont=num1;cont<num2;cont++) {
				if(cont%2==0) {
					suma = suma+cont;
					contPares++;
				}
			}
		}
		else {
			aux=num1;
			num1=num2;
			num2=aux;
			
			for(int cont=num1;cont<num2;cont++) {
				suma = suma+cont;
				contPares++;
			}
		}
			
		System.out.println("La suma de esos numeros es: "+suma+" y hay "+contPares+" numeros pares");
		
		sc.close();
	}

}
