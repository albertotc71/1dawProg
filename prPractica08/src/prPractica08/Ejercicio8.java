package prPractica08;

/**
 * Hacer un programa que:
 *  Cree y cargue un array unidimensional de 12 elementos de tipo entero.
 *  Recorra ese array metiendo en un segundo array todos aquellos elementos que sean pares y
 * 	mayores que 25.
 *  Muestre en pantalla el contenido de los dos arrays unidimensionales.
 */

public class Ejercicio8 {

	public static void main(String[] args) {
		
		int array1 [] = new int [12];
		int contador=0;
		
		for(int i=0;i<array1.length;i++) {
			array1[i]=(int)(Math.random()*50);
			
			if((array1[i]%2==0)&&(array1[i]>25))
				contador++;
			System.out.print(array1[i]+" ");
		}
		System.out.println();
		int array2[]=new int [contador];
		int cont2=0;
		for(int i=0;i<array1.length;i++) {
			if((array1[i]%2==0)&&(array1[i]>25)) {
				array2[cont2]=array1[i];
			cont2++;
			}
			System.out.print(array2[i]+" ");
		}
		
		
	}

}
