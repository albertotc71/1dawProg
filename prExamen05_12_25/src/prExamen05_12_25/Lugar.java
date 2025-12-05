package prExamen05_12_25;

public class Lugar {
	
	/**
	 * Variables de instancia
	 */
	private String nombre;
	private int aforo;
	private float precioAlquiler;
	
	
	/**
	 * Constructor
	 * @param nombre
	 * @param aforo
	 * @param precioAlquiler
	 */
	public Lugar(String nombre, int aforo, float precioAlquiler) {
		this.nombre = nombre;
		this.aforo = aforo;
		this.precioAlquiler = precioAlquiler;
	}


	/**
	 * Metodos getter's and setter's
	 * @return
	 */
	public String getNombre() {return nombre;}
	public int getAforo() {return aforo;}
	public float getPrecioAlquiler() {return precioAlquiler;}

	public void setNombre(String nombre) {this.nombre = nombre;}
	public void setAforo(int aforo) {this.aforo = aforo;}
	public void setPrecioAlquiler(float precioAlquiler) {this.precioAlquiler = precioAlquiler;}
	
	
	/**
	 * Redefinicion del metodo toString
	 */
	@Override
	public String toString() {
		return nombre + ", "+aforo+" localidades, coste alquiler: "+precioAlquiler+"€";
	}
	
	
	/**
	 * Redefinicion del metodo equals para comparar
	 */
	@Override
	public boolean equals(Object obj) {
		Lugar other = (Lugar) obj;
		return this.nombre.equalsIgnoreCase(other.getNombre())&&
				this.aforo==other.getAforo();
	}
	
}
