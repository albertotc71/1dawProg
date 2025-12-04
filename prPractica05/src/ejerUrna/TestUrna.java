package ejerUrna;

public class TestUrna {

	public static void main(String[] args) {
		
		Urna u1 = new Urna(2,4);
		
		char bola1, bola2;
		
		while(u1.quedaMasDeUnaBola()) {
			
			System.out.println(u1.toString());
			
			bola1 = u1.sacaBola();
			bola2 = u1.sacaBola();
			
			
			System.out.println("Ha salido una bola "+bola1+" y una bola "+bola2);
			
			if(bola1==bola2) {
				u1.meteBola('N');
			}
			if(bola1!=bola2) {
				u1.meteBola('B');
			}
			
			
			System.out.println(u1.toString());
			
			
			
		}
		
	}

}
