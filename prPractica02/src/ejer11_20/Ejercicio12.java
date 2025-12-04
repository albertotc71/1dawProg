package ejer11_20;

import java.util.Scanner;

/**
 * Diseñar un algoritmo para simular una calculadora simple. Para ello deberá tener las siguientes
 * características:
 * ✓ Sólo efectuará operaciones con dos operandos.
 * ✓ Operaciones permitidas: (+, -, *, /).
 * ✓ Se trabajará con operandos enteros.
 * ✓ Pedirá en primer lugar el operador, y a continuación los dos operandos. Si el operador no se
 * corresponde con alguno de los indicados se emitirá un mensaje de error:
 */

public class Ejercicio12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1, num2;
		char operador;
		
		System.out.println("Introduce el operador para realizar una operacion: ");
		operador = sc.next().charAt(0);
		if(operador=='+'||operador=='-'||operador=='*'||operador=='/') {
			System.out.println("Introduce el primer numero: ");
			num1 = sc.nextInt();
			
			System.out.println("Introduce el segundo numero: ");
			num2 = sc.nextInt();
			
			if(operador=='+')
				System.out.println("Suma: "+(num1+num2));
			else if (operador=='-')
				System.out.println("Resta: "+(num1-num2));
			else if (operador=='*')
				System.out.println("Multiplicacion: "+(num1*num2));
			else {
				if(num2!=0)
					System.out.println("Division: "+((float)num1/num2));
				else
					System.out.println("Error, no se puede dividr por 0");
			}
		}
		
		else
			System.out.println("Error, operador no permitido");
		
		sc.close();
		
	}

}
