package prPruebas;

import java.util.Scanner;

/**
 * Decir en letra el dia de la semana a partir de su numero
 */

public class EjemploSwitch {

	public static void main(String[] args) {
		
		byte diaSemana;
		try(Scanner sc = new Scanner(System.in)) {
			System.out.println("Dia de la semana: ");
			diaSemana = sc.nextByte();
		}
		
		//Solucion 1 con if simples
		if(diaSemana==1)
			System.out.println("Lunes");
		if(diaSemana==2)
			System.out.println("Martes");
		if(diaSemana==3)
			System.out.println("Miercoles");
		if(diaSemana==4)
			System.out.println("Jueves");
		if(diaSemana==5)
			System.out.println("Viernes");
		if(diaSemana==6)
			System.out.println("Sabado");
		if(diaSemana==7)
			System.out.println("Domingo");
		
		
		//Solucion 2 con if anidados (mas eficiente el planteamiento)
		if(diaSemana>=1 && diaSemana<=7) {
			if(diaSemana==1)
				System.out.println("Lunes");
			else 
				if(diaSemana==2)
					System.out.println("Martes");
				else 
					if(diaSemana==3)
						System.out.println("Miercoles");
					else 
						if(diaSemana==4)
							System.out.println("Jueves");
						else 
							if(diaSemana==5)
								System.out.println("Viernes");
							else 
								if(diaSemana==6)
									System.out.println("Sabado");
								else 
									if(diaSemana==7)
										System.out.println("Domingo");
		}
		else
			System.out.println("Dia erroneo");
		
		
		//Solucion 3 con switch "clasico"
		 switch(diaSemana) {
		 case 1: System.out.println("Lunes"); break;
		 case 2: System.out.println("Martes"); break;
		 case 3: System.out.println("Miercoles"); break;
		 case 4: System.out.println("Jueves"); break;
		 case 5: System.out.println("Viernes"); 
		 		 System.out.println("Por fin");
			 	 break;
		 case 6: System.out.println("Sabado"); 
		 		 System.out.println("Fiesta");
		 		 break;
		 case 7: System.out.println("Domingo"); break;
		 default: System.out.println("Dia erroneo");
		 }
		
		 
		 //Solucion 4 con switch "mejorado" (ultimas versiones)
		 switch(diaSemana) {
			 case 1-> System.out.println("Lunes"); 
			 case 2-> System.out.println("Martes"); 
			 case 3-> System.out.println("Miercoles"); 
			 case 4-> System.out.println("Jueves"); 
			 case 5->{ 
				 	  System.out.println("Viernes"); 
			 		  System.out.println("Por fin");
			 		  }
			 case 6->{
				 	  System.out.println("Sabado"); 
			 		  System.out.println("Fiesta");
			 		  }
			 		 
			 case 7-> System.out.println("Domingo"); 
			 default-> System.out.println("Dia erroneo");
		 }
		 
		 
		 //Programa que si el dia de la semana es de lunes a viernes nos diga "Dia laborable"
		 //y si es sabado o domingo, me dira "Fin de semana"
		 
		 switch(diaSemana) {
			 case 1 : 
			 case 2 : 
			 case 3 :
			 case 4 : 
			 case 5 : System.out.println("Dia laborable"); break;
			 case 6 :
			 case 7 : System.out.println("Fin de semana"); break; 
			 
			 default: System.out.println("Dia erroneo");
			 
		 }
		 
		 
		 switch(diaSemana) {
			 case 1,2,3,4,5 -> System.out.println("Dia laborable"); 
			 case 6,7-> System.out.println("Fin de semana");  
			 
			 default -> System.out.println("Dia erroneo");
		 
		 }
		
	}

}
