package ejer21_30;

import java.util.Scanner;

/**
 *  Hacer un algoritmo que nos sume, los números naturales que sean pares, y menores que un número
 *  introducido por teclado. 
 */

public class Ejercicio26 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num, suma=0;
		
		System.out.println("Dime un numero para sumar todos los numeros naturales pares: ");
		num=sc.nextInt();
		
		
		for(int cont=2;cont<num;cont=cont+2) {
			if(cont%2==0)
				suma=suma+cont;
			System.out.print(cont+" ");
		}
		
		System.out.println("La suma de esos numeros pares es: "+suma);
		
		
		
		//Segunda version
		/*suma=0;
		if(num%2!=0)
			num--;
		else
			num=num-2;
		for(int cont=num;cont>=2;cont-=2) {
			suma=suma+cont;
			System.out.print(cont+" ");
		}
		
		System.out.println("La suma de esos numeros pares es: "+suma);*/
		
		
		//Tercera version
		suma=0;
		
		for(int cont=(num%2)==0?num-2:num-1;cont>=2;cont-=2) {
			suma=suma+cont;
			System.out.print(cont+" ");
		}

		System.out.println("La suma de esos numeros pares es: "+suma);
		
		
		sc.close();
	}

}
