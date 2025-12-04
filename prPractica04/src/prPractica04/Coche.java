package prPractica04;

public class Coche {
	
	/**
	 * Variables de instancia
	 */
	private String modelo;
	private String fabricante;
	private float precioSinIva;
	public float porceIva;
	
	
	public Coche(String modelo, String fabricante, float precioSinIva, float porceIva) {
		this.modelo = modelo;
		this.fabricante = fabricante;
		this.precioSinIva = precioSinIva;
		this.porceIva = porceIva;
	}


	public String getModelo() {
		return modelo;
	}


	public String getFabricante() {
		return fabricante;
	}


	public float getPrecioSinIva() {
		return precioSinIva;
	}


	public float getPorceIva() {
		return porceIva;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}


	public void setPrecioSinIva(float precioSinIva) {
		this.precioSinIva = precioSinIva;
	}


	public void setPorceIva(float porceIva) {
		this.porceIva = porceIva;
	}
	
	
	
}
