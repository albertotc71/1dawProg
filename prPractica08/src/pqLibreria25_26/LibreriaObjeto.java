package pqLibreria25_26;

import java.util.Scanner;

/**
 * Librería con métodos de objeto para manejar arrays, el array con el 
 * que trabajaremos será variable de instancia.
 * 
 * Esta librería incluirá los siguientes métodos:
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


public class LibreriaObjeto {
	
	/**
	 * Constante
	 */
	private static final int NUM_ELEM_DEFECTO = 10;
	
	
	
	/**
	 * Variables de instancia
	 */
	private int [] array;

	
	
	
	/**
	 * Constructor
	 */
	public LibreriaObjeto(int numElementos) {
		this.array = new int [numElementos];
	}

	
	public LibreriaObjeto() {
		this(NUM_ELEM_DEFECTO);
	}


	/**
	 * Getter's and setter's
	 * @return
	 */
	public int[] getArray() {return array;}

	public void setArray(int[] array) {this.array = array;}
	
	
	/**
	 * Metodo que carga los datos desde el teclado
	 * @param sc
	 */
	public void cargaTeclado(Scanner sc) {
		
		for(int i=0;i<array.length;i++) {
			System.out.print("Introduzca el elemento de la posicion "+(i+1)+": ");
			array[i]=sc.nextInt();
		}
		
	}
	
	/**
	 * Metodo que carga los datos de forma aleatoria
	 */
	public void cargaAleatoria() {
		for(int i=0;i<array.length;i++) {
			array[i]=(int)((Math.random()*20)+1);
		}
	}
	
	
	/**
	 * Metodo que devuelve el numero mas grande del array
	 * @return
	 */
	public int elemMax() {
		int max=Integer.MIN_VALUE;
		for(int i=0;i<array.length;i++) {
			if(array[i]>max)
				max=array[i];
		}
		
		return max;
		
	}
	
	
	/**
	 * Metodo que devuelve el numero mas pequeño del array
	 * @return
	 */
	public int elemMin() {
		int min=Integer.MAX_VALUE;
		for(int i=0;i<array.length;i++) {
			if(array[i]<min)
				min=array[i];
		}
		
		return min;
		
	}
	
	/**
	 * Metodo que suma todos los elementos del array
	 * @return
	 */
	public int sumaElementos() {
		int total=0;
		for(int i=0;i<array.length;i++) {
			total += array[i];
		}
		
		return total;
	}
	
	/**
	 * Metodo de busqueda dicotomica o binaria
	 * @param numero
	 * @return
	 */
	public int busquedaDic(int numero){ 
		boolean sw = false; 
		int mitad, primero = 0, ultimo = array.length-1; 
		do{ 
			mitad = (primero + ultimo)/2; 
			if(array[mitad]==numero) 
				sw = true; 
			else if(array[mitad]<numero) 
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
	 * Metodo de busqueda lineal 
	 * @param numero
	 * @return
	 */
	public int busquedaLineal(int numero){ 
		int cont=-1; 
		do { 
			cont++; 
		} 
		while ((array[cont]!=numero) && (cont < (array.length-1))); 
		if(array[cont]==numero) return cont; 
		return -1; 
	} 
	
	
	/**
	 * Metodo de ordenar por burbuja
	 */
	public void ordenarBurbuja(){ 
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
	 * Redefinicion del metodo toString
	 */
	@Override
	public String toString() {
		String cadena = "Array: ";
		
		for(int i=0;i<array.length;i++) {
			cadena += array[i]+" ";
		}
		
		return cadena;
	}
	
	
	public String toString2() {
		String cadena = "Array: ";
		
		for(int i=0;i<array.length-1;i++) {
			cadena += array[i]+", ";
		}
		
		cadena += array[array.length-1];
		
		return cadena;
	}
	
}
