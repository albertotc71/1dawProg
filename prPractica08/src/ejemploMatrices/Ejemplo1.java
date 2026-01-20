package ejemploMatrices;

public class Ejemplo1 {

	public static void main(String[] args) {
		
		
		//Definir una matriz de 6 filas y 8 columnas de tipo entero
		int [][] matriz = new int [6][8];
		
		//Recorrer la matriz con valores aleatorios
		for(int fil=0;fil<matriz.length;fil++) {  //Bucle para recorrer las filas
			for(int col=0;col<matriz[fil].length;col++) {
				matriz[fil][col] = (int)(Math.random()*100);
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
