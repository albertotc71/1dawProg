package ejer31_40;

import java.util.Scanner;

/**
 * Introducir un número desde teclado y desglosarlo de forma ideal en billetes y monedas de curso legal,
 * es decir, con el mínimo número de billetes y monedas. 
 */

public class Ejercicio40 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		float num;
		int cont500=0, cont200=0, cont100=0, cont50e=0, cont20e=0,cont10e=0,cont5e=0,cont2e=0,cont1e=0;
		int cont50c=0, cont20c=0,cont10c=0,cont5c=0,cont2c=0,cont1c=0;
		int ent=0, dec=0;
		
		
		System.out.println("Introduce una cantidad para sacar todos los billetes y monedas necesarias: ");
		num = sc.nextFloat();
		
		ent=(int)(num/1);
		dec=(int)((num%1)*100);
		
		while(ent!=0) {
			if(ent>=500) {
				ent=ent-500;
				cont500++;
			}
			else if(ent>=200) {
				ent=ent-200;
				cont200++;
			}
			else if(ent>=100) {
				ent=ent-100;
				cont100++;
			}
			else if(ent>=50) {
				ent=ent-50;
				cont50e++;
			}
			else if(ent>=20) {
				ent=ent-20;
				cont20e++;
			}
			else if(ent>=10) {
				ent=ent-10;
				cont10e++;
			}
			else if(ent>=5) {
				ent=ent-5;
				cont5e++;
			}
			else if (ent>=2) {
				ent=ent-2;
				cont2e++;
			}
			else if(ent>=1) {
				ent=ent-1;
				cont1e++;
			}
			
		}
		
		while(dec!=0) {
			if(dec>=50) {
				dec=dec-50;
				cont50c++;
			}
			else if(dec>=20) {
				dec=dec-20;
				cont20c++;
			}
			else if(dec>=10) {
				dec=dec-10;
				cont10c++;
			}
			else if(dec>=5) {
				dec=dec-5;
				cont5c++;
			}
			else if (dec>=2) {
				dec=dec-2;
				cont2c++;
			}
			else if(dec>=1) {
				dec=dec-1;
				cont1c++;
			}
		}
		
		
		System.out.println();
		
		sc.close();
		
	}

}
