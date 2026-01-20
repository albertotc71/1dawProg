package juego7Media18;

/**
 * Clase Baraja
 * La baraja la simularemos mediante un array de objetos de tipo Carta,
 * en un principio guardaremos las 40 cartas de forma ordenada, 
 * y despues las mezclaremos (desordenar el array o mezclar)
 */

public class Baraja {
	
	public static final int NUMCARTASBARAJA = 40;
	/**
	 * Variables de instancia
	 */
	private Carta [] miBaraja;  //Array con las 40 cartas
	private byte posProximaCarta;  //Indicara la posicion en el array de la siguiente carta a sacar
	
	
	/**
	 * Constructor
	 * @param miBaraja
	 * @param posProximaCarta
	 */
	public Baraja() {
		
		this.posProximaCarta = 0;
        this.miBaraja = new Carta[NUMCARTASBARAJA];
        int contador=0; 

        //Crear un array con los valores de la enumeracion
        EnumPalo [] arrayPalos = EnumPalo.values();


        for (int contPalos=0; contPalos<arrayPalos.length; contPalos++) {    
            for (byte contValor = 1; contValor<=10; contValor++) { //Valor

                this.miBaraja[contador] = new Carta(arrayPalos[contPalos], contValor);

                contador++;

            }

        }
		
        mezclar();
        
		
	}
	
	
	
	/**
	 * Getter's and setter's
	 */
	public Carta[] getMiBaraja() {return miBaraja;}
	public byte getPosProximaCarta() {return posProximaCarta;}

	public void setMiBaraja(Carta[] miBaraja) {this.miBaraja = miBaraja;}
	public void setPosProximaCarta(byte posProximaCarta) {this.posProximaCarta = posProximaCarta;}

	
	/**
	 * Metodo que se encarga de mezclar las cartas de la baraja
	 */
	public void mezclar() {
		
		Carta cartaAux;
		
		int aux1, aux2;  //Variables para generar 2 numeros aleatorios
		
		for(int cont=1;cont<=15;cont++) {
			
			aux1 = (int)(Math.random()*NUMCARTASBARAJA);  //Genero un valor entre 0 y 39
			aux2 = (int)(Math.random()*NUMCARTASBARAJA);  //Genero un valor entre 0 y 39
			
			cartaAux = this.miBaraja[aux1];
			this.miBaraja[aux1] = this.miBaraja[aux2];
			this.miBaraja[aux2] = cartaAux;
			
		}
		
	}
	
	
	/**
	 * Metodo que saca una carta de la baraja
	 */
	public Carta sacaCarta() {
		
		Carta cartaSacada = this.miBaraja[this.posProximaCarta];
		this.posProximaCarta++;
		
		return cartaSacada;
		
		
	}
	
	
	public Carta sacaCarta1() {
		
		return this.miBaraja[this.posProximaCarta++];
		
	}
	
	/**
	 * Metodo que comprueba si nos quedan cartas en la baraja por sacar
	 * @return
	 */
	public boolean quedanCartas() {
		return posProximaCarta < NUMCARTASBARAJA;
	}
	
	/**
	 * Redefinicion del metodo toString
	 */
	@Override
	public String toString() {
		String cad = "Quedan "+(NUMCARTASBARAJA-this.posProximaCarta)+" cartas";
		
		for(int i=posProximaCarta;i<miBaraja.length;i++) {
			cad += "\n"+this.miBaraja[i];
		}
		
		return cad;
		
	}
	
}
