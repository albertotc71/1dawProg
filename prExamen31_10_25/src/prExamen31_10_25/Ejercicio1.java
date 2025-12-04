package prExamen31_10_25;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		//Variables
		int litros=0;
		byte min=0;
		
		
		//Hacemos la comprobacion y mostramos tanto los minutos pasados como los litros llenados/vaciados
		while(litros!=800) {
			min++;
			if(litros<500) {				
				litros+=130;
				 System.out.println("Minuto "+min+" Se rellena rapido. Nivel = "+litros);
			}
			else if(litros<800) {
				litros+=50;
				System.out.println("Minuto "+min+" Relleno lento. Nivel = "+litros);
			}
			else {
				litros-=10;
				System.out.println("Minuto "+min+" Se vacia. Nivel = "+litros);	
			}
		}
		System.out.println("El deposito esta estabilizado en 800 litros tras "+min+" minutos");
		
	}

}
