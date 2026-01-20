package prPractica08;

import java.util.Scanner;

/**
 * Desarrolla un programa que lea las notas de un determinado examen, y las almacene en un array,
 * mostrando a continuación, la nota media, la nota más alta y la nota más baja. El programa lo primero
 * que solicitará será el número de alumnos que han realizado el examen, y en función de ese valor se
 * definirá el array. 
 */

public class Ejercicio6 {

	public static void main(String[] args) {
		
		int numAlumnos;
		int arrayAlumnos []; 
		int notaAlta, notaBaja;
		float notaMedia;
		
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Introduce la cantidad de alumnos que se han presentado al examen: ");
		numAlumnos = sc.nextInt();
		
		arrayAlumnos = new int[numAlumnos];
		
		//Recorremos el array para rellenarlo con las notas
		for(int i=0;i<arrayAlumnos.length;i++) {
			
			arrayAlumnos[i]=(int)((Math.random()*10)+1);
			System.out.print(arrayAlumnos[i]+" ");
		}
		
		notaAlta=arrayAlumnos[0];
		notaBaja=arrayAlumnos[0];
		notaMedia=arrayAlumnos[0];
		
		for(int i=1;i<arrayAlumnos.length;i++) {
			if(arrayAlumnos[i]>notaAlta)
				notaAlta=arrayAlumnos[i];
			else if(arrayAlumnos[i]<notaBaja)
				notaBaja=arrayAlumnos[i];
			
			notaMedia = notaMedia + arrayAlumnos[i];
		}
		System.out.println();
		
		System.out.println("La nota mas alta es: "+notaAlta);
		System.out.println("La nota mas baja es: "+notaBaja);
		System.out.println("La nota media es: "+notaMedia/numAlumnos);
		
		sc.close();
	}

}
