package juego7Media_Ejer16;

import java.util.Arrays;
import java.util.Random;

/**
 * Clase Juego7Media, en esta clase la baraja la simulamos con una matriz 4x10, donde en 
 * cada fila tendremos las 10 (1,2,3,4,5,6,7, sota, caballo y rey) cartas de cada palo 
 * (oros, copas, bastos y espadas) 
 * 
 *  
 * Este plantemiento evidencia claramente, que necesitaríamos otra clase
 * que sería la clase Carta, ya que estamos mezclado los métodos que trabajan
 * con la baraja (sacaCarta, toString, ...) con métodos de una carta en concreto
 * (puntuacionCarta, toStringCarta, ...)
 * 
 * En futuras revisiones de este ejericio, se deberemos añadir la clase Carta
 * 
 * @author profesor
 */

public class Juego7Media {
	
	/**
	 * Variables de clase
	 */
	private static Random aleatorio;

	/**
	 * Variables de instancia
	 */
	private boolean [][] baraja;  // Matriz que representa la baraja
	private int cartasRestantes;  // Cartas que me quedan por sacar

	
	/**
	 * Inicializador estático
	 */
	static {
		aleatorio = new Random();
	}
	
	
	/**
	 * Constructor
	 */
	public Juego7Media() {
		
		this.cartasRestantes=40;
		this.baraja = new boolean[4][10];
		
		//Rellenar la matriz que simula la baraja con valores boolean
		for(int i=0;i<this.baraja.length;i++) {
			Arrays.fill(this.baraja[i], true);
		}
		
	}
	
	/**
	 * Métodos get y set
	 */
	public boolean[][] getBaraja() {return baraja;}

	public int getCartasRestantes() {return cartasRestantes;}

	public void setBaraja(boolean[][] baraja) {
		this.baraja = baraja;
	}

	public void setCartasRestantes(int cartasRestantes) {
		this.cartasRestantes = cartasRestantes;
	}
	
	public static Random getAleatorio() {return aleatorio;}
	
	
	/**
	 * M�todo que comprueba si me quedan cartas en la baraja
	 * @return
	 */
	public boolean quedanCartas() {
		
		return this.cartasRestantes>0;
		
	}
	
	/**
	 * Método que permite sacar una carta de la baraja
	 * @return --> un array con 2 elementos con la fila y la columna
	 *         --> un null si no hay cartas
	 */
	public int[] sacaCarta() {
		
		//Comprobar si hay cartas
		if(!this.quedanCartas())
			return null;
		
		//Definir un array de 2 elementos para guardar las coordenadas de la carta
		int [] cartaSacada = new int[2];
		
		do {
			cartaSacada[0] = aleatorio.nextInt(4);  //Generar fila entre  0..3
			cartaSacada[1] = aleatorio.nextInt(10);  //Generar columna entre 0..9			
		}
		
		while(!this.baraja[cartaSacada[0]][cartaSacada[1]]);
		
		this.baraja[cartaSacada[0]][cartaSacada[1]]=false;
		
		this.cartasRestantes--;
		
		return cartaSacada;
		
		
	}
	
	
	/**
	 * M�todo que devuelve la puntuaci�n de una carta en el juego de la 7 y media
	 * @return --> 1..7 si la carta tiene un valor de 1 a 7
	 *         --> 0,5  si es sota, caballo o rey
	 */
	public float getPuntuacionCarta(int col) {
		
		if(col<7)
			return col+1;
		else
			return 0.5f;
		
	}
	
	/**
	 * Método que devuelve una representació tipo String de una carta
	 * @param palo --> Valor de 0 a 3
	 * @param valor --> Valor de 0 a 9
	 * @return --> Por ejemplo: 3 de oros, Sota de copas, Rey de bastos, ...
	 */
	public String toStrigCarta1(int palo, int valor) {
		
		String cad="";
		
		switch(valor) {
			case 0 : 
			case 1 : 
			case 2 : 
			case 3 : 
			case 4 : 
			case 5 : 
			case 6 : cad= (valor+1) +" de "; break;
			case 7 : cad= "Sota de "; break;
			case 8 : cad= "Caballo de "; break;
			case 9 : cad= "Rey de "; break;
		}
		
		
		switch(palo) {
		case 0 : cad+="oros"; break;
		case 1 : cad+="copas"; break;
		case 2 : cad+="bastos"; break;
		case 3 : cad+="espadas"; break;
		}
		
		return cad;
	}
	
	public String toStringCarta(int palo, int valor) {
		
		String cad="";
		
		cad = switch(valor) {
			case 0,1,2,3,4,5,6 -> {yield (valor+1) +" de ";} 
			case 7 -> {yield "Sota de ";}
			case 8 -> {yield "Caballo de "; }
			case 9 -> {yield "Rey de "; }
			default -> {yield "";}
		}
		
		+
		
		switch(palo) {
		case 0 -> {yield "oros";}
		case 1 ->  {yield "copas";}
		case 2 -> {yield "bastos";}
		case 3 -> {yield "espadas"; }
		default -> {yield "";}
		};
		
		return cad;
		
	}
	
	
	/**
	 * Redefinición de toString, muestra las cartas restantes
	 */
	@Override
	public String toString() {
		
		String cad = "\nEn la baraja quedan "+this.cartasRestantes+ " cartas"; 
		
		
		for(int fil=0;fil<this.baraja.length;fil++) {
			for(int col=0;col<this.baraja[fil].length;col++) {
				if(baraja[fil][col])
					cad += "\n\t"+this.toStringCarta(fil, col);
			}
		}
	
		return cad;
		
	}
	
}








