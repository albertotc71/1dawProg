package ejer11_20;

/**
 * ¿Qué rango de valores pueden tomar X e Y para garantizar que el siguiente algoritmo termina? 
 */

public class Ejercicio19 {

	public static void main(String[] args) {
		
		int a, b, x=0, y=0;
		a=x;
		b=y;
		
		do {
			while(a>b) {
				a=a-b;
			}
			while(b>a) {
				b=b-a;
			}
		}
		while(a!=b);
		
		//Podrian todos los valores y siempre va a mostrar el menor
	}

}
