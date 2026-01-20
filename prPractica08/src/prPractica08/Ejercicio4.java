package prPractica08;

import java.util.Scanner;

/**
 *  Escribe un programa que lea 8 números por teclado y que luego los muestre en orden inverso, es decir,
 *  el primero que se introduce es el último en mostrarse y viceversa. 
 */

public class Ejercicio4 {
	
	public static final byte TAMANIO = 8; 

	public static void main(String[] args) {
		
		int []array = new int [TAMANIO];
		
		Scanner sc = new Scanner(System.in);
		
		//Recorremos el array para rellenarlo con valores
		for(int i=0;i<array.length;i++) {
			System.out.print("Introduce un valor: ");
			array[i] = sc.nextInt();
		}
		
		
		//Recorremos el array hacia atras
		for(int i=array.length-1;i>=0;i--) {
			System.out.println(array[i]);
		}
		
		
		sc.close();
	}

}
