package prPractica01;

import java.util.Scanner;


/**
 *  Escribir un programa que calcule el salario semanal de un trabajador, dada la tarifa horaria por horas y
 *  el número de horas trabajadas. Además, hay que tener en cuenta que se le practica una retención del
 *  4% para la S.S. y del 7% para el IRPF. Es decir, solicitaremos por teclado, cuánto cobra por hora (tarifa
 *  horaria), así como las horas trabajadas, y mostraremos por pantalla el sueldo semanal del trabajador
 *  según los datos proporcionados.
 */

public class Ejercicio12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Constantes
		final float SEGSOC = 0.04F;
		final float IRPF = 0.07f;
		
		//Variables
		float salarioSem, numHoras, tarfiaHoras, impuestos, totalSalario;
		
		//Pedimos el precio por hora
		System.out.println("Introduce el precio por hora: ");
		tarfiaHoras= sc.nextFloat();
		
		//Pedimos la cantidad de horas
		System.out.println("Introduce la cantidad de horas trabajadas: ");
		numHoras = sc.nextFloat();
		
		//Calculamos el salario semanal con los impuestos
		salarioSem = tarfiaHoras * numHoras;
		impuestos = salarioSem * (SEGSOC+IRPF);
		totalSalario = salarioSem - impuestos;
		
		
		//Mostramos el salario semanal
		System.out.println("El salario semanal sin impuestos es: "+salarioSem);
		System.out.println("El salario semanal con impuestos es: "+totalSalario);
		
		
		sc.close();
	}

}
