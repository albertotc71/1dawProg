package prPractica01;

import java.util.Scanner;

/**
 * Un agricultor que se dedica al cultivo ecológico de naranjas y limones, quiere calcular los beneficios
 * que obtiene anualmente por la venta de los mismos. Por este motivo vamos a diseñar una aplicación
 * que solicite las ventas (en kilos) de cada semestre para cada fruta. La aplicación mostrará el importe
 * total sabiendo que el precio del kilo de naranjas está fijado en 1.25€ y el kilo de limones en 1.90€
 */

public class Ejercicio07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Creamos las constantes con los precios de las naranjas y limones
		final float K_NARANJAS = 1.25f;
		final float K_LIMONES = 1.9f;
		
		float venta1SemestreNaranjas, venta1SemestreLimones, venta2SemestreNaranjas, venta2SemestreLimones;
		float total1Semestre, total2Semestre;
		
		System.out.println("Dime las ventas del primer semetre de naranjas: ");
		venta1SemestreNaranjas = sc.nextFloat(); 
		
		
		System.out.println("Dime las ventas del primer semetre de limones: ");
		venta1SemestreLimones = sc.nextFloat();
		
		
		System.out.println("Dime las ventas del segundo semetre de naranjas: ");
		venta2SemestreNaranjas = sc.nextFloat();
		
		
		System.out.println("Dime las ventas del segundo semetre de limones: ");
		venta2SemestreLimones = sc.nextFloat();
		
		
		total1Semestre=(K_NARANJAS*venta1SemestreNaranjas)+(K_LIMONES*venta1SemestreLimones);
		total2Semestre=(K_NARANJAS*venta2SemestreNaranjas)+(K_LIMONES*venta2SemestreLimones);
		
		
		System.out.println("El total del primer semestre es: "+total1Semestre);
		System.out.println("El total del segundo semestre es: "+total2Semestre);
		
		sc.close();
		
	}

}
