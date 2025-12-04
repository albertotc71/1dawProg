package ejer31_40;

/**
 * Realizar un algoritmo para imprimir las tablas de multiplicar del uno al diez, es decir, tenéis que mostrar
 * la tabla del 1, la del 2, la del 3, … hasta la del 10.
 */

public class Ejercicio39 {

	public static void main(String[] args) {
		
		for(int cont=1;cont<=10;cont++) {
			System.out.println("Tabla del "+cont);
			for(int cont2=1;cont2<=10;cont2++) {
				System.out.println(cont+" x "+cont2+" = "+cont*cont2);
			}
		}
		
	}

}
