package prArrays;

public class Prueba1 {

	public static void main(String[] args) {
		
		//1. Declaramos un array con valores (1..50)
		int [] array1 = {15,17,14,12,20};
		
		
		for(int i=0;i<array1.length;i++) {
			if(10<array1[i]&&array1[i]<20) {
				
				System.out.println("Este numero es mayor que 10 y menor que 20: "+array1[i]);
			}
		}
		
		//2. Ayudar al equipo directivo a encontrar los boletos que se han vendido una vez
		int [] boletosVendidos = {10,30,50,30,20,10,70,20,50};
		for(int i = 0;i<boletosVendidos.length;i++) {
			boolean sw = false;
			for(int j=0;j<boletosVendidos.length;j++) {
				if(boletosVendidos[i]==boletosVendidos[j] && i!=j)
					sw=true;
				
			}
			if(!sw)	
				System.out.println("El boleto con este numero esta bien vendido " +boletosVendidos[i]);
		}
		
	}

}
