package ejerCoche;

public class Coche {
	
	/**
	 * Variables de instancia
	 */
	private String modelo;
	private String fabricante;
	private float precioSinIva;
	public float porceIva;
	
	/**
	 * Constructores
	 * @param modelo
	 * @param fabricante
	 * @param precioSinIva
	 * @param porceIva
	 */
	public Coche(String modelo, String fabricante, float precioSinIva, float porceIva) {
		this.modelo = modelo;
		this.fabricante = fabricante;
		this.precioSinIva = precioSinIva;
		this.porceIva = porceIva;
	}

	public Coche(String modelo, String fabricante, float precioSinIva) {
		this(modelo,fabricante,precioSinIva,0);
	}

	public Coche() {
		this("","",0,0);
	}
	
	
	/**
	 * Metodos getter's and setter's
	 * @return
	 */
	public String getModelo() {return modelo;}
	public String getFabricante() {return fabricante;}
	public float getPrecioSinIva() {return precioSinIva;}
	public float getPorceIva() {return porceIva;}

	public void setModelo(String modelo) {this.modelo = modelo;}
	public void setFabricante(String fabricante) {this.fabricante = fabricante;}
	public void setPrecioSinIva(float precioSinIva) {this.precioSinIva = precioSinIva;}
	public void setPorceIva(float porceIva) {this.porceIva = porceIva;}
	
	/**
	 * Método que muestra el modelo de coche y su precio con iva
	 */
	public void consulta() {
		System.out.println("Modelo: "+modelo+"\nPrecio: "+precioReal());
	}
	
	
	/**
	 * Método que calcula el precio real del coche con iva incluido
	 * @return
	 */
	private float precioReal() {
		return precioSinIva +(precioSinIva*porceIva)/100;
	}
	
	
	/**
	 * Metodo que permite subir el precio sin iva del coche
	 * @param porcentaje
	 * @return
	 */
	public float actualizaPrecio(byte porcentaje) { 
		return precioSinIva +(precioSinIva*porcentaje)/100;
	}
	
	/**
	 * Redefinicion del metodo toString
	 */
	@Override
	public String toString() {
		return "Fabricante: "+fabricante+
				"\nModelo: "+modelo+
				"\nPrecio sin IVA: "+precioSinIva+
				"\nPrecio con IVA: "+precioReal();
	}
	
	/**
	 * Redefinicion del metodo Equals
	 */
	@Override
	public boolean equals(Object obj) {
		Coche other = (Coche)obj;
		return this.fabricante.equalsIgnoreCase(other.fabricante)&&
				this.modelo.equalsIgnoreCase(other.modelo);
	}
}
