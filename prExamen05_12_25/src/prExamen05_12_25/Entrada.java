package prExamen05_12_25;

public class Entrada {
	
	/**
	 * Variables de instancia
	 */
	private int numEntrada;
	private Espectaculo espectaculo;
	private String tipoEntrada;
	
	/**
	 * Constructor
	 * @param numEntrada
	 * @param espectaculo
	 * @param tipoEntrada
	 */
	public Entrada(int numEntrada, Espectaculo espectaculo, String tipoEntrada) {
		this.numEntrada = numEntrada;
		this.espectaculo = espectaculo;
		this.tipoEntrada = tipoEntrada;
	}

	/**
	 * Metodos getter's and setter's
	 * @return
	 */
	public int getNumEntrada() {return numEntrada;}
	public Espectaculo getEspectaculo() {return espectaculo;}
	public String getTipoEntrada() {return tipoEntrada;}

	public void setNumEntrada(int numEntrada) {this.numEntrada = numEntrada;}
	public void setEspectaculo(Espectaculo espectaculo) {this.espectaculo = espectaculo;}
	public void setTipoEntrada(String tipoEntrada) {this.tipoEntrada = tipoEntrada;}
	
	
	
	@Override
	public String toString() {
		return "Entrada numero: "+numEntrada+
				"\n\tEspectaculo: "+espectaculo.getTitulo()+
				"\n\tLugar: "+espectaculo.getLugar().getNombre()+
				"\n\tTipo espectaculo: "+(espectaculo.isConcierto()?"Concierto":"ObraTeatro")+
				"\n\tTipo de entrada: "+tipoEntrada+
				"\n\tPrecio Base: "+espectaculo.precioBase()+"€"+
				"\n\tPrecio final: "+costoFinal()+"€";
	}
	
	
	/**
	 * Metodo que calcula el coste final de la entrada 
	 * @return
	 */
	public double costoFinal() {
		double total;
		
		total = espectaculo.precioBase();
		
		if(tipoEntrada.equalsIgnoreCase("reducida"))
			total -=(total*0.8);
		else if (tipoEntrada.equalsIgnoreCase("VIP")&&espectaculo.getOrganizador().isDescuentosVIP())
			total -= (total*0.1);
		
		return total;
	}
	
	public double costoFinal(float tasaConversion) {
		return this.costoFinal()*tasaConversion;
	}
}
