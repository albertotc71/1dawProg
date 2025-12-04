package prPractica03;

import java.util.Scanner;

public class TestFactorial {

	public static void main(String[] args) {
		
		//Variables locales
		int numero;
		long fact;
		
		try(Scanner sc = new Scanner(System.in)){
			System.out.print("Introduzca numero: ");
			numero = sc.nextInt();
			
		}
		fact = LibreriaMatematica.factorial(numero);
		if(fact == -1)
			System.out.println("No existe el factorial de numeros negativos");
		else
			System.out.println("Factorial (" + numero + ") = "+ fact);

		
		//Mostrar el factorial de los numeros del 0 al 10
		for(int cont=0;cont<=10;cont++) {
			System.out.println("\nFactorial (" + cont + ") = "+ LibreriaMatematica.factorial(cont));
		}
		
		
	}

}
