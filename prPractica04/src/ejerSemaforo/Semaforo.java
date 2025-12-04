package ejerSemaforo;



public class Semaforo {
	
	/**
	 * Variables de instancia
	 */
	
	private String colorSemaforo = "Rojo";

	
	
	
	
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
		if(colorSemaforo.equalsIgnoreCase("Verde"))
			return true;
		else
			return false;
	}
	
	
	/**
	 * Redefinicion del metodo toString
	 */
	@Override
	public String toString() {
		
		String cadena;
		switch(this.colorSemaforo) {
			case "Rojo" -> cadena = "No puede pasar";
			case "Amarillo" -> cadena = "Pase con precaucion";
			case "Verde" -> cadena = "Puede pasar";
			default -> cadena="Semaforo averiado";
		}
		
		return "Color semaforo: "+this.colorSemaforo+" ("+cadena+")";
	}
	
	
	/**
	 * Redefinicion del metodo Equals
	 */
	@Override
	public boolean equals(Object obj) {  
		Semaforo other = (Semaforo) obj; 
		return ((this.colorSemaforo.equalsIgnoreCase(other.colorSemaforo))); 
	} 
	
}
