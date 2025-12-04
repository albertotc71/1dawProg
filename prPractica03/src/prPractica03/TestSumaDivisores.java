package prPractica03;

public class TestSumaDivisores {

	public static void main(String[] args) {
		
		System.out.println("Suma digitos de -1234 es "+sumaDigitos(-1234));
		
	}

	/**
	 * Metodo que suma los digitos de un numero
	 * @param num
	 * @return
	 */
	public static int sumaDigitos(int num) {
		int numero=1;
		if(num%numero==0)
			return num;
		else
			return sumaDigitos(num%(numero*10))+sumaDigitos(num%(numero*10));
		
	}
}
