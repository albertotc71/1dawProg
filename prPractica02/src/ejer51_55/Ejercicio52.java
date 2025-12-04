package ejer51_55;

import java.util.Scanner;

/**
 * Simular el lanzamiento de dos monedas un número determinado de tiradas. Calcular cuántas caras y 
 * cuántas cruces han salido, e imprimir el número mayor de tiradas consecutivas con dos caras.
 */

public class Ejercicio52 {

	public static void main(String[] args) {
		
		int tiradas, contCaras=0, mon1, mon2, caras=0, cruces=0;
		
		try(Scanner sc = new Scanner(System.in)){
			
			System.out.print("Cuantas tiradas va a realizar: ");
			tiradas = sc.nextInt();
			
			
			for (int cont=1;cont<=tiradas;cont++) {
				mon1 = (int)(Math.random()*2+1);
				mon2 = (int)(Math.random()*2+1);
				
				System.out.println(mon1 +" "+mon2);
				
				if(mon1==1&&mon2==1)
					contCaras++;
				if(mon1==1)
					caras++;
				else
					cruces++;
				if(mon2==1)
					caras++;
				else
					cruces++;
				
					
			}
			System.out.println("Caras: "+caras+
								"\nCruces: "+cruces+
								"\nMaximo de caras consecutivas: "+contCaras);
			
		}
		
	}

}
