package ejer31_40;

import java.util.Scanner;

/**
 * Realizar un algoritmo con un menú de 4 opciones. La selección de cada opción se realizará usando una
 * variable de tipo carácter. Cada una de las opciones realizará las siguientes tareas:
 * F:  Calculará el factorial.
 * R: Calculará la raíz cuadrada de un número si es positivo y si es negativo,  dará un
 * mensaje de error.
 * C: Calculará el cuadrado de un número.
 * T:  Finalizará el algoritmo.
 */

public class Ejercicio38 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char opcion;
		int num;
		
		do {
			
		
		System.out.println("MENU DE OPERACIONES: \nF, para calcular el factorial; "
				+ "\nR, para calcular la raiz cuadrada; "
				+ "\nC, para calcular el cuadrado de un numero y "
				+ "\nT, para terminar el programa");
		
		System.out.println("Introduce una opcion (F/R/C/T): ");
		opcion = sc.next().charAt(0);
		opcion = Character.toUpperCase(opcion);
		
		System.out.print("Numero: ");
		num = sc.nextInt();
		
		switch (opcion) {
			case 'F' -> {
				int total=1;
				for(int cont=num;cont>0;cont--) {
					total=total*cont;
				}
				System.out.println("El factorial es: "+total);
			}
			case 'R' ->{
				System.out.println("La raiz cuadrada es: "+Math.sqrt(num));
			}
			case 'C'-> {
				System.out.println("El cuadrado es: "+Math.pow(num, 2));
			}
			
			

			}
		}
		while(opcion!='T');
		
		sc.close();
		
	}

}
