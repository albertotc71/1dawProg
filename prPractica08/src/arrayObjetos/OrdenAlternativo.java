package arrayObjetos;

import java.util.Comparator;

/**
 * Esta clase implementa la interfaz Comparator para establecer un 
 * orden alternativo de Alumnos, en este caso sera por Apellido1,
 * si este se repite por apellido2, si este se repite por nombre,
 * y si este se repite por edad
 */

public class OrdenAlternativo implements Comparator<Alumno>{

	
	/**
	 * Redefinicion del metodo compare de Comparator
	 */
	@Override
	public int compare(Alumno o1, Alumno o2) {
		
		int compara;
		
		compara = o1.getApellido1().compareTo(o2.getApellido1());
		
		if(compara!=0) return compara;
		
		
		compara = o1.getApellido2().compareTo(o2.getApellido2());
		
		if(compara!=0) return compara;
		
		
		compara = o1.getNombre().compareTo(o2.getNombre());
		
		if(compara!=0) return compara;
		
		return o1.getEdad()-o2.getEdad();
		
		
		
		
		
	}
	
		
	
	
}
