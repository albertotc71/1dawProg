package prPruebas;

public class Ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float numerador, denominador, division;
		
		numerador=6.1f;
		denominador=3;
		
		
		
		if((numerador>0)&&(denominador>0)) {
			if(numerador>denominador) {
				division=numerador/denominador;
			System.out.println(division);}
			else
				System.out.println("Error, el numerador debe ser mayor que el denominador");
		}
		else
			System.out.println("Error, los numeros deben ser positivos");
	}

}
