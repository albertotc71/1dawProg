package juego7Media18;

public class Test {

	public static void main(String[] args) {
		
		//------------------------------
		//Prueba de la clase Carta
		//-------------------------------
		
		Carta c1 = new Carta(EnumPalo.OROS, (byte)10);
		
		System.out.println(c1.toString());
		System.out.println("Puntuacion: "+c1.getPuntos7Media());
		
		
		Carta c2 = new Carta(EnumPalo.COPAS, (byte)7);
		
		System.out.println(c2.toString());
		System.out.println("Puntuacion: "+c2.getPuntos7Media());
	
		
		Carta c3 = new Carta(EnumPalo.OROS, (byte)10);
		
		
		if(c1.equals(c3))
			System.out.println("Son iguales");
		else
			System.out.println("Son distintas");
		
		
		if(c1.equals(c2))
			System.out.println("Son iguales");
		else
			System.out.println("Son distintas");
		
		
		//------------------------------
		//Prueba de la clase Baraja
		//-------------------------------
		Baraja miBaraja = new Baraja();
		
		System.out.println(miBaraja.toString());
		
		System.out.println("Carta 1 sacada: "+miBaraja.sacaCarta().toString());
		System.out.println("Carta 2 sacada: "+miBaraja.sacaCarta());
		System.out.println("Carta 3 sacada: "+miBaraja.sacaCarta());
		
		
		//Recorrer el array de cartas con bucle foreach
		System.out.println("* * * * * * * * * * * * ");
		for(Carta elem : miBaraja.getMiBaraja()) {
			System.out.println(elem);
		}
		
	}

}
