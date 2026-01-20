package juego7Media18;

import java.util.Objects;

/**
 * Clase que guardara la informacion de un objeto de tipo carta
 * 		- Valor de carta --> 1a 10 (1 a 7, cartas de 1 a 7, 8 - Sota, 9 - Caballo, 10 - Rey)
 * 		- Palo de la carta --> Oros, Copas, Bastos, Espadas
 * 
 * @author Alberto
 */

public class Carta {
	
	/**
	 * Variables de instancias
	 */
	private EnumPalo palo;
	private byte valor;
	
	
	
	/**
	 * Constructor
	 * @param palo
	 * @param valor
	 */
	public Carta(EnumPalo palo, byte valor) {
		this.palo = palo;
		this.valor = valor;
	}


	/**
	 * Getter's and setter's 
	 */
	public EnumPalo getPalo() {return palo;}
	public byte getValor() {return valor;}

	public void setPalo(EnumPalo palo) {this.palo = palo;}
	public void setValor(byte valor) {this.valor = valor;}
	
	
	@Override
	public String toString() {
		
		String cad = switch(this.valor) {
			case 1,2,3,4,5,6,7 -> {yield this.valor + " de "+this.palo;}
			case 8 -> {yield "Sota de "+this.palo;}
			case 9 -> {yield "Caballo de "+this.palo;}
			case 10 -> {yield "Rey de "+this.palo;}
			default -> {yield "Carta no valida";}
		};
		
		return cad;
		
		/*return switch(this.valor) {
			case 1,2,3,4,5,6,7 -> {yield this.valor + " de "+this.palo;}
			case 8 -> {yield "Sota de "+this.palo;}
			case 9 -> {yield "Caballo de "+this.palo;}
			case 10 -> {yield "Rey de "+this.palo;}
			default -> {yield "Carta no valida";}
		};*/
		
	}
	
	
	/**
	 * Metodo que devuelve la puntuacion real de la carta para el juego de la 7 y media
	 * @return  --> 1 a 7 si el valor de la carta es de 1 a 7
	 * 			--> 0.5 si el valor de la carta es 8,9,10
	 */
	public float getPuntos7Media() {
		
		return (this.valor<=7?this.valor:0.5f);
	}


	/**
	 * Redefinicion de hashCode
	 */
	@Override
	public int hashCode() {
		return Objects.hash(palo, valor);
	}

	/**
	 * Redefinicion de equals
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carta other = (Carta) obj;
		return palo == other.palo && valor == other.valor;
	}
	
	
	
}
