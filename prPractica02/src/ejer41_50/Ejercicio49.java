package ejer41_50;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Hacer un algoritmo que simule el funcionamiento de un reloj digital y que nos permita ponerlo en hora,
 * es decir, al comenzar a ejecutar el programa nos preguntará si deseamos ponerlo en hora, si
 * respondemos sí, nos pedirá la hora, minutos y segundos de partida, si respondemos no, comenzaremos
 * en la 00:00:00. Este algoritmo nunca finalizará. 
 */

public class Ejercicio49 {

	public static void main(String[] args) throws InterruptedException {
		
		byte hora=0, min=0, seg=0;
		char opcion;
		
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Desea poner el reloj en hora (S/N): ");
			opcion = sc.next().charAt(0);
			opcion = Character.toUpperCase(opcion);
			
			if(opcion=='S') {
				System.out.println("Hora: ");
				hora = sc.nextByte();
				
				System.out.println("Minutos: ");
				min = sc.nextByte();
				
				System.out.println("Segundos: ");
				seg = sc.nextByte();
			}
		}
		
		DecimalFormat patron = new DecimalFormat("00");

		while(true) {
			for(int h=hora; h<=23; h++) {
				for(int m=min; m<=59; m++) {
					for(int s=seg; s<=59; s++) {
						System.out.println(patron.format(h)+":"+patron.format(m)+":"+patron.format(s));
						//Detener el programa un tiempo
							Thread.sleep(1000);
						
					}//end for  seg
					seg=0;
				}//end for min
				min=0;
			}//end for horas
			hora=0;

		}//end while
		
	}

}
