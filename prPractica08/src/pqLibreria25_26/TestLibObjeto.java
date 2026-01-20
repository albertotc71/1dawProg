package pqLibreria25_26;

import java.util.Scanner;

public class TestLibObjeto {

	public static void main(String[] args) {
		
		byte opcion;
		
		Scanner sc = new Scanner(System.in);
		
		LibreriaObjeto ob = new LibreriaObjeto(8);
		
		
		do {
			menu();
			
			System.out.print("Introduce una opcion: ");
			opcion = sc.nextByte();
			
			switch(opcion) {
				case 1 -> ob.cargaTeclado(sc);
				case 2 -> ob.cargaAleatoria();
				case 3 -> System.out.println(ob.toString());
				case 4 -> System.out.println(ob.elemMax());
				case 5 -> System.out.println(ob.elemMin());
				case 6 -> System.out.println(ob.sumaElementos());
			}
			
			
		}
		while(opcion!=18);
		
		
		sc.close();
	}

	
	private static void menu() {

		System.out.println("\n --- MENU DE OPERACIONES ---");
		System.out.println("1.- Carga de datos desde teclado");
		System.out.println("2.- Carga de datos aleatoria");
		System.out.println("3.- Mostrar array");
		System.out.println("4.- Valor máximo del array");
		System.out.println("5.- Valor mínimo del array");
		System.out.println("6.- Suma de los elementos del array");
		System.out.println("7.- Insertar por posición");
		System.out.println("8.- Borrar por posición");
		System.out.println("9.- Borrar buscando el número");
		System.out.println("10.- Borrar todas las apariciones de un numero");
		System.out.println("11.- Búsqueda lineal");
		System.out.println("12.- Búsqueda binaria o dicotómica");
		System.out.println("13.- Ordenación por el método de la burbuja");
		System.out.println("14.- Ordenación por el método de inserción");
		System.out.println("15.- Ordenación por el método de selección");
		System.out.println("16.- Ordenación por el método de Shell");
		System.out.println("17.- Desordenar array");
		System.out.println("18.- Salir");
		



	}
	
}
