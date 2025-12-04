package ejerEdificio;

/**
 * Un Edificio almacena información sobre su direccion, el número de habitaciones, el número de plantas 
 * y el área total de un determinado edificio. 
 * 
 *  @author Alberto Torres
 *  @version 1.0
 */

public class Edificio {
	
	/**
	 * Variables de instancia
	 */
	private Direccion dirEdificio;  //Composicion
	private int numHabitaciones;    
	private int numPlantas;         
	private float areaEdificio;
	
	
	
	
	/**
	 * Constructor que recibe como parametro todos los datos de un edificio
	 * @param dirEdificio
	 * @param numHabitaciones
	 * @param numPlantas
	 * @param areaEdificio
	 */
	public Edificio(Direccion dirEdificio, int numHabitaciones, int numPlantas, float areaEdificio) {
		this.dirEdificio = dirEdificio;
		this.numHabitaciones = numHabitaciones;
		this.numPlantas = numPlantas;
		this.areaEdificio = areaEdificio;
	}

	/**
	 * Constructor que recibe todos los datos de un edificio, pero en el caso de la direccion, nos
	 * llegan los datos del objeto, el cual creamos en el propio constructor
	 * @param nomCalle
	 * @param numero
	 * @param codPostal
	 * @param numHabitaciones
	 * @param numPlantas
	 * @param areaEdificio
	 */
	
	public Edificio(String nomCalle, int numero, int codPostal, 
			int numHabitaciones, int numPlantas, float areaEdificio) {
		this(new Direccion(nomCalle, numero, codPostal), numHabitaciones, numPlantas, areaEdificio);
	}


	/**
	 * Getter's and setter's
	 * @return
	 */
	public Direccion getDirEdificio() {return dirEdificio;}
	public int getNumHabitaciones() {return numHabitaciones;}
	public int getNumPlantas() {return numPlantas;}
	public float getAreaEdificio() {return areaEdificio;}

	public void setDirEdificio(Direccion dirEdificio) {this.dirEdificio = dirEdificio;}
	public void setNumHabitaciones(int numHabitaciones) {this.numHabitaciones = numHabitaciones;}
	public void setNumPlantas(int numPlantas) {this.numPlantas = numPlantas;}
	public void setAreaEdificio(float areaEdificio) {this.areaEdificio = areaEdificio;}
	
	
	
	/**
	 * Metodo que calcula el IBI de un Edificio, el cual  se calcula sumando el 
	 * área del edificio multiplicado por 1.2 y el número de plantas multiplicado por 100
	 * @return
	 */
	public float calculaIBI() {
		return (this.areaEdificio*1.2f)+(this.numPlantas*100);
	}
	
	
	
	/**
	 * Redeficion del metodo toString (redefinimos toString de la clase Object)
	 */
	@Override
	public String toString() {
		return this.getClass().getSimpleName()+ //Obtener el nombre de la clase
				"\n\tDireccion: "+this.dirEdificio+
				"\n\tImpuesto de IBI "+calculaIBI()+"€"+
				"\n\tNumero de habitaciones: "+this.numHabitaciones+
				"\n\tNumero de plantas: "+this.numPlantas+
				"\n\tArea del edificio: "+this.areaEdificio;
	}
	
	
}
