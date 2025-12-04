package prPractica03;



public class TestLibreriaMatematica {
	
	public static void main(String[] args) {
		
		System.out.println(LibreriaMatematica.esPrimo(8)?"Es un numero primo":"No es un numero primo");
		System.out.println(LibreriaMatematica.isAmigos(6, 6)?"Son numeros amigos":"No son numeros amigos");
		System.out.println(LibreriaMatematica.perfecto(6)?"Es un numero perfecto":"No es un numero perfecto");
		System.out.println("El Euler es: "+LibreriaMatematica.euler(5));
		System.out.println(LibreriaMatematica.primosEntre(20, 9)?"Son primos entre si":"No son primos entre si");
		System.out.println("El maximo comun divisor es: "+LibreriaMatematica.mcd(24, 52));
		System.out.println("El maximo comun divisor recursivo es: "+LibreriaMatematica.mcdR(24, 52));
		System.out.println("El fibonacci es: "+LibreriaMatematica.fibonacci(3));
		System.out.println("El fibonacci recursivo es: "+LibreriaMatematica.fibonacciR(4));
		System.out.println("La potencia es: "+LibreriaMatematica.potencia(2, 3));
		System.out.println("La suma de fibonacci es: "+LibreriaMatematica.sumaFibonacci(5));
		
		
	}
	
	
	
}
