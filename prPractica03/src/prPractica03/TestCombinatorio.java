package prPractica03;

import java.util.Scanner;

public class TestCombinatorio {

	public static void main(String[] args) {
		
		//Variables locales
		int num1, num2;
		double combinatorio;
		
		try(Scanner sc = new Scanner(System.in)){
			System.out.print("Introduzca valor para 'a': ");
			num1 = sc.nextInt();
			
			System.out.print("Introduzca valor para 'b': ");
			num2 = sc.nextInt();
			
		}
		combinatorio = LibreriaMatematica.combinatorio(num1, num2);
		if(combinatorio == -1)
			System.out.println("Valores no validos");
		else
			System.out.println("Combinatorio (" + num1 + ", "+ num2 +") = "+ combinatorio);

		
		
		
	}

}
