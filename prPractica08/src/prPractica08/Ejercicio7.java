package prPractica08;

/**
 * Crear e imprimir una lista unidimensional de 50 elementos con números aleatorios entre 1 y 100 de tal
 * forma que no se repita ninguno.
 */

public class Ejercicio7 {

	public static void main(String[] args) {

		int [] array = new int[50];
		int numero=0;

		for(int i=0;i<array.length;i++) {


			do {
				numero = (int)((Math.random()*100)+1); 
			}
			while(existe(array, numero, i));

			array[i]=numero;
			System.out.print(array[i]+" ");
		}

	}


	/**
	 * Metodo que comprueba si un numero esta repetido
	 * @param array
	 * @param num
	 * @param tope
	 * @return
	 */
	public static boolean existe(int []array, int num, int tope) {
		boolean sw = false;
		int contador=0;
		while((contador<tope)&&sw==false) {
			if(array[contador]==num)
				sw=true;
			contador++;
		}
		return sw;
	}

}
