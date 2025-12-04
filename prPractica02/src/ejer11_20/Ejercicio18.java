package ejer11_20;

/**
 * Un programa posee tres bucles anidados, cuyas variables de control toman M, N y K valores
 * respectivamente. Determinar cuántas veces se ejecutan las instrucciones del cuerpo del bucle más
 * interno. 
 */

public class Ejercicio18 {

	public static void main(String[] args) {
		
		for(int cont1=1;cont1<=3;cont1++) { //Bucle 1 (3 vueltas)
			for(int cont2=1;cont2<=2;cont2++) { //Bucle 2 (2 vueltas)
				for(int cont3=1;cont3<=4;cont3++) { //Bucle 3 (4 vueltas)
					System.out.println("Hola");
				}
			}//end bucle 2
		}//end bucle 1
		
		//se ejecuta 24 veces
		
	}

}
