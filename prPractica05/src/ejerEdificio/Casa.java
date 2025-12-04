package ejerEdificio;

public class Casa extends Edificio{
	
	
	/**
	 * Variables de instacia
	 */
	private int numDorm;
	private int numBanios;
	
	/**
	 * Constructor
	 * @param dirEdificio
	 * @param numHabitaciones
	 * @param numPlantas
	 * @param areaEdificio
	 * @param numDorm
	 * @param numBanios
	 */
	public Casa(Direccion dirEdificio, int numHabitaciones, 
				int numPlantas, float areaEdificio, int numDorm, int numBanios) {
		super(dirEdificio, numHabitaciones, numPlantas, areaEdificio);
		this.numDorm = numDorm;
		this.numBanios = numBanios;
	}

	
	
	/*public Casa(String nomCalle, int numero, int codPostal, 
			int numHabitaciones, int numPlantas, float areaEdificio,
			int numDorm, int numBanios) {
		super(nomCalle, numero, codPostal, numHabitaciones, numPlantas, areaEdificio);
		this.numDorm = numDorm;
		this.numBanios = numBanios;
	}*/

	public Casa(String nomCalle, int numero, int codPostal, 
			int numHabitaciones, int numPlantas, float areaEdificio,
			int numDorm, int numBanios) {
		this(new Direccion(nomCalle, numero, codPostal), numHabitaciones, numPlantas, areaEdificio,
				numDorm, numBanios);
	}
	
	
	/**
	 * Getter's and setter's
	 * @return
	 */
	public int getNumDorm() {return numDorm;}
	public int getNumBanios() {return numBanios;}

	public void setNumDorm(int numDorm) {this.numDorm = numDorm;}
	public void setNumBanios(int numBanios) {this.numBanios = numBanios;}
	
	/**
	 * Redefinicion del metodo de calcular el IBI
	 */
	@Override
	public float calculaIBI() {
		return super.calculaIBI()+this.numBanios*10;
	}
	
	
	
	/**
	 * Redefinicion del metodo toString de la clase Edificio
	 */
	@Override
	public String toString() {
		return super.toString()+
				"\n\tNumero de dormitorios: "+numDorm+
				"\n\tNumero de baños: "+numBanios;
	}
	
}
