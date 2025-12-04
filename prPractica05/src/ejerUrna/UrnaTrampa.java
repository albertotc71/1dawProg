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
			if(super.bolasBlancas>0&&super.bolasNegras>0) {
				cambioBola = (int)Math.random()*2;
				if(cambioBola==1) {
					setBolasBlancas(super.bolasNegras++);
					setBolasNegras(super.bolasBlancas--);
				}
				else {
					setBolasBlancas(super.bolasNegras--);
					setBolasNegras(super.bolasBlancas++);
				}
					
				
			}
		}
		
		return super.sacaBola();
	}
	
}
