package prExamen31_10_25;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		//Iniciamos Scanner
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		
		//Constantes
		final float GASOLINA95 = 1.45f;
		final float GASOLINA98 = 1.65f;
		final float DIESEL = 1.40f;
		final float DIESELPLUS = 1.50f;
		
		
		//Variables
		float total=0, totalCompleto=0;
		int litros, litrosTotal=0;
		char opcion;
		byte tipoComb;
		
		do {
			
			System.out.print("Introduce los litros a repostar: ");
			litros = sc.nextInt();
			
			if(litros<1)
				System.out.println("Cantidad invalida. No se puede repostar un valor negativo o cero");
			else {				
				System.out.print("=== Tipos de combustible ==="+
						"\n1. Gasolina 95 (1.45€/L)"+
						"\n2. Gasolina 98 (1.65€/L)"+
						"\n3. Diesel (1.40€/L)"+
						"\n1. Diesel Plus (1.50€/L)"+
						"\nElige el tipo de combustible (1-4)");
				tipoComb = sc.nextByte();
				if(tipoComb>4 || tipoComb<1)
					System.out.println("Tipo de combustible no valido. Se cancela el repostaje");
				else {
					if(tipoComb==1)
						total = litros* GASOLINA95;
					else if (tipoComb==2)
						total = litros* GASOLINA98;
					else if(tipoComb==3)
						total = litros * DIESEL;
					else
						total = litros * DIESELPLUS;
					System.out.println("Importe a pagar: "+total+"€");
					litrosTotal+=litros;
					totalCompleto+=total;
				}
				
			}
			
			System.out.print("¿Deseas atender a otro vehiculo (s/n)? ");
			opcion = sc.next().charAt(0);
			
			Character.toUpperCase(opcion);
			
		}
		while(opcion!='n');
		
		System.out.println("Fin del servicio"
							+"\nTotal de litros vendidos: "+litrosTotal +"L"+
							"\nTotal recaudado: "+totalCompleto+"€");
		
		
		
		sc.close();
	}

}
