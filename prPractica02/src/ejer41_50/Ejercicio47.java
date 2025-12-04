package ejer41_50;

public class Ejercicio47 {

	public static void main(String[] args) {
		
		int cont6=0,numRandom;
		
		for (int cont=0;cont<=100;cont++) {
			numRandom=(int)(Math.random()*6+1);
			System.out.print(numRandom+" ");
			if(numRandom==6)
				cont6++;
		}
		System.out.println("\nSe han encontrado el numero seis "+cont6+" veces");
		
	}

}
