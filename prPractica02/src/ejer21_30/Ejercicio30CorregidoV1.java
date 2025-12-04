package ejer21_30;

import java.util.Scanner;

/**
 * Hacer un algoritmo para mostrar por pantalla los números múltiplos de 3 que hay entre dos números
 * determinados, de forma alternativa.
 * 
 * En esta version vamos a ir generando todos los valores en el intervalo
 * y comprobando si el numero es multiplo de 3, si lo es, una vez si y otra no
 * (utilizaremos un boolean para ello), sacaremos el valor 
 * 
 * @author Alberto
 * @version 1.0
 * 
 */


public class Ejercicio30CorregidoV1 {

	public static void main(String[] args) {
		
		//Definir el objeto Scanner para recoger datos del teclado
		Scanner sc = new Scanner(System.in);
		
		//Variables locales
		int num1, num2;
		boolean sw=true;
		
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
			
		
		//Version 1
		//Generar 2 valores en el intervalo
		for(int cont=num1;cont<=num2;cont++) {
			if((cont%3)==0) {		//Hemos encontrado un multiplo de 3
				if(sw==true) {  //Si cojo el multiplo
					System.out.print(cont + " ");
					sw=false;
				}
				else {
					sw=true;
				}//end else
			}//end if
		}//end for
		
		System.out.println();
		//Version 2
		//Generar 2 valores en el intervalo
		sw=true;
		for(int cont=num1;cont<=num2;cont++) {
			if((cont%3)==0) {		//Hemos encontrado un multiplo de 3
				if(sw)  //if(sw==true) es equivalente a if(sw)
					System.out.print(cont + " ");
				
				sw= !sw; //Niego lo que tenga
			}//end if
		}//end for

		
		
		sc.close();
	}

}
