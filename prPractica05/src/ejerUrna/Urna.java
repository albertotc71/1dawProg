package ejerUrna;


public class Urna {
	
	
	
	/**
     * Variables de instancia
     */
    
    public int bolasNegras;
    public int bolasBlancas;

    /**
     * Constructor
     */
    public Urna(int bolasNegras, int bolasBlancas) {
        
        this.bolasNegras = bolasNegras;
        this.bolasBlancas = bolasBlancas;
    }
    
    public Urna() {
    	this(50, 50);
    }
    
    
    
    /**
     * Métodos
     */
    
    public char sacaBola() {
    	int total= bolasNegras+bolasBlancas;
    	int random = (int)Math.random()*total;
    	if(random<this.bolasNegras) {
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
    
    
    public void meteBola(char color) {
        if(color=='N') {
            this.bolasNegras++;
        }
        else if (color=='B') {
            this.bolasBlancas++;
        }
    }
    
    public boolean quedanBolas() {
        if (totalBolas() > 0) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public boolean quedaMasDeUnaBola() {
        if (totalBolas() > 1) {
            return true;
        }
        else {
            return false;
        }
    }
    
    
    
    private int totalBolas() {
    	return this.bolasBlancas + this.bolasNegras;
    }

    
    /**
     * Métodos Getter's y Setter's
     */

    public int getBolasNegras() {return bolasNegras;}
    public int getBolasBlancas() {return bolasBlancas;}

    public void setBolasNegras(int bolasNegras) {this.bolasNegras = bolasNegras;}
    public void setBolasBlancas(int bolasBlancas) {this.bolasBlancas = bolasBlancas;}
    
    
    /**
     * Redefinicion del metodo toString
     */
    @Override
    public String toString() {
        return this.getClass().getSimpleName().toUpperCase() +
                "\n\tNúmero de bolas negras: " + this.bolasNegras +
                "\n\tNúmero de bolas blancas: " + this.bolasBlancas +
                "\n\tTotal de bolas: " + totalBolas();
    }
    
	
}
