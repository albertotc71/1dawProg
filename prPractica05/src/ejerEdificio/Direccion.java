package ejerEdificio;

/**
 * Guarda informacion sobre una direccion de la que conocemos el nombre de la calle, el número y el código postal
 * 
 * @author Alberto Torres
 * @version 1.0
 */
public class Direccion {
	
	/**
	 * Variables de instancia
	 */
	private String nomCalle;  //Nombre de la calle
	private int numero;      //Numero del edificio
	private int codPostal;    //Codigo postal
	
	
	
	
	/**
	 * Constructor
	 */
	public Direccion(String nomCalle, int numero, int codPostal) {
		this.nomCalle = nomCalle;
		this.numero = numero;
		this.codPostal = codPostal;
	}


	/**
	 * Getter's and setter's
	 * @return
	 */
	public String getNomCalle() {return nomCalle;}
	public int getNumero() {return numero;}
	public int getCodPostal() {return codPostal;}

	public void setNomCalle(String nomCalle) {this.nomCalle = nomCalle;}
	public void setNumero(int numero) {this.numero = numero;}
	public void setCodPostal(int codPostal) {this.codPostal = codPostal;}


	/**
	 * Redefinicion del metodo toString
	 */
	@Override
	public String toString() {
		return this.nomCalle +", " + this.numero +" ("+this.codPostal+")";
	}
	

	
	
	
}
