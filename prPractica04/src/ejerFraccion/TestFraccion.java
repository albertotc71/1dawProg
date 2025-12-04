package ejerFraccion;

public class TestFraccion {

	public static void main(String[] args) {

		try {
			Fraccion fra1 = new Fraccion(6, -5);
			System.out.println(fra1.toString());
		} 
		catch (Exception e) {

			System.out.println(e.getMessage());
		}

	}

}
