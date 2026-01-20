package prPractica08;


/**
 * Diseñar un algoritmo que lee una matriz de tamaño 6 x 8 de números enteros (fila a fila), la almacena
 * en un array bidimensional llamado A. A continuación almacena los resultados de las sumas de los
 * elementos de cada fila en un vector llamado B, y las sumas de los elementos de cada columna en un
 * vector llamado C. Finalmente imprime los tres arrays.
 */

public class Ejercicio14 {

	public static void main(String[] args) {
		
		//Creamos las matrices
		int [][] a = new int [6][8];
		int [] b = new int [6];
		int [] c = new int [8];
		
		//Rellenamos la matriz
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j] = (int)(Math.random()*50);
			}
		}
		
		
		//Rellenamos el primer array con la suma de los elementos de cada fila de la matriz
		int total=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				total += a[i][j];
				b[i] = total;
			}
		}
		
		total=0;
		//Rellenamos el segundo array con la suma de las columnas de la matriz
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				total += a[i][j];
				c[i] = total;
			}
		}
		
		
		//Mostramos todos los arrays y la matriz
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		
		System.out.println();
		for(int i = 0;i<b.length;i++) {
			System.out.print(b[i]+" ");
		}
		
		System.out.println();
		
		for(int i = 0;i<c.length;i++) {
			System.out.print(c[i]+" ");
		}
		
	}

}
