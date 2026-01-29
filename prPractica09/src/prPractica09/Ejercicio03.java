package prPractica09;

public class Ejercicio03 {

	public static void main(String[] args) {
		
		float num = Float.parseFloat("67.235");
		
		System.out.println(num);

		Float num2 = 34.567f;  //Autoboxing
		
		System.out.println(num2);
		
		Double num3 = Double.valueOf("67.235");
		System.out.println(num3);
		
		
		try {
			System.out.println("Error: "+Double.parseDouble("hola"));
		}
		catch(NumberFormatException e) {
			System.out.println("Error de conversion");
		}
		
		
		
		
	}

}
