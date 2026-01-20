package prPractica08;

/**
 * Hacer un programa que lea del teclado 10 números enteros y los almacene en un vector. Utilizando
 * este vector, visualizar y sumar los elementos que ocupan las posiciones pares. 
 */

public class Ejercicio1 {

	public static void main(String[] args) {
		
		int array1[] = new int[10];
		int suma=0;
		
		for(int i=0;i<array1.length;i++) {
			array1[i] = (int) (Math.random()*30);
			if(i%2!=0) {
				suma+=array1[i];
			}
			System.out.println(array1[i]+" ");
		}
		System.out.println("La suma de los elementos pares es: "+suma);

	}

}
