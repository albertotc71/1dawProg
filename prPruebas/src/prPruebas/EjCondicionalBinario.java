package prPruebas;

public class EjCondicionalBinario {

	public static void main(String[] args) {
		
		//Ejemplos de condicional binario
		
		int numero = 99;
		
		
		if(numero==100)
			System.out.println("El numero es 100");
		else
			System.out.println("El numero no es 100");
		
		
		
		if(numero==100) {
			System.out.println("El numero es 100");
		}
		else {
			System.out.println("El numero no es 100");
		}
		
		
		
		if(numero==100) {
			System.out.println("El numero es 100");
			System.out.println("Hasta luego");
		}
		else {
			System.out.println("El numero no es 100");
			System.out.println("El numero es: "+numero);
			System.out.println("Adios");
		}
		
		
		
		
		System.out.println("Fin del programa");
		
	}

}
