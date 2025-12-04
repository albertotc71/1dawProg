package prPractica01;

import java.util.Locale;
import java.util.Scanner;

/**
 * Una empresa que gestiona un parque acuático nos solicita una aplicación que les ayude a calcular el
 * importe que hay que cobrar en la taquilla por la compra de una serie de entradas (cuyo número será
 * introducido por el usuario). Existen dos tipos de entradas: infantiles, que cuestan 15.50€, y de adultos
 * que cuestan 20€.
 * En el caso de que el importe total sea igual o superior a 100€, se aplicará automáticamente un bono
 * descuento del 5%. 
 */

public class Ejercicio21 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.UK);
		
		//Constantes
		final float ENTRAINFA = 15.50f;
		final float ENTRAADUL = 20f;
		final float DESCUENTO = 0.05f;
		
		
		//Variables
		float importe, cantidadEntrInfa, cantidadEntrAdul, totalInfa, totalAdul, importeDesc;
		
		//Pedimos la cantidad de entradas tanto de infantiles como adultos
		System.out.println("Introduce la cantidad de entradas infantiles: ");
		cantidadEntrInfa = sc.nextFloat();
		
		
		System.out.println("Introduce la cantidad de entradas adultos: ");
		cantidadEntrAdul = sc.nextFloat();
		
		
		//Calculamos el importe
		totalInfa = cantidadEntrInfa*ENTRAINFA;
		totalAdul = cantidadEntrAdul*ENTRAADUL;
		importeDesc=(totalInfa+totalAdul)*DESCUENTO;
		importe = (totalInfa+totalAdul>=100?importeDesc=(totalInfa+totalAdul)*DESCUENTO:totalAdul+totalInfa);
		
		//Mostramos el importe
		System.out.println("El importe total de las entradas es: "+importe);
		
		sc.close();
		
	}

}
