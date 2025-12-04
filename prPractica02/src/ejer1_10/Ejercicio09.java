package ejer1_10;

import java.util.Scanner;

/**
 * Una empresa maneja códigos numéricos con las siguientes características:
 * ▪ Cada código consta de 4 dígitos.
 * ▪ El primero representa una provincia.
 * ▪ El segundo el tipo de operación.
 * ▪ Los dos últimos el número de operación.
 */

public class Ejercicio09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int codigo;
		
		System.out.println("Dime un codigo: ");
		codigo = sc.nextInt();
		
		if((codigo>=1000)&&(codigo<9999))
			System.out.println("Provincia: "+(codigo/1000)%100+
								"\nOperacion: "+(codigo/100)%10+
								"\nNumero de operacion: "+codigo%100);
		else
			System.out.println("Error, codigo invalido");
		
		
		sc.close();
	}

}
