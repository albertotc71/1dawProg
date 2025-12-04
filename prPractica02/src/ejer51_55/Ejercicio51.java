package ejer51_55;

/**
 * Generar aleatoriamente una quiniela de una columna, si la probabilidad de que salga 1 es del 50%, la x
 * es del 30% y la del 2 es del 20%. 
 */

public class Ejercicio51 {

	public static void main(String[] args) {
		
		int num;
		
		for(int cont=1;cont<=15;cont++) {
			System.out.print("Encuentro "+cont+": ");
			num = (int) (Math.random()*100);
			if(num<50)
				System.out.println("1");
			else if(num<80)
				System.out.println("X");
			else
				System.out.println("2");
		}
		
		
	}

}
