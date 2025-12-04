package prPractica01;

import java.util.Scanner;

/**
 * Diseñar un programa que, a partir de los tres puntos extremos (P1, P2 y P3) de un triángulo, calcule el
 * área del mismo, de acuerdo con la siguiente fórmula: 
 */

public class Ejercicio18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			
		short p1x,p2x,p3x,p1y,p2y,p3y;
		float s1,s2,s3,area,t;
		
		//Pedimos los valores de los puntos X Y
		System.out.println("Introduce el valor de X en el primer punto: ");
		p1x = sc.nextShort();
		
		System.out.println("Introduce el valor de Y en el primer punto: ");
		p1y = sc.nextShort();
		
		System.out.println("Introduce el valor de X en el segundo punto: ");
		p2x = sc.nextShort();
		
		System.out.println("Introduce el valor de Y en el segundo punto: ");
		p2y = sc.nextShort();
		
		System.out.println("Introduce el valor de X en el tercer punto: ");
		p3x = sc.nextShort();
		
		System.out.println("Introduce el valor de Y en el tercer punto: ");
		p3y = sc.nextShort();
		
		
		//Calculamos la distancia entre los puntos, el area y la T
		s1 = (float)Math.sqrt(Math.pow(p1x-p2x,2)+Math.pow(p1y-p2y,2));
		s2 = (float)Math.sqrt(Math.pow(p2x-p3x,2)+Math.pow(p2y-p3y,2));
		s3 = (float)Math.sqrt(Math.pow(p3x-p1x,2)+Math.pow(p3y-p1y,2));
		t = (s1+s2+s3)/2;
		area = (float)Math.sqrt(t*(t-s1)*(t-s2)*(t-s3));
		
		//Mostramos el area
		System.out.println("El area de ese triangulo es: "+area);
		
		sc.close();
	}

}
