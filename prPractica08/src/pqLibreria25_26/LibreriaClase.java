package pqLibreria25_26;

import java.util.Scanner;

/**
 * Librería con métodos de clases para manejar arrays, esta
 * librería incluirá los siguientes métodos:
 *    - Carga de datos de teclado
 *    - Carga de datos aleatoria
 *    - toString
 *    - Elemento máximo del array
 *    - Elemento mínimo del array
 *    - Suma de los elementos del array
 *    - Métodos de búsqueda (lineal y dicotómica o binaria)
 *    - Métodos varios de ordenación (burbuja, selección, inserción y Shell)
 *    - Método que desordene el array
 *    - Método de insertar por posición
 *    - Método de borrar por posición
 *    - Método de borrar por elemento
 *    - Método para borrar todas las apariciones de un elemento
 * 
 * @author Alberto Torres
 *
 */

public class LibreriaClase {
	
	/**
	 * Metodo que carga los datos desde el teclado
	 * @param sc
	 */
	public static void cargaTeclado(Scanner sc, int [] array) {
		
		for(int i=0;i<array.length;i++) {
			System.out.print("Introduzca el elemento de la posicion "+(i+1)+": ");
			array[i]=sc.nextInt();
		}
		
	}
	
	
	/**
	 * Metodo que carga los datos de forma aleatoria
	 */
	public static void cargaAleatoria(int [] array) {
		for(int i=0;i<array.length;i++) {
			array[i]=(int)((Math.random()*20)+1);
		}
	}
	
	
	/**
	 * Redefinicion del metodo toString
	 */
	
	public static String toString(int [] array) {
		String cadena = "Array: ";
		
		for(int i=0;i<array.length;i++) {
			cadena += array[i]+" ";
		}
		
		return cadena;
	}
	
	
	public static String toString2(int [] array) {
		String cadena = "Array: ";
		
		for(int i=0;i<array.length-1;i++) {
			cadena += array[i]+", ";
		}
		
		cadena += array[array.length-1];
		
		return cadena;
	}
	
	/**
	 * Metodo que devuelve el elemento maximo del array
	 * @param array
	 * @return
	 */
	public static int elemMax(int array[]) {
		int max = array[0];
		for(int i=0;i<array.length;i++) {
			if(array[i]>max)
				max=array[i];
		}
		
		return max;
	}
	
	/**
	 * Metodo que devuelve el elemento minimo
	 * @param array
	 * @return
	 */
	public static int elemMin(int array[]) {
		int min = array[0];
		for(int i=0;i<array.length;i++) {
			if(array[i]<min)
				min=array[i];
		}
		
		return min;
	}
	
	
	/**
	 * Metodo que suma todos los elementos del array
	 * @param array
	 * @return
	 */
	public static int sumaElem(int array[]) {
		int suma=0;
		for(int i=0;i<array.length;i++) {
			suma+=array[i];
		}
		
		return suma;
	}
	
	
	/**
	 * Metodo que busca de forma lineal
	 * @param array
	 * @return
	 */
	public static int busquedaLineal(int array[], int num) {
		int cont=0;
		do{
			cont++;
		}
		while ((array[cont]!=num) && (cont < (array.length-1)));
		if(array[cont]==num){
			return cont;
		}
		return -1;
	}
	
	/**
	 * Metodo que busca de forma binaria o dicotomica
	 * @param array
	 * @param num
	 * @return
	 */
	public static int busquedaDic(int array[], int num) {
		boolean sw = false;
		int mitad, primero = 0, ultimo = array.length-1;
		do{
			mitad = (primero + ultimo)/2;
			if(array[mitad]==num)
				sw = true;
			else if(array[mitad]<num)
				primero = mitad+1;
			else
				ultimo = mitad-1;
		}
		while ((sw == false) && (primero <= ultimo));
		if(sw == false)
			return -1;
		return mitad;
	}
	
