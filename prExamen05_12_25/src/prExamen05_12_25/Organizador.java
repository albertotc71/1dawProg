package prExamen05_12_25;

public class Organizador {
	
	/**
	 * Variables de instancia
	 */
	private String cif;
	private String nombre;
	private boolean descuentosVIP;
	
	
	/**
	 * Constructores
	 * @param cif
	 * @param nombre
	 * @param descuentosVIP
	 */
	public Organizador(String cif, String nombre, boolean descuentosVIP) {
		this.cif = cif;
		this.nombre = nombre;
		this.descuentosVIP = descuentosVIP;
	}
	
	
	public Organizador(String cif, String nombre) {
		this(cif,nombre,false);
	}


	/**
	 * Metodos getter's and setter's
	 * @return
	 */
	public String getCif() {return cif;}
	public String getNombre() {return nombre;}
	public boolean isDescuentosVIP() {return descuentosVIP;}

	public void setCif(String cif) {this.cif = cif;}
	public void setNombre(String nombre) {this.nombre = nombre;}
	public void setDescuentosVIP(boolean descuentosVIP) {this.descuentosVIP = descuentosVIP;}
	
	
	
	/**
	 * Redefinicion del metodo toString
	 */
	@Override
	public String toString() {
		return cif + " - "+ nombre + (this.descuentosVIP?" (Si aplica descuentos VIP)":" (No aplica descuentos VIP)");
	}
	
	
	/**
	 * Redefinicion del metodo equals para comparar
	 */
	@Override
	public boolean equals(Object obj) {
		Organizador other = (Organizador)obj;
		return this.cif.equalsIgnoreCase(other.getCif());
	}
	
}
