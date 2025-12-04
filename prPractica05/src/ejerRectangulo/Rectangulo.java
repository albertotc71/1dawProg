package ejerRectangulo;

public class Rectangulo {
	
	/**
	 * Variables de instancia
	 */
	private int alto;
	private int ancho;
	
	
	/**
	 * Constructores
	 */
	public Rectangulo (int ancho, int alto) {
		this.ancho=ancho;
		this.alto=alto;
	}
	
	public Rectangulo (int alto) {
		this(alto,alto);
	}
	
	public Rectangulo () {
		this(0,0);
	}

	/**
	 * Metodos getter's and setter's
	 * @return
	 */
	public int getAlto() {return alto;}
	public int getAncho() {return ancho;}
	
	public void setAlto(int alto) {
		if(alto<0)
			System.out.println("No puede ser un valor negativo");
		else
			this.alto = alto;
	}

	public void setAncho(int ancho) {
		if(ancho<0)
			System.out.println("No puede ser un valor negativo");
		else
			this.ancho = ancho;
	}
	
	/**
	 * Metodo que calcula el area del rectangulo
	 * @return
	 */
	public int area() {
		return alto*ancho;
	}
	
	/**
	 * Metodo que calcula el perimetro del rectangulo
	 * @return
	 */
	public int perimetro() {
		return 2 * (alto+ancho);
	}
	
	/**
	 * Metodo que permite agrandar el alto de un rectangulo
	 * @param factor
	 */
	public void agrandar (int factor) {
		if(factor<0)
			System.out.println("Error, valor negativo");
		else
			this.alto = alto * factor;
			
	}
	
	/**
	 * Metodo que permite agrandar el alto y el ancho de un rectangulo
	 * @param ancho
	 * @param alto
	 */
	public void agrandar (int ancho, int alto) {
		if(ancho<0 || alto<0)
			System.out.println("Error, valor negativo");
		else {
			this.ancho = ancho;
			this.alto=alto;
		}
			
	}
	
	/**
	 * Redefinicion del metodo toString
	 */
	@Override
	public String toString() {
		return "Objeto tipo "+ getClass().getSimpleName()+
				"\n\tAncho: "+ancho+
				"\n\tAlto: "+alto;
	}
	
	
}
