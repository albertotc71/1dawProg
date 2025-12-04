package ejer41_50;

import java.util.Scanner;

/**
 * Introducir dos números inferiores a 50 y superiores a 0 por teclado. Al más pequeño de ellos lo
 * aumentamos de 5 en 5 y al más grande lo disminuimos de 2 en 2. Imprimir ambas series alternativamente
 * hasta que el menor supere al mayor. 
 */

public class Ejercicio41 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.println("Introduce limite inferior (entre 1 y 49): ");
		num1 = sc.nextInt();
		
		
		System.out.println("Introduce limite superior (entre 1 y 49): ");
		num2 = sc.nextInt();
		
		
		if((num1>0)&&(num1<=50)){
			if(((num2>0)&&(num2<=50))) {
				while(num1<=num2) {
					System.out.println(num1 + " "+ num2);
					num1+=5;
					num2-=2;
				} //end while
				System.out.println(num1 + " "+ num2);
			} //end if num2
		}//end if num1
		
		sc.close();
	}

}
