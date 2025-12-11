package prPractica08;

/**
 * Realizar un programa que genere y almacene en un array 20 números de forma aleatoria. A 
 * continuación deberá mostrar el array con los números generados, así como mostrar (junto con su
 * posición en el array), contar y sumar los elementos pares que ocupan las posiciones impares. 
 */

public class Ejercicio5 {

	public static void main(String[] args) {
		
		int []array = new int[20];
		int pares=0, contPares=0;
		
		//Recorrer el bucle para rellenarlo
		for(int i=0;i<array.length;i++) {
			array[i] = (int) (Math.random()*30);
			System.out.println("Posicion "+(i+1)+" del array: "+array[i]);
		}
		
		System.out.println();
		
		//Recorrer el bucle para sumar los pares y los impares
		for(int i=0;i<array.length;i+=2) {
			if(array[i]%2==0){
				pares+=array[i];
				contPares++;
				System.out.println("Elemento "+array[i]+", posicion: "+(i+1));
			}
				
			
		}
		System.out.println("Suma de los elementos pares: "+pares+" y la cantidad de los elementos pares es "+contPares);
		
		
	}

}