	/**
	 * Metodo de ordenacion por burbuja 
	 * @param array
	 */
	public static void ordenarBurbuja(int [] array){ 
		int i=1, temp; 
		boolean ordenado=false; 
		while(i<array.length && ordenado == false){ 
			ordenado = true; 
			for(int j=array.length-1; j>=i; j--){ 
				if(array[j]<array[j-1]){ 
					temp=array[j]; 
					array[j]=array[j-1]; 
					array[j-1]=temp; 
					ordenado = false; 
				} 
			} 
			i++; 
		} 
	} 
	
	/**
	 * Metodo de ordenacion por seleccion
	 * @param array
	 */
	public static void ordenarSeleccion(int [] array){ 
		int pos_menor, menor; 
		for(int i=0; i<=array.length-2; i++){ 
			pos_menor=i; 
			menor = array[i]; 
			for(int j= i+1; j<=array.length-1; j++){ 
				if(array[j]<menor){ 
					pos_menor = j; 
					menor = array[j]; 
				} 
			} 
			array[pos_menor]=array[i]; 
			array[i]=menor; 
		} 
	} 
	
	/**
	 * Metodo de ordenacion por inserccion
	 * @param array
	 */
	public static void ordenarInsercion(int [] array) { 
		int j, aux; 
		for (int i = 1; i<(array.length); i++) { 
			aux = array[i]; 
			j = i-1; 
			while ((j >= 0) && (array[j] > aux)) { 
				array[j+1] = array[j]; 
				j--; 
			}  
			array[j+1] = aux; 
		} 
	} 
	
	
	/**
	 * Metodo de ordenacion por shell
	 * @param array
	 */
	public static void ordenarShell(int [] array) {
		int sw, i, salto, aux, n; 
		n = array.length-1;
		salto = n;
		while (salto != 1) {
			sw = 1;
			salto = salto/2;
			while (sw!=0) {
				i = 0; 
				sw = 0;
				while (i <= (n-salto)) {
					if (array[i] > array[i+salto]) {
						aux = array[i+salto];
						array[i+salto] = array[i];
						array[i]= aux;
						sw = 1;
					}
					i++;
				} //End while salto
			}//End while switch
		}//End while salto 
	}
	
	
	/**
	 * Metodo para desordenar el array
	 */
	public static void desordenarArray(int [] array) {
		int pos1=0, pos2=1;

		for(int i=0;i<array.length;i++) {
			pos2=(int)(Math.random()*array.length-1);
			pos1=(int)(Math.random()*array.length-1);
			array[pos1]=array[pos2];
			array[pos2]=array[pos1];
		}
	}
	
	/**
	 * Metodo que inserta un numero en una posicion del array
	 * @param array
	 * @param posicion
	 * @param sc
	 * @return
	 */
	public static boolean insertaPosicion(int [] array, int posicion, int num) {
		boolean pos;
		if(posicion>=array.length || posicion<0)
			pos=false;
		else {
			pos=true;
		for(int i=array.length;i<=posicion;i--) {
			array[i]= array[i-1];
		}
		array[posicion]=num;
		}
		return pos;
	}
	
	/**
	 * Metodo que borra por la posicion que le llega por teclado
	 * @param array
	 * @param sc
	 * @return
	 */
	public static boolean borraPosicion(int [] array, int posicion) {
		boolean pos;
		if(posicion>=array.length || posicion<0)
			pos=false;
		else {
			pos=true;
		for(int i=posicion;i<array.length-1;i++) {
			array[i]=array[i+1];
		}
		array[array.length-1] = 0;
		}
		return pos;
	}
	
	/**
	 * Metodo para borrar por algun numero que introduzca por teclado
	 * @param array
	 * @param sc
	 * @return
	 */
	public static boolean borrarOcurrencia(int [] array, int num) {
		boolean ocurrencia = false;
		borraPosicion(array, busquedaLineal(array, num));
		return ocurrencia;
	}
	
	
	/**
	 * Metodo que borra todas las ocurrencias 
	 * @param array
	 * @param num
	 */
	public static void borrarTodaOcurrencia(int [] array, int num) {
		while (LibreriaClase.borrarOcurrencia(array, num));
	}
	
	
	
	
}
