package prPractica08;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)){

			int []poli1 = cargaPoli(sc);
			int []poli2 = cargaPoli(sc);
			int []res;
			byte opcion;
			
			
			do {
				
				System.out.print("Polinomio 1: ");
				mostrarPoli(poli1);
				
				System.out.println();
				
				System.out.print("Polinomio 2: ");
				mostrarPoli(poli2);
				
				System.out.println();
				
				menu();
				System.out.print("Elija una opcion: ");
				opcion = sc.nextByte();
					switch (opcion) {
					case 1: {
						res = sumaPoli(poli1,poli2);
						mostrarPoli(res);
					}
					}
			
			}

			
			while(opcion!=4);
			
		}
		
		
	}
	
	
	
	



	public static void menu() {
		System.out.println("1. Suma de dos polinomios de grado N y M. \r\n"
				+ "2. Resta de dos polinomios de grado N y M. \r\n"
				+ "3. Multiplicación de dos polinomios de grado N y M.");
	}
	
	
	
	/**
	 * Metodo para inicializar los polinomios e introducir datos por teclado
	 * @param sc
	 * @return
	 */
	public static int [] cargaPoli(Scanner sc) {
		
		short grado;
		
		System.out.print("Indica grado del polinomio: ");
		grado = sc.nextShort();
		int []poli = new int[grado+1];
		
		System.out.println("Polinomio (Grado "+grado+")");
		for(int i=grado;i>=0;i--) {
			System.out.print("Introduzca el termino de grado "+i+": ");
			poli[i]=sc.nextInt();
		}
		
		return poli;
	}
	
	/**
	 * Metodo para mostrar el polinomio
	 * @param poli
	 */
	public static void mostrarPoli(int [] poli) {
		short grado = (short) (poli.length-1);
		for(int i=grado;i>=0;i--) {
			System.out.print(poli[i]+"x^"+i+"+");
		}
	}
	
	
	public static int[] sumaPoli(int[] poli1, int[] poli2) {
		
		int [] res = new int [Math.max(poli1.length-1, poli2.length-1)];
		
		for(int i = 0;i<poli1.length;i++) {
			for(int j=0;j<poli2.length;j++) {
				for(int r=0;i<res.length;r++) {
					res [r] = poli1[i] + poli2[j];					
				}
			}
		}
		
		return res;
	}
	
	
}
