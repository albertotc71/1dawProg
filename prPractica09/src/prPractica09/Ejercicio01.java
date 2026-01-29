package prPractica09;

import java.util.Random;

public class Ejercicio01 {

	public static void main(String[] args) {
		
		Random r = new Random();
		
		int num = r.nextInt(20);
		long tiempoInicial = System.nanoTime();
		System.out.println(tiempoInicial);
		System.out.println(num);
		
		
		System.out.println(r.getClass().getSimpleName());
		System.out.println(r.getClass().getPackageName());
		
		if(r instanceof Random)
			System.out.println("El objeto pertenence a la clase Random");
		
		long tiempoFinal = System.nanoTime();
		
		System.out.println(tiempoFinal-tiempoInicial);
	}

}
