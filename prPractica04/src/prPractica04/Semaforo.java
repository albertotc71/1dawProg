package prPractica04;



public class Semaforo {
	
	/**
	 * Variables de instancia
	 */
	
	public String colorSemaforo;

	
	public Semaforo (String colorSemaforo) {
		this.colorSemaforo=colorSemaforo;
	}
	
	
	/**
	 * Metodos getter's and setter's
	 */
	public String getColor() {return colorSemaforo;}

	public void setColor(String nuevoColor) {this.colorSemaforo = nuevoColor;}
	
	
	/**
	 * Metodo que nos permite mostrar si podemos pasar o no
	 * @return
	 */
	public boolean puedoPasar() {
		if(colorSemaforo.equals("Verde"))
			return true;
		else if(colorSemaforo.equals("Amarillo"))
			return false;
		return false;
	}
	
	
	/**
	 * Redefinicion del metodo toString
	 */
	@Override
	public String toString() {
		return this.getColor();
	}
	
	@Override
	public boolean equals(Object obj) {  
		Semaforo other = (Semaforo) obj; 
		return ((this.colorSemaforo.equalsIgnoreCase(other.colorSemaforo))); 
	} 
	
}
