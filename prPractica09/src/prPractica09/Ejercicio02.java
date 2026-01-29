package prPractica09;

public class Ejercicio02 {

	public static void main(String[] args) {
		
		int num = (int)((Math.random()*25)+1); //Genera numeros aleatorios entre 1 y 24
		
		System.out.println(num);
		
		
		//Calcular la raiz cubica
		System.out.println("Raiz cubica de 13: "+Math.cbrt(13));
		System.out.println("Raiz cubica de 13: "+Math.cbrt(125));
		
		
		//Metodo IEEERemainder
		System.out.println(Math.IEEEremainder(5, 30));
		
		
		//Metodo signum
		System.out.println(Math.signum(20));
		
		//Teorema de pitagoras
		System.out.println("Teorema de pitagoras: "+Math.hypot(3, 8));
		
		
	}

}
