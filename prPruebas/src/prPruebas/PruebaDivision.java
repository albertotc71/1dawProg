package prPruebas;

public class PruebaDivision {

	public static void main(String[] args) {
			
		int dividendo = 18;
		int divisor = 0;
		
		
		//System.out.println("Division: "+(divisor==0? "Error": (dividendo/divisor)));
		
		/*if(divisor==0)
			System.out.println("Error, no se puede dividir por 0");
		else
			System.out.println("Division: "+dividendo/divisor);*/
		
		
		//Control de excepciones
		try {  //El codigo que esta dentro del bloque try esta "vigilado"
			System.out.println("Buenas tardes");
			
			System.out.println("Division: "+dividendo/divisor);
			
			System.out.println("Fin del bloque try");
		}
		
		catch (ArithmeticException e){
			System.out.println("Error al dividir por 0");
		}
		finally {
			System.out.println("Este codigo siempre se va a ejecutar");
		}
		
		System.out.println("Fin del programa");
		
	}

}
