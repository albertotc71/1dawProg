package pqLibreria25_26;

import java.util.Scanner;

public class TestLibClase {

	public static void main(String[] args) {

		byte opcion;
		
		int [] miArray = new int [10];

		Scanner sc = new Scanner(System.in);

		do {
			opcion = menu(sc);

			

			switch(opcion) {
			case 1 -> LibreriaClase.cargaTeclado(sc, miArray); 
			case 2 -> LibreriaClase.cargaAleatoria(miArray); 
			case 3 -> System.out.println(LibreriaClase.toString(miArray)); 
			case 4 -> System.out.println(LibreriaClase.elemMax(miArray)); 
			case 5 -> System.out.println(LibreriaClase.elemMin(miArray)); 
			case 6 -> System.out.println(LibreriaClase.sumaElem(miArray)); 
			case 7 -> opcion14(miArray, sc); 
			case 8 -> opcion15(miArray, sc); 
			case 9 -> opcion16(miArray, sc); 
			case 10 -> opcion17(miArray, sc); 
			case 11 -> opcion7(miArray, sc); 
			case 12 -> opcion8(miArray, sc); 
			case 13 -> LibreriaClase.ordenarBurbuja(miArray); 
			case 14 -> LibreriaClase.ordenarInsercion(miArray); 
			case 15 -> LibreriaClase.ordenarSeleccion(miArray); 
			case 16 -> LibreriaClase.ordenarShell(miArray); 
			case 17 -> LibreriaClase.desordenarArray(miArray); 
			case 18 -> System.out.println("Saliendo del programa"); 
			default -> System.out.println("Opción no válida");
			}


		}
		while(opcion!=18);


		sc.close();

	}


	/**
	 * Metodo que muestra el menu de operaciones por consola
	 * @param sc
	 * @return
	 */
	private static byte menu(Scanner sc) {
		
		byte opcion;
		
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
		System.out.print("Introduce una opcion: ");
		opcion = sc.nextByte();

		return opcion;


	}
	
	public static void opcion7(int [] array, Scanner sc) {
		int numero;
		System.out.print("Dime el número que quieras buscar de forma lineal: ");
		numero = sc.nextInt();
		System.out.println("Está en la posicion: "+LibreriaClase.busquedaLineal(array, numero));
	}
		
	
	public static void opcion8(int [] array, Scanner sc) {
		int numero;
		System.out.print("Dime el número que quieras buscar de forma binaria o dicotomica: ");
		numero = sc.nextInt();
		System.out.println("Está en la posicion: "+LibreriaClase.busquedaDic(array, numero));
	}
	
	public static void opcion14(int [] array, Scanner sc) {
		int num, posicion;
		System.out.print("Dime la posicion: ");
		posicion = sc.nextInt();
		System.out.print("Dime el número que quieras meter en esa posicion: ");
		num = sc.nextInt();
		System.out.println(LibreriaClase.insertaPosicion(array, posicion, num));
	}
	
	
	public static void opcion15(int [] array, Scanner sc) {
		int posicion;
		System.out.print("Dime la posicion que quieras borrar: ");
		posicion = sc.nextInt();
		System.out.println(LibreriaClase.borraPosicion(array, posicion));
	}
	
	public static void opcion16(int []array, Scanner sc) {
		int num;
		System.out.print("Dime el número que quieras borrar en todo el array: ");
		num = sc.nextInt();
		System.out.println(LibreriaClase.borrarOcurrencia(array, num));	}
	
	public static void opcion17(int [] array, Scanner sc) {
		int num;
		System.out.print("Dime el número que quieras borrar en todo el array: ");
		num = sc.nextInt();
		LibreriaClase.borrarTodaOcurrencia(array, num);
	}
	
	
	
}
