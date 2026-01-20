package juego7Media_Ejer16;

import java.util.Arrays;

public class Test2 {

	public static void main(String[] args) {
		
		Juego7Media ob = new Juego7Media();
		
		System.out.println(Arrays.deepToString(ob.getBaraja()));
		
		System.out.println(ob.toString());
		
		
		int []array = {1,2,3,4,5};
		
		for(int elemento:array) {
			System.out.println(elemento);
		}
		
	}

}
