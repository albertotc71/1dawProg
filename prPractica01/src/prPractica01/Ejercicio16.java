package prPractica01;

import java.util.Scanner;

/**
 *  Un programa tiene como entrada dos números y los almacena en las variables “u” y “v”. ¿Qué hay que
 *  hacer par que al final del algoritmo los valores de las variables estén intercambiados? Diseña el
 *  algoritmo correspondiente.
 */

public class Ejercicio16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Variables
		int u,v,aux;
		
		//Pedimos los valores
		System.out.println("Introduce un valor: ");
		u = sc.nextInt();
		
		System.out.println("Introduce otro valor: ");
		v = sc.nextInt();
		
		
		//Intercambiamos los valores de esas variables
		aux=u;
		u=v;
		v=aux;
		
		//Mostramos los valores intercambiados
		System.out.println("Los valores intercambiados es: "+u+" "+v);
		
		
		sc.close();
	}

}
