package prPruebas;

import java.util.Random;

public class EjAleatorios1 {

	public static void main(String[] args) {
		
		//--------------------------------------------------------
		//Generacion de numeros aleatorios con la clase Random
		//--------------------------------------------------------
		
		Random obAleatorio = new Random();
		
		
		//Generar un numero aleatorio entre 0 y 40
		System.out.println("Numero entre 0 y 40: "+obAleatorio.nextInt(41));
		//Generar un numero aleatorio entre 1 y 40
		System.out.println("Numero entre 1 y 40: "+(obAleatorio.nextInt(40)+1));
		
		
		//Generar las caras de un dado
		int dado = obAleatorio.nextInt(6)+1;
		System.out.println("Dado: "+dado);
		
		if(dado==1)
			System.out.println("Ha salido el 1");
		else
			System.out.println("No ha salido el 1");
		
		//Generar numeros aleatorios con decimales
		System.out.println("Aleatorio entre 1..30 con decimales: "+ (obAleatorio.nextDouble(30)+1));
		
		
		//--------------------------------------------------------
		//Generacion de numeros aleatorios con la clase Math
		//--------------------------------------------------------
		//Generar un numero aleatorio entre 0 y 40
		System.out.println("Numero entre 0 y 40: "+(int)(Math.random()*41));
		//Generar un numero aleatorio entre 1 y 40
		System.out.println("Numero entre 1 y 40: "+(int)(Math.random()*40+1));


		//Generar las caras de un dado
		int dado2 = (int) (Math.random()*6+1);
		System.out.println("Dado: "+dado2);

		if(dado2==1)
			System.out.println("Ha salido el 1");
		else
			System.out.println("No ha salido el 1");
		
		
		//Generar numeros aleatorios con decimales
		System.out.println("Aleatorio entre 1..30 con decimales: "+ ((Math.random()*30)+1));
		
		
	}

}
