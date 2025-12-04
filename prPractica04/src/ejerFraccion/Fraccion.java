package ejerFraccion;

/**
 * La clase Fraccion. Los atributos serán numerador y denominador, tambien guardaremos el signo. 
 * Y algunos de los métodos pueden ser invierte, simplifica, multiplica, divide, etc.
 * 
 * @author Alberto Torres
 * @version 1.0
 */

public class Fraccion {
	
	/**
	 * Variables de instancia
	 */
	private int signo; //indicara si el numero es positivo o negativo (1 o -1)
	private int numerador;
	private int denominador;
	
	
	/**
	 * Constructor
	 * @throws Exception 
	 */
	public Fraccion (int numerador, int denominador) throws Exception {
		
		if(denominador==0) {
			throw new Exception("Error, el denominador no puede ser 0");
		}
		this.numerador = Math.abs(numerador);
		this.denominador = Math.abs(denominador);
		
		//Calculo del signo
		if(numerador*denominador<0)
			this.signo = -1;
		else
			this.signo = 1;
	}


	/**
	 * Getter's and setter's
	 * @return
	 */
	public int getSigno() {return signo;}
	public int getNumerador() {return numerador;}
	public int getDenominador() {return denominador;}

	public void setSigno(int signo) {this.signo = signo;}
	public void setNumerador(int numerador) {this.numerador = numerador;}
	public void setDenominador(int denominador) {this.denominador = denominador;}
	
	/**
	 * Redefinicion del metodo toString
	 */
	@Override
	public String toString() {
		if(signo == -1)
			return "-"+this.numerador + "/"+this.denominador;
		else
			return this.numerador + "/"+this.denominador;
	}
	
	/**
	 * Metodo que invierte una fraccion
	 * @return --> Devuelve un nuevo objeto con la fraccion invertida
	 * @throws Exception 
	 */
	public Fraccion invierte () throws Exception {
		
		Fraccion nueva;
		
		nueva = new Fraccion(this.signo*this.denominador, this.numerador);
		
		return nueva;
	}
	
	
	public Fraccion invierte2 () throws Exception {

		return new Fraccion(this.signo*this.denominador, this.numerador);
	}
	
	
	/**
	 * En esta forma no creo objeto nuevo
	 */
	public void invierte3() {
		int aux;
		aux = this.denominador;
		this.denominador=this.numerador;
		this.numerador = aux;
	}
	
	
	/**
	 * Devuelve una fraccion multiplicada por un escalar (un numero)
	 * 
	 * Cuando una fraccion se multiplica por un numero "n", el resultado es
	 * otra fraccion con el mismo denominador que la original, y el denominador
	 * se obtiene multiplicando "n" por el numerador de la fraccion original
	 * 
	 * @param n
	 * @return
	 * @throws Exception
	 */
	public Fraccion multiplica (int n) throws Exception{
		return new Fraccion(this.signo*this.numerador*n, this.denominador);
	}
	
	/**
	 * Devuelve una fraccion multiplicada por otra fraccion
	 * @param f
	 * @return
	 * @throws Exception
	 */
	public Fraccion multiplica (Fraccion f) throws Exception{
		return new Fraccion (this.signo*this.numerador*f.getNumerador(), this.denominador*f.getDenominador());
	}
	
	
	/**
	 * Division de una fraccion por un escalar
	 * @param n
	 * @return
	 * @throws Exception
	 */
	public Fraccion division (int n) throws Exception {
		return new Fraccion(this.signo*this.numerador, this.denominador*n);
	}
	
	/**
	 * Division de una fraccion por otra fraccion
	 * @param f
	 * @return
	 */
	public Fraccion division (Fraccion f) throws Exception{
		return new Fraccion(this.signo*this.numerador*f.getDenominador(), this.denominador*f.getNumerador());
	}
	
	/**
	 * Devuelve una fraccion que es el resultado de simplificar la fraccion original.
	 * <p>
	 *Para simplificar una fraccion, se comprueba si numerador y denominador son divisibles entre 
	 *el mismo numero. En tal caso, los dos se dividen. Se repite el proceso hasta que la fraccion que se 
	 *obtiene es irreducible (no se puede simplificar mas).
	 * @return resultado de simplificar (si se puede) la fraccion original, o la misma fraccion en caso de 
	 * que la original sea irreducible
	 * @throws Exception
	 */
	public Fraccion simplifica() throws Exception{
		int s = this.signo;
		int n = this.numerador;
		int d = this.denominador;
		
		
		//Primer planteamiento
		for (int i=2; i<Math.min(this.numerador, this.denominador);i++) {
			while(((n%i)==0)&&((d%i)==0)) {
				n = n/i;
				d=d/i;
			}
				
		}
		
		
		//Segundo planteamiento
		for(int i=Math.min(this.numerador, this.denominador);i>=2;i--) {
			if(((n%i)==0)&&((d&i)==0)) {
				n = n/i;
				d=d/i;
			}
		}
		
		
		
		
		return new Fraccion(s*n,d);
		
	}
}
