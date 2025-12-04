package ejer41_50;

/**
 * Simular el lanzamiento de una moneda al aire y que pare cuando salgan 3 caras consecutivas. Visualizar 
 * el número de tiradas realizadas. 
 */

public class Ejercicio50 {
	
	public static void main(String[] args) {
		
		int contM=0, cont=0;
		
		
		
		while(contM<3) {
			int num = (int) (Math.random()*2);
			if(num==0) {
				System.out.println("Ha salido cara");
				contM++;
			}
			else {
				System.out.println("Ha salido cruz");
				contM=0;
			}
			
			cont++;
		}
		
		
		System.out.println("Ha salido "+cont+" veces para salir 3 caras");
	}
	
}
