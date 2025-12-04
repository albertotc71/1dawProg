package ejerUrna;

public class UrnaTresColores extends Urna{
	
	/**
	 * Variables de instancia
	 */
	private int bolasRojas;

	
	
	/**
	 * Constructor
	 * @param bolasNegras
	 * @param bolasBlancas
	 * @param bolasRojas
	 */
	public UrnaTresColores(int bolasNegras, int bolasBlancas, int bolasRojas) {
		super(bolasNegras, bolasBlancas);
		this.bolasRojas = bolasRojas;
	}
	
	
	public UrnaTresColores () {
		super(50, 50);
		this.bolasRojas=0;
	}


	/**
	 * Getter's and setter's
	 * @return
	 */
	public int getBolasRojas() {return bolasRojas;}

	public void setBolasRojas(int bolasRojas) {this.bolasRojas = bolasRojas;}
	
	
	@Override
	public char sacaBola() {
		int total = this.bolasBlancas + this.bolasNegras + this.bolasRojas;
		int random = (int)Math.random()*total;
		if(random<this.bolasRojas) {
			this.bolasRojas--;
			if(this.bolasRojas<=0) {				
				this.bolasRojas=0;
			}
			return 'R';
			
		}
		else if (random<this.bolasNegras) {
			this.bolasNegras--;
			if(this.bolasNegras<=0) {
				this.bolasNegras=0;
			}
			return 'N';
		}
		else {
			this.bolasBlancas--;
    		if(this.bolasBlancas<=0)
    			this.bolasBlancas=0;
    		return'B';
		}
	}
	
}
