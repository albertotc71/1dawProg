package ejerVehiculo;

import java.awt.Color;

public class VehiculoAbstracto {
	
	/**
	 * Variables de instancia
	 */
	
	private Color color;
	private short cilindrada;
	private short potencia;
	private byte numRuedas;
	
	/**
	 * Constructor
	 * @param color
	 * @param cilindrada
	 * @param potencia
	 */
	public VehiculoAbstracto(Color color, short cilindrada, short potencia, byte numRuedas) {
		this.color = color;
		this.cilindrada = cilindrada;
		this.potencia = potencia;
		this.numRuedas=numRuedas;
	}


	public VehiculoAbstracto(Color color, short cilindrada, byte numRuedas) {
		super();
		this.color = color;
		this.cilindrada = cilindrada;
		this.numRuedas = numRuedas;
	}



	public VehiculoAbstracto(Color color, byte numRuedas) {
		super();
		this.color = color;
		this.numRuedas = numRuedas;
	}



	public VehiculoAbstracto(byte numRuedas) {
		super();
		this.numRuedas = numRuedas;
	}


	public VehiculoAbstracto(short cilindrada) {
		super();
		this.cilindrada = cilindrada;
	}


	public VehiculoAbstracto(Color color) {
		super();
		this.color = color;
	}





	public Color getColor() {return color;}
	public short getCilindrada() {return cilindrada;}
	public short getPotencia() {return potencia;}
	public byte getNumRuedas() {return numRuedas;}

	public void setColor(Color color) {this.color = color;}
	public void setCilindrada(short cilindrada) {this.cilindrada = cilindrada;}
	public void setPotencia(short potencia) {this.potencia = potencia;}
	public void setNumRuedas(byte numRuedas) {this.numRuedas = numRuedas;}
	
	
	
}
