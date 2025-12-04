package ejerEdificio;

/**
 * Una guarderia contendrá la misma información que un colegio, pero también necesitaremos conocer 
 * la superficie dedicada al área de juegos.
 * @author Alberto Torres
 * @version 1.0
 */

public class Guarderia  extends Colegio{
	
	

	/**
	 * Variables de instancia
	 */
	private float areaJuegos;
	
	public Guarderia(Direccion dirEdificio, int numHabitaciones, int numPlantas, float areaEdificio, 
			int numClases, int numOfi, float areaJuegos) {
		
		super(dirEdificio, numHabitaciones, numPlantas, areaEdificio, numClases, numOfi);
		this.areaJuegos = areaJuegos;
	}

	/**
	 * Getter's and setter's 
	 * @return
	 */
	public float getAreaJuegos() {return areaJuegos;}

	public void setAreaJuegos(float areaJuegos) {this.areaJuegos = areaJuegos;}
	
	/**
	 * Redefinicion de calculaIBI
	 */
	@Override
	public float calculaIBI() {
		return 0;
	}
	
	
	/**
	 * Redefinicion del metodo toString de la clase Colegio
	 */
	@Override
	public String toString() {
		return super.toString()+
				"\n\tArea de juegos: "+areaJuegos;
	}
	
}
