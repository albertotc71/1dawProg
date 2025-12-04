package prPruebas;

import java.util.Scanner;

/**
 * Calculo de la media aritmetica de varios valores recogidos de
 * teclado hasta que nos den el valor 0
 */

public class EjBuclesMedia {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Definir las variables
		int nota, sumaNotas=0, contNotas=0;
		float media=0;
		
		
		//-----------------------------------------------------
		//Planteamiento 1 con bucle while y lectura adelantada
		//-----------------------------------------------------
		
		//Lectura de la primera nota
		System.out.print("Nota: ");
		nota = sc.nextInt();
		
		
		//Plantear un bucle while hasta que nos den el valor 0
		while(nota!=0) {
			
			//Sumar el valor de la nota y contarlo
			sumaNotas = sumaNotas+nota;
			contNotas++;
			
			//Lectura de otra nota
			System.out.print("Nota: ");
			nota = sc.nextInt();
		}
		
		//Calculamos la nota media
		media = (float)sumaNotas/contNotas;
		System.out.println("La nota media es: "+media);

		
		
		//-----------------------------------------------------
		//Planteamiento 2 con bucle while con una unica lectura
		//-----------------------------------------------------
		
		

		nota=-1;
		sumaNotas=0;
		contNotas=0;
		//Plantear un bucle while hasta que nos den el valor 0
		while(nota!=0) {
			//Lectura de otra nota
			System.out.print("Nota: ");
			nota = sc.nextInt();

			//Sumar el valor de la nota y contarlo
			if(nota!=0) {
			sumaNotas = sumaNotas+nota;
			contNotas++;
			}

		}

		//Calculamos la nota media
		//contNotas--;
		media = (float)sumaNotas/contNotas;
		System.out.println("La nota media es: "+media);
		
		
		
		//-----------------------------------------------------
		//Planteamiento 3 con un bucle do...while
		//-----------------------------------------------------
		sumaNotas=0;
		contNotas=0;
		do {
			//Lectura de otra nota
			System.out.print("Nota: ");
			nota = sc.nextInt();
			
			//Sumar el valor de la nota y contarlo
			sumaNotas = sumaNotas+nota;
			contNotas++;
			
		}
		while(nota!=0);
		//Calculamos la nota media
		contNotas--;
		media = (float)sumaNotas/contNotas;
		System.out.println("La nota media es: "+media);
		
		
		
		//-----------------------------------------------------
		//Planteamiento 4 con bucle for
		//-----------------------------------------------------
		sumaNotas=0;
		contNotas=0;
		
		//Lectura de la primera nota
		System.out.print("Nota: ");
		nota = sc.nextInt();
		
		for(;nota!=0;contNotas++) {
			//Sumar el valor de la nota y contarlo
			sumaNotas = sumaNotas+nota;
			
			//Lectura de otra nota
			System.out.print("Nota: ");
			nota = sc.nextInt();
		}
		
		media = (float)sumaNotas/contNotas;
		System.out.println("La nota media es: "+media);
		
		sc.close();
	}

}
