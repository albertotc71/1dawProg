package prExamen05_12_25;


public class Espectaculo {
	
	/**
	 * Variables de instancia
	 */
	private String titulo;
	private Organizador organizador;
	private Lugar lugar;
	private int duracion;
	private boolean concierto;
	private String genero;
	private boolean giraInternacional;
	
	/**
	 * Constructor
	 * @param titulo
	 * @param organizador
	 * @param lugar
	 * @param duracion
	 * @param concierto
	 * @param genero
	 */
	public Espectaculo(String titulo, Organizador organizador, Lugar lugar, int duracion, boolean concierto,
			boolean giraInternacional, String genero) {
		this.titulo = titulo;
		this.organizador = organizador;
		this.lugar = lugar;
		this.duracion = duracion;
		this.concierto = concierto;
		this.giraInternacional=giraInternacional;
		this.genero = genero;
	}

	
	/**
	 * Metodos getter's and setter's 
	 * @return
	 */
	public String getTitulo() {return titulo;}
	public Organizador getOrganizador() {return organizador;}
	public Lugar getLugar() {return lugar;}
	public int getDuracion() {return duracion;}
	public boolean isConcierto() {return concierto;}
	public String getGenero() {return genero;}
	public boolean isGiraInternacional() {return giraInternacional;}

	public void setTitulo(String titulo) {this.titulo = titulo;}
	public void setOrganizador(Organizador organizador) {this.organizador = organizador;}
	public void setLugar(Lugar lugar) {this.lugar = lugar;}
	public void setDuracion(int duracion) {this.duracion = duracion;}
	public void setConcierto(boolean concierto) {this.concierto = concierto;}
	public void setGenero(String genero) {this.genero = genero;}
	public void setGiraInternacional(boolean giraInternacional) {this.giraInternacional = giraInternacional;}
	
	
	


	/**
	 * Redefinicion del metodo toString
	 */
	@Override
	public String toString() {
		return (concierto?"Concierto":"ObraTeatro")+
				"\n\tTitulo: "+titulo+
				"\n\tOrganizador: "+organizador+
				"\n\tLugar: "+lugar+
				"\n\tImpuestos locales: "+impuestoLocal()+"€"+
				"\n\tPrecio base entradas: "+precioBase()+"€"+
				"\n\tDuracion: "+Utilidades.formateaDuracion(duracion)+
				"\n\t"+(concierto?"Conciero de gira internacional: "+(giraInternacional?"SI":"NO"):"Genero: "+genero);
	}
	
	
	/**
	 * Redefinicion del metodo equals para comparar todas las clases
	 */
	@Override
	public boolean equals(Object obj) {
		Espectaculo other = (Espectaculo)obj;
		return this.titulo.equalsIgnoreCase(other.getTitulo())&&
				this.organizador.equals(other.getOrganizador())&&
				this.lugar.equals(other.getLugar());
	}
	
	
	/**
	 * Metodo que nos permite calcular el impuesto que nos cobrara el ayuntamiento del lugar
	 * @return
	 */
	public float impuestoLocal() {
		float total;
		
		
		if(lugar.getAforo()<500)
			total = 200;
		else if(lugar.getAforo()<1000)
			total = 400;
		else
			total = 600;
		
		
		if(concierto)
			total += (total*0.2);
		else
			total += (total*0.1);
		
		return total;
	}
	
	/**
	 * Metodo abstracto
	 */
	//abstract void calcularPrecioBaseEntrada();
	
	
	/**
	 * Metodo que nos permite calcular el precio base de una entrada
	 * @return
	 */
	public float precioBase() {
		float total;
		
		if(concierto) {
			if((impuestoLocal()+lugar.getPrecioAlquiler()>=10000))
				total=25;
			else
				total=20;
			if(giraInternacional)
				total+=5;
		}
		
		else {
			total=18;
			if(genero.equalsIgnoreCase("musical"))
				total+=12;
			else if (genero.equalsIgnoreCase("drama"))
				total+=3;
			else if(genero.equalsIgnoreCase("comedia"))
				total +=5;
			else
				total+=10;
		}
		
		
		return total;
		
	}
	
}
