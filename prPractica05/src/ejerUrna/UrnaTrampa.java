package ejerUrna;

public class UrnaTrampa extends Urna{

	public UrnaTrampa(int bolasNegras, int bolasBlancas) {
		super(bolasNegras, bolasBlancas);
	}
	
	
	@Override
	public char sacaBola() {
		int cambioBola;
		int probabilidad;
		
		probabilidad = (int)Math.random()*1000+1;
		
		
		if(probabilidad<=2) {
			if(this.bolasBlancas>0&&this.bolasNegras>0) {
				cambioBola = (int)Math.random()*2;
				if(cambioBola==1) {
					setBolasBlancas(this.bolasNegras++);
					setBolasNegras(this.bolasBlancas--);
				}
				else {
					setBolasBlancas(this.bolasNegras--);
					setBolasNegras(this.bolasBlancas++);
				}
					
				
			}
		}
		
		return super.sacaBola();
	}
	
}
