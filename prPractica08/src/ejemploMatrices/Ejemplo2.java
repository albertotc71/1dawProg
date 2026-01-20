package ejemploMatrices;

import java.util.Scanner;

/**
 * Clase que genera una matriz cuadrada del tamaño que nos indique el usuario
 * sus valores seran aleatorios, excepto el de la diagonal principal que
 * sera siempre 1
 */

public class Ejemplo2 {

	public static void main(String[] args) {
		
		int matriz [] [];
		int dimension; 
		
		try(Scanner sc = new Scanner(System.in)){
			System.out.print("Dime la dimension de la matriz: ");
			dimension=sc.nextInt();
			matriz = new int [dimension] [dimension];
		}
		
		
		//Recorrer la matriz con valores aleatorios
		for(int fil=0;fil<matriz.length;fil++) {  //Bucle para recorrer las filas
			for(int col=0;col<matriz[fil].length;col++) {
				if(fil==col) {
					matriz[fil][col]=1;					
				}
				else {					
					matriz[fil][col] = (int)(Math.random()*100);
				}
			}// End bucle columnas
		}//End bucle filas
		
		
		//Recorrer la matriz para mostrarla en consola
		for(int fil=0;fil<matriz.length;fil++) {  //Bucle para recorrer las filas
			for(int col=0;col<matriz[fil].length;col++) {
				System.out.print(matriz[fil][col]+"\t");
			}// End bucle columnas
			System.out.println();
		}//End bucle filas
		
		
	}

}
