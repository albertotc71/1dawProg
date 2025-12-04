package prPractica01;

import java.util.Scanner;

/**
 * Realizar un programa para calcular el valor de la hipotenusa de un triángulo rectángulo aplicando el
 * teorema de Pitágoras. Se pedirán por teclado los dos catetos, y se mostrará por pantalla el resultado
 * de calcular la hipotenusa.
 * @param args
 */

public class Ejercicio05 {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		float cat1, cat2, hipotenusa;
		
		//Pedimos los valores de los catetos
		System.out.println("Dime el valor del primer cateto: ");
		cat1 = sc.nextFloat();
		
		System.out.println("Dime el valor del segundo cateto: ");
		cat2 = sc.nextFloat();
		
		//Calculamos la hipotenusa de esos catetos
		hipotenusa=(float) Math.sqrt(Math.pow(cat1, 2)+Math.pow(cat2, 2));
		
		//Mostramos la hipotenusa
		System.out.println("La hipotenusa con esos catetos es: "+hipotenusa);
		
		sc.close();
		
	}

}
