package ejemploMatrices;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		int tabla [] [] = new int [10][11];
		
		
		//Recorrer la matriz con las tablas de multiplicar
		for(int fil=0;fil<tabla.length;fil++) {  //Bucle para recorrer las filas
			for(int col=0;col<tabla[fil].length;col++) {
				tabla[fil][col] = (fil+1)*col;
			}// End bucle columnas
			
		}//End bucle filas
		
		//Recorrer la matriz para mostrarla en consola
		for(int fil=0;fil<tabla.length;fil++) {  //Bucle para recorrer las filas
			for(int col=0;col<tabla[fil].length;col++) {
				System.out.print(tabla[fil][col]+"\t");
			}// End bucle columnas
			System.out.println();
		}//End bucle filas
		
		
	}

}
