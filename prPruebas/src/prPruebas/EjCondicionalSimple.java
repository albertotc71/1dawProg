package prPruebas;

public class EjCondicionalSimple {

	public static void main(String[] args) {
		
		//Ejemplo de condicional simple
		int numero = 100;
		
		if(numero==100) {
			System.out.println("El numero es 100");
		}
		
		
		if(numero==100) {
			System.out.println("----El numero es 100 ----");
			System.out.println("Hasta luego");
		}
		
		
		
		if(numero==100) //Ojo en este caso, solo forma parte del if la primera linea
			System.out.println("----El numero es 100 ----");
			System.out.println("Hasta luego");
		
		
		
		System.out.println("Fin de programa");
		
	}

}
