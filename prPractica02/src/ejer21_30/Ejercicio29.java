package ejer21_30;

/**
 * Hacer un algoritmo para mostrar por pantalla 100 veces de una forma alternativa: Hola, Adiós.
 */

public class Ejercicio29 {

	public static void main(String[] args) {
		
		boolean sw=true;
		
		for(int cont=1;cont<=100;cont++) {
			if(sw) {				
				System.out.println("Hola");
				sw=false;
			}
			else {
				System.out.println("Adios");
				sw=true;
			}
				
		}
		
	}

}
