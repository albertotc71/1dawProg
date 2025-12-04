package prPractica03;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * Menu con las diferentes opciones de la libreria matematica
 * @author Alberto Torres
 */
public class Menu {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		byte op=0;
		
		do {
			menu();
			try {
				
				System.out.println("Introduce una opcion (1..8): ");
				op = sc.nextByte();
				
				switch(op) {
				case 1: procesoFactorial(sc); break;
				case 2: procesoCombinatorio(sc); break;
				case 3: procesoPrimo(sc); break;
				case 4: procesoPerfectos(sc); break;
				case 5: procesoAmigos(sc); break;
				case 6: procesoPrimosEntre(sc); break;
				case 7: procesoEuler(sc); break;
				case 8: break;
				default: System.out.println("Error, opcion incorrecta");
				}
			}
			catch(InputMismatchException e) {
				sc.nextLine();
				System.out.println("Debe teclear un valor numerico");
			}
		}
		while(op!=8);
		
		sc.close();
	}
	
	/**
	 * Metodo que muestra las diferentes opciones del menu
	 */
	public static void menu() {
		System.out.println("\n1: Calcular el factorial de un numero"+
							"\n2: Mostrar el combinatorio de dos números dados"+
							"\n3: Visualizar los números primos entre dos números dados"+
							"\n4: Visualizar por pantalla los de números perfectos que hay entre 2 números dados"+
							"\n5: Visualizar por pantalla las parejas de números amigos que hay entre 2 números dados"+
							"\n6: Comprobar si dos números son primos entre sí"+
							"\n7: Calcular la función de Euler de un número"+
							"\n8: Salir");
	}

	/**
	 * Metodo que realiza el factorial 
	 * @param sc
	 */
	public static void procesoFactorial(Scanner sc) {
		int num;
		long factorial;
		
		System.out.println("Metodo de factorial");
		
		System.out.print("Introduce un numero: ");
		num = sc.nextInt();
		
		factorial = LibreriaMatematica.factorial(num);
		
		if(factorial==-1)
			System.out.println("No se puede calcular el factorial de un numero negativo");
		else
			System.out.println("El factorial de "+num+" es: "+factorial);
	}
	
	/**
	 * Metodo que realiza el combinatorio
	 * @param sc
	 */
	public static void procesoCombinatorio(Scanner sc) {
		int num1, num2;
		double combinatorio;
		
		System.out.println("Metodo combinatorio");
		
		System.out.print("Introduce un numero: ");
		num1 = sc.nextInt();
		
		System.out.print("Introduce otro numero: ");
		num2 = sc.nextInt();
		
		combinatorio = LibreriaMatematica.combinatorio(num1, num2);
		
		if(combinatorio==-1)
			System.out.println("No se puede calcular el factorial de estos numeros");
		else
			System.out.println("El combinatorio de "+num1+" sobre "+num2+" es: "+combinatorio);
	}
	
	
	/**
	 * Metodo que realiza si un numero es primo
	 * @param sc
	 */
	public static void procesoPrimo(Scanner sc) {
		
		int num1, num2;
		
		System.out.println("Metodo de numero primo");
		
		System.out.print("Introduce un numero: ");
		num1 = sc.nextInt();
		
		System.out.print("Introduce otro numero: ");
		num2 = sc.nextInt();
		
		for(int cont=num1;cont<=num2;cont++) {
			if(LibreriaMatematica.esPrimo(cont)) {				
				System.out.println(cont);
			}
		}
		
	}
	
	/**
	 * Metodo que calcula si un numero es perfecto
	 * @param sc
	 */
	public static void procesoPerfectos(Scanner sc) {
		
		
		int num1, num2;
		
		System.out.println("Metodo de numeros perfectos");
		
		System.out.print("Introduce un numero: ");
		num1= sc.nextInt();
		
		System.out.print("Introduce un numero: ");
		num2= sc.nextInt();
		
		for(int cont=num1;cont<=num2;cont++) {
			if(LibreriaMatematica.perfecto(cont))
				System.out.println(cont);
		}
		
	}
	
	
	/**
	 * Metodo que calcula si dos numeros son amigos
	 * @param sc
	 */
	public static void procesoAmigos(Scanner sc) {
		
		int num1, num2;
		
		System.out.println("Metodo de numeros amigos");
		
		System.out.print("Introduce un numero: ");
		num1= sc.nextInt();
		
		System.out.print("Introduce otro numero: ");
		num2= sc.nextInt();
		
		for(int i=num1;i<=num2;i++) {
			for(int j=i+1;j<=num2;j++) {
				if(LibreriaMatematica.isAmigos(i, j))
					System.out.println(i+" y "+j);
			}
		}
		
	}
	
	/**
	 * Metodo que comprueba si dos numeros son primos entre si
	 * @param sc
	 */
	public static void procesoPrimosEntre(Scanner sc) {
		
		int num1, num2;
		
		System.out.println("Metodo de primos entre si");
		
		System.out.print("Introduce un numero: ");
		num1= sc.nextInt();
		
		System.out.print("Introduce otro numero: ");
		num2= sc.nextInt();
		
		
		System.out.println(LibreriaMatematica.primosEntre(num1, num2)?"Son numeros primos entre si":"No son primos entre si");
	}
	
	
	/**
	 * Metodo que calcula el Euler de un numero
	 * @param sc
	 */
	public static void procesoEuler(Scanner sc) {
		
		int num;
		
		System.out.println("Metodo de Euler");
		
		System.out.print("Introduce un numero: ");
		num= sc.nextInt();
		
		if(num<0)
			System.out.println("No se puede calcular el Euler de un numero negativo");
		else
			System.out.println("El Euler de "+num+" es: "+LibreriaMatematica.euler(num));
		
	}
	
		
}
