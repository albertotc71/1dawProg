package biblioteca;

public class Libro implements Prestable{

	/**
	 * Variables de instancia
	 */
	private String isbn;
	private String titulo;
	private String autor;
	private int anioPubli;
	
	public Libro(String isbn, String titulo, String autor, int anioPubli) {
		super();
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.anioPubli = anioPubli;
	}

	
	
	public String getIsbn() {return isbn;}
	public String getTitulo() {return titulo;}
	public String getAutor() {return autor;}
	public int getAnioPubli() {return anioPubli;}

	public void setIsbn(String isbn) {this.isbn = isbn;}
	public void setTitulo(String titulo) {this.titulo = titulo;}
	public void setAutor(String autor) {this.autor = autor;}
	public void setAnioPubli(int anioPubli) {this.anioPubli = anioPubli;}



	@Override
	public void presta() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void devuelve() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void estaPrestado() {
		// TODO Auto-generated method stub
		
	}

}
