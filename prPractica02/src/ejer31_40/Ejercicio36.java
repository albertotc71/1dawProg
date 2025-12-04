package ejer31_40;

import java.util.Scanner;

/**
 *  Realizar un programa que cuente los números positivos y negativos que aparezcan en una lista de
 *  números que se introducen por teclado. El proceso finalizará introduciendo el número 0. 
 */

public class Ejercicio36 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num, contPosi=0,contNeg=0;
		
		System.out.println("Introduce un numero para contar los numeros positivos y negativos: ");
		num=sc.nextInt();
		
		while(num!=0) {
			
			if(num>0)
				contPosi++;
			else
				contNeg++;
			System.out.println("Introduce otro numero: ");
			num = sc.nextInt();
		}
		
		System.out.println("Se han encontrado "+contPosi+" numeros positivos y "+contNeg+" numeros negativos");
		
		sc.close();
		
		
	}

}
