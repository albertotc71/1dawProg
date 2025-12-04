package ejerSemaforo;



public class Semaforo2 {
	
	/**
	 * Variables de instancia
	 */
	
	private String colorSemaforo;

	/**
	 * Constructor
	 * @param colorSemaforo
	 */
	public Semaforo2 (String colorSemaforo) {
		this.colorSemaforo=colorSemaforo;
	}
	
	/**
	 * Constructor por defecto
	 */
	public Semaforo2() {
		this("Rojo");
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
		
		
		
		
		
		
		return "Color semaforo: "+this.colorSemaforo+" ("+switch(this.colorSemaforo) {
			case "Rojo" -> {yield "No puede pasar";}
			case "Amarillo" -> {yield "Pase con precaucion";}
			case "Verde" -> {yield "Puede pasar";}
			default -> {yield "Semaforo averiado";}
		}+")";
	}
	
	
	/**
	 * Redefinicion del metodo Equals
	 */
	@Override
	public boolean equals(Object obj) {  
		Semaforo2 other = (Semaforo2) obj; 
		return ((this.colorSemaforo.equalsIgnoreCase(other.colorSemaforo))); 
	} 
	
}
