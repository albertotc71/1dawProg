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
			case 7 -> opcion7(ob, sc); 
			case 8 -> opcion8(ob, sc); 
			case 9 -> opcion9(ob, sc); 
			case 10 -> opcion10(ob, sc); 
			case 11 -> busquedaLineal(ob, sc); 
			case 12 -> opcion12(ob, sc); 
			case 13 -> ob.ordenarBurbuja(); 
			case 14 -> ob.ordenarInsercion(); 
			case 15 -> ob.ordenarSeleccion(); 
			case 16 -> ob.ordenarShell(); 
			case 17 -> ob.desordenarArray(); 
			case 18 -> System.out.println("Saliendo del programa"); 
			default -> System.out.println("Opcion no valida");
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
	
	
	
	public static void busquedaLineal(LibreriaObjeto array, Scanner sc) {
		int numero;
		System.out.print("Dime el número que quieras buscar de forma lineal: ");
		numero = sc.nextInt();
		System.out.println("Está en la posicion: "+array.busquedaLineal(numero));
	}
		
	
	public static void opcion12(LibreriaObjeto array, Scanner sc) {
		int numero;
		System.out.print("Dime el número que quieras buscar de forma binaria o dicotomica: ");
		numero = sc.nextInt();
		System.out.println("Está en la posicion: "+array.busquedaDic(numero));
	}
	
	public static void opcion7(LibreriaObjeto array, Scanner sc) {
		int num, posicion;
		System.out.print("Dime la posicion: ");
		posicion = sc.nextInt();
		System.out.print("Dime el número que quieras meter en esa posicion: ");
		num = sc.nextInt();
		System.out.println(array.insertaPosicion(num,posicion));
	}
	
	
	public static void opcion8(LibreriaObjeto array, Scanner sc) {
		int posicion;
		System.out.print("Dime la posicion que quieras borrar: ");
		posicion = sc.nextInt();
		System.out.println(array.borraPosicion(posicion));
	}
	
	public static void opcion9(LibreriaObjeto array, Scanner sc) {
		int num;
		System.out.print("Dime el número que quieras borrar en todo el array: ");
		num = sc.nextInt();
		System.out.println(array.borrarOcurrencia(num));
	}
	
	public static void opcion10(LibreriaObjeto array, Scanner sc) {
		int num;
		System.out.print("Dime el número que quieras borrar en todo el array: ");
		num = sc.nextInt();
		array.borrarTodaOcurrencia(num);
	}
	
}
