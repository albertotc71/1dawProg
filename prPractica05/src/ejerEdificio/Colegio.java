package ejerEdificio;

/**
 * contendrá la misma información que un edificio normal, además del número de clases y el 
 * número de oficinas.  
 * @author Alberto Torres
 * @version 1.0
 */

public class Colegio extends Edificio{
	
	/**
	 * Variables de instancia
	 */
	private int numClases;
	private int numOfi;
	
	/**
	 * Constructores
	 * @param dirEdificio
	 * @param numHabitaciones
	 * @param numPlantas
	 * @param areaEdificio
	 * @param numClases
	 * @param numOfi
	 */
	public Colegio(Direccion dirEdificio, int numHabitaciones, int numPlantas, float areaEdificio, int numClases, int numOfi) {
		super(dirEdificio, numHabitaciones, numPlantas, areaEdificio);
		
		this.numClases = numClases;
		this.numOfi = numOfi;
		
	}
	
	
	
	public Colegio(String nomCalle, int numero, int codPostal, 
			int numHabitaciones, int numPlantas, float areaEdificio,
			int numClases, int numOfi) {
		this(new Direccion(nomCalle, numero, codPostal), numHabitaciones, numPlantas, areaEdificio,
				numClases, numOfi);
	}


	/**
	 * Getter's and setter's
	 * @return
	 */
	public int getNumClases() {return numClases;}
	public int getNumOfi() {return numOfi;}

	public void setNumClases(int numClases) {this.numClases = numClases;}
	public void setNumOfi(int numOfi) {this.numOfi = numOfi;}
	
	
	
	/**
	 * Redefinicion del metodo calculaIBI
	 */
	@Override
	public float calculaIBI() {
		float ibi = super.calculaIBI() - 500; 
		
		return ibi>0?ibi:0;
	}
	
	
	
	/**
	 * Redefinicion del metodo toString de la clase Edificio
	 */
	@Override
	public String toString() {
		return super.toString()+
				"\n\tNumero de clases: "+numClases+
				"\n\tNumero de oficinas: "+numOfi;
	}
	
	
	/**
	 * Metodo "propio" de la clase Colegio
	 */
	public void saludaColegio() {
		System.out.println("Saludos desde la clase Colegio");
	}
}
