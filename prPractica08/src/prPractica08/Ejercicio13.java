package prPractica08;

/**
 *  Define un array de números enteros de 3 filas por 6 columnas y asigna los valores según la siguiente
 *  tabla. Muestra el contenido de todos los elementos del array dispuestos en forma de tabla como se
 *  muestra en la figura. 
 */

public class Ejercicio13 {

	public static void main(String[] args) {
		
		//Definir la matriz
		int [][] matriz = new int [3][6]; 
		
		
		//Meter elementos en la matriz
		matriz[0][1] = 30;
		matriz[0][2] = 2;
		matriz[0][5] = 5;
		matriz[1][0] = 75;
		matriz[2][2] = -2;
		matriz[2][3] = 9;
		matriz[2][5] = 11;
		
		
		//Recorrer la matriz para mostrarla en consola
		for(int fil=0;fil<matriz.length;fil++) {  //Bucle para recorrer las filas
			for(int col=0;col<matriz[fil].length;col++) {
				System.out.print(matriz[fil][col]+"\t");
			}// End bucle columnas
			System.out.println();
		}//End bucle filas
		
		
		System.out.println();
		//Otra forma
		int matriz1[][] = {{0,30,2,0,0,5},
							{75,0,0,0,0,0},
							{0,0,-2,9,0,11}};
		
		//Recorrer la matriz para mostrarla en consola
		for(int fil=0;fil<matriz1.length;fil++) {  //Bucle para recorrer las filas
			for(int col=0;col<matriz1[fil].length;col++) {
				System.out.print(matriz1[fil][col]+"\t");
			}// End bucle columnas
			System.out.println();
		}//End bucle filas		
		
		
	}

}
