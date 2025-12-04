package ejerLibro;

public class Libro {
	
	/**
	 * Variables de clase
	 */
	public String autor;
	public String titulo;
	public boolean estado;
	
	
	/**
	 * Constructores
	 */
	public Libro(String autor, String titulo, boolean e) {
		this.autor=autor;
		this.titulo=titulo;
		this.estado=e;
	}

	public Libro (String t, String a) {
		this(a,t,true);
	}
	
	/**
	 * Metodos getter's and setter's
	 * @return
	 */
	public String getAutor() {return autor;}
	public String getTitulo() {return titulo;}
	public boolean isEstado() {return estado;}

	public void setAutor(String autor) {this.autor = autor;}
	public void setTitulo(String titulo) {this.titulo = titulo;}
	public void setEstado(boolean estado) {this.estado = estado;}
	
	
	/**
	 * Redefinicion del metodo toString
	 */
	@Override
	public String toString() {
		return "Autor: "+this.autor+
				"\nTitulo: "+this.titulo+
				(this.estado?" esta en la biblioteca":" no esta en la biblioteca");
	}
	
	/**
	 * Redefinicion del metodo equals
	 */
	@Override
	public boolean equals(Object obj) {  
		Libro other = (Libro) obj; 
		return ((this.autor.equalsIgnoreCase(other.autor)) && 
				(this.titulo.equalsIgnoreCase(other.titulo))); 
	} 
	
	
	
}
