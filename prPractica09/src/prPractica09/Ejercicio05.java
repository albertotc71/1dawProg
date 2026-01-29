package prPractica09;

import java.util.Arrays;
import java.util.Scanner;

/**
 * A partir de una cadena de entrada con formato “dd/mm/aaaa”, descompón la cadena de forma que
 * obtengas tres números uno con el día, otro con el mes, y otro con el año.
 * A partir de una cadena de entrada con formato “nombre_usuario@gestor_correo”, descompón la cadena
 * de forma que obtengas dos nuevas cadenas, una con el nombre de usuario, y otra con el del gestor de
 * correo.

 */

public class Ejercicio05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String fecha = "";
		String correo = "";
		
		//Descomponer una fecha en dia, mes y año
		System.out.print("Introduce una fecha: ");
		fecha=sc.nextLine();
		
		String [] fechaDescompuesta;
		fechaDescompuesta = fecha.split("/");
		
		System.out.println(Arrays.toString(fechaDescompuesta));
		
		
		//Descomponer un correo electronico en usuario y gestor de correo
		System.out.print("Introduce un correo: ");
		correo=sc.nextLine();
		
		String [] correoDescompuesto;
		correoDescompuesto = correo.split("@");
		
		System.out.println(Arrays.toString(correoDescompuesto));
		
		
		sc.close();
		
	}

}
