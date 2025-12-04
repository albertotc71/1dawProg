package prPruebas;

public class EjemploFor {

	public static void main(String[] args) {
		
		//Mostrar 5 saludos en consola
		for(int cont=1;cont<=5;cont++) {
			System.out.println("Hola que tal");
		}
		
		
		//Mostrar los 10 primeros numeros naturales
		System.out.print("Los diez primeros numeros son: ");
		for(int cont=1;cont<=10;cont++) {
			System.out.print(cont + " ");
		}
		
		
		//Mostrar los 20 primeros numeros pares
		System.out.print("\nMostrar los numeros pares que existen entre 1 y 20: ");
		for(int cont=1;cont<=20;cont++) {
			if(cont%2==0)
				System.out.print(cont+" ");
		}
		
		
		System.out.print("\nMostrar los numeros pares que existen entre 1 y 20: ");
		for(int cont=2;cont<=20;cont=cont+2) { //cont+=2
			System.out.print(cont+" ");
		}
		
		
		//Mostrar los 20 primeros numeros pares
		System.out.println("\nLos 20 primeros numeros pares son: ");
		for(int cont=2;cont<=40;cont+=2) {
			System.out.print(cont+" ");
		}
		
		System.out.println("\nLos 20 primeros numeros pares son: ");
		for(int cont=1;cont<=20;cont++) {
			System.out.print((cont*2) +" ");
		}
		
		
		System.out.println("\nLos 20 primeros numeros pares son: ");
		for(int cont=2, contPares=0;contPares<20;cont+=2,contPares++) {
			System.out.print(cont +" ");
		}
		
		//Mostrar los numeros hacia atras del 50 al 40 (ambos inclusives) en orden descendente
		System.out.println("\nMostrar los numeros del 50 al 40 en orden descendente");
		for (int cont=50;cont>=40;cont--) {
			System.out.print(cont + " ");
		}
		
	}

}
