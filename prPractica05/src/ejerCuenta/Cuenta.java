package ejerCuenta;

public class Cuenta {
	
	/**
	 * Constantes
	 */
	public static final float INTERES = 3f;
	
	
	/**
	 * Variables de clase
	 */
	private static float acumulador; 
	
	
	/**
	 * Variables de instancia
	 */
	private String numCuenta;
	private String nomTitular;
	private float saldo;
	
	/**
	 * Inicializador
	 */
	static {
		acumulador = 0;
	}

	/**
	 * Constructor
	 * @param numCuenta
	 * @param nomTitular
	 * @param saldo
	 */
	public Cuenta(String numCuenta, String nomTitular, float saldo) {
		this.numCuenta = numCuenta;
		this.nomTitular = nomTitular;
		this.saldo = saldo;
		
		//Incrementamos el saldo del banco
		acumulador += saldo;
	}

	
	/**
	 * Getter's and setter's 
	 * @return
	 */
	public static float getInteres() {return INTERES;} //(getSaldo() * INTERES)/100.0f
	public static float getAcumulador() {return acumulador;}
	public String getNumCuenta() {return numCuenta;}
	public String getNomTitular() {return nomTitular;}
	public float getSaldo() {return saldo;}

	public static void setAcumulador(float acumulador) {Cuenta.acumulador = acumulador;}
	public void setNumCuenta(String numCuenta) {this.numCuenta = numCuenta;}
	public void setNomTitular(String nomTitular) {this.nomTitular = nomTitular;}
	public void setSaldo(float saldo) {this.saldo = saldo;}
	
	
	/**
	 * Metodo que ingresa una cantidad en una cuenta y aumenta el saldo total del banco
	 * @param cantidad
	 */
	public void ingreso(int cantidad) {
		this.saldo += cantidad;
		acumulador = saldo + cantidad;
	}
	
	/**
	 * Metodo que devuelve el reintegro de una cuenta
	 * @return
	 */
	public boolean reintegro(float cantidad) {
		if(saldo<cantidad) return false;
		
		this.saldo -= cantidad;
		acumulador =saldo - cantidad;
		
		return true;
	}
	
	
	/**
	 * Metodo que resetea el acumulador del banco
	 */
	public void reseteaAcumuladorBanco() {
		acumulador=0;
	}
	
	/**
	 * Metodo que calcula el interes 
	 * @return
	 */
	public float calculaIntereses() {
		return saldo*INTERES/10;
	}
	
	/**
	 * Redefinicion del metodo toString
	 */
	@Override
	public String toString() {
		return "Datos cuenta bancaria"+
				"\n\tNº de cuenta: "+numCuenta+
				"\n\tTitular: "+nomTitular+
				"\n\tSaldo: "+saldo+
				"\n\tInteres obtenido: "+calculaIntereses();
	}
	
	
	@Override
	public void finalize() throws Throwable {
		System.out.println("Objeto destruido. Numero cuenta: "+this.getNumCuenta());
	}
	
}
