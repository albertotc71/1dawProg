package prPractica08;

/**
 * Crear e imprimir una lista unidimensional de 50 elementos con números aleatorios entre 1 y 100 de tal
 * forma que no se repita ninguno.
 */

public class Ejercicio7 {

	public static void main(String[] args) {
		
		int [] array = new int[50];
		
		for(int i=0;i<array.length;i++) {
			array[i]=(int)((Math.random()*100)+1);
		}
		
		
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array.length;j++) {
				if(array[i]==array[j])
					array[i]=(int)((Math.random()*100)+1);
			}
			System.out.print(array[i]+" ");
		}
		
	}

}
