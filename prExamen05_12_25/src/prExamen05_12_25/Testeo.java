package prExamen05_12_25;

public class Testeo {
	public static void main(String[] args) {
		
		//Prueba clase Utilidades
		
		System.out.println(Utilidades.formateaDuracion(300));
		
		System.out.println(Utilidades.calcularDescuento(1000, 15));
		
		System.out.println(Utilidades.convertirMoneda(500, 1.15));
		
		
		//----------------------------------------------------
		//Prueba clase Organizador
		//----------------------------------------------------
		
		Organizador o1 = new Organizador("B11122234", "Espectaculos del sur");
		Organizador o2 = new Organizador("A98765432", "Eventos Galadriel", true);
		
		System.out.println();
		System.out.println(o1.toString());
		System.out.println(o2.toString());

		
		//----------------------------------------------------
		//Prueba clase Lugar
		//----------------------------------------------------
		Lugar l1 = new Lugar("Teatro Cervantes de Malaga", 1134, 8000);
		Lugar l2 = new Lugar("Teatro Real de Madrid", 1746, 12000);
		Lugar l3 = new Lugar("Auditorio Edgar Neville Malaga", 391, 2500);
		
		System.out.println();
		
		System.out.println(l1.toString());
		System.out.println(l2.toString());
		System.out.println(l3.toString());
		
		System.out.println();
		
		//----------------------------------------------------
		//Prueba clase Espectaculo
		//----------------------------------------------------
		
		Espectaculo es1 = new Espectaculo("Rosalia", o1, l1, 120, true, false, "");
		Espectaculo es2 = new Espectaculo("Los Miserables", o1, l1, 140, false, false, "musical");
		
		
		System.out.println(es1.toString());
		System.out.println(es2.toString());
		
		
		//----------------------------------------------------
		//Prueba clase Entrada
		//----------------------------------------------------
		Entrada e1 = new Entrada(981,es1 , "Normal");
		Entrada e2 = new Entrada(128, es2, "VIP");
		
		System.out.println(e1.toString());
		System.out.println(e2.toString());
	}
}
