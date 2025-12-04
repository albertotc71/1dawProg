package prExamen31_10_25;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		//Iniciamos Scanner
		Scanner sc = new Scanner(System.in);
		
		
		//Variables
		byte numAtletas, mejorAtleta=Byte.MIN_VALUE;
		double lanza1, lanza2, lanza3, mejorLanza=Double.MIN_VALUE;
		
		
		//Pedimos la cantidad de atletas que van a participar
		System.out.print("¿Cuantos atletas participaran en la prueba? ");
		numAtletas = sc.nextByte();
		
		//Recorremos el bucle con sus sentencias
		for(int cont=1;cont<=numAtletas;cont++) {
			lanza1 = (Math.random()*30)+51;
			lanza2 = (Math.random()*30)+51;
			lanza3 = (Math.random()*30)+51;
			
			System.out.println("Lanzamientos del atleta "+cont+": "+lanza1+" "+lanza2+" "+lanza3);
			
			//Comprobamos cual es el lanzamiento mas lejano
			if(lanza1>mejorLanza) {
				mejorAtleta=(byte) cont;
				mejorLanza = lanza1;
			}
				
			if(lanza2>mejorLanza) {
				mejorAtleta=(byte)cont;
				mejorLanza=lanza2;
			}
			if(lanza3>mejorLanza) {
				mejorAtleta = (byte) cont;
				mejorLanza = lanza3;
			}
				
				
		}
		
		//Mostramos el mejor lanzamiento junto con el atleta que lo ha realizado
		System.out.println("Mejor lanzamiento: "+mejorLanza+" metros, realizado por el atleta "+mejorAtleta);
		
		sc.close();
	}

}
