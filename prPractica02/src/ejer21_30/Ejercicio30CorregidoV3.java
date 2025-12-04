package ejer21_30;

import java.util.Scanner;

/**
 * Hacer un algoritmo para mostrar por pantalla los números múltiplos de 3 que hay entre dos números
 * determinados, de forma alternativa.
 * 
 * En esta version vamos a ir generando todos los valores de 6 en 6 en el intervalo
 * Tendremos que buscar el primer numero multiplo de 3, antes de entrar al bucle
 * 
 * 
 * @author Alberto
 * @version 3.0
 * 
 */


public class Ejercicio30CorregidoV3 {

	public static void main(String[] args) {
		
		//Definir el objeto Scanner para recoger datos del teclado
		Scanner sc = new Scanner(System.in);
		
		//Variables locales
		int num1, num2;
		
		System.out.print("Numero 1: ");
		num1 = sc.nextInt();
		
		
		System.out.print("Numero 2: ");
		num2 = sc.nextInt();
		
		
		//Si el valor de num1 es superior al de num2, intercambiamos el contenido 
		//de las variables
		if(num1>num2) {
			int aux = num1;  //aux es una variable local al if
			num1 = num2;
			num2 = aux;
		}
			
		
		//Buscar el primer multiplo de 3
		while((num1%3)!=0) {
			num1++;
		}
		//Generar 2 valores en el intervalo
		for(int cont=num1;cont<=num2;cont=cont+6) {  //cont+=6
				System.out.print(cont + " ");
				
		}//end for
		
		System.out.println();
		
		
		
		
		sc.close();
	}

}
