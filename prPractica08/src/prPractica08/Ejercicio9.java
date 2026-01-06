package prPractica08;

/**
 * 9.- Hacer un programa que genere un array de 15 números enteros de forma aleatoria, y a continuación
 * invierta internamente los números del array, no se puede utilizar un array auxiliar.
 */

public class Ejercicio9 {

	public static void main(String[] args) {
		
		int [] array = new int [15];

		//Rellenar el array con numeros aleatorios
		for(int i=0;i<array.length;i++) {
			array[i]=(int)(Math.random()*100);
			System.out.print(array[i]+" ");

		}

		System.out.println();
		int aux=0;

		for(int i=0;i<array.length;i++) {
			aux = array[i];
			array[i]=array[array.length-1-i];
			System.out.print(array[i]+" ");
			array[array.length-1-i]=aux;
		}
		
	}

}
