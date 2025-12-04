package ejerEdificio;

/**
 * Clase que testea el funcionamiento de las clases Direccion, Edificio, Casa, Colegio y Guarderia
 * 
 * @author Alberto Torres
 */
public class TestEdificios {

	public static void main(String[] args) {
		
		//---------------------------------------
		//Prueba de la clase Direccion
		//---------------------------------------
		
		Direccion dir1 = new Direccion("Avda. Europa", 126, 29210);
		Direccion dir2 = new Direccion("Calle Alameda", 2, 29200);
		
		
		System.out.println(dir1);
		System.out.println(dir2);
		
		
		//---------------------------------------
		//Prueba de la clase Edificio
		//---------------------------------------
		Edificio edif1 = new Edificio(dir1, 10, 3, 1000);
		Edificio edif2 = new Edificio("Calle Lucena", 5, 29200, 3, 1, 100);
		
		
		System.out.println(edif1.toString());
		System.out.println(edif2.toString());
		
		
		//---------------------------------------
		//Prueba de la clase Casa
		//---------------------------------------
		Casa casa1 = new Casa(dir2, 7, 2, 130, 3, 2);
		
		System.out.println(casa1.toString());
		
		
		
		//---------------------------------------
		//Prueba de la clase Colegio
		//---------------------------------------
		Colegio cole1 = new Colegio(dir1, 30, 4, 2000, 18, 3);
		System.out.println(cole1.toString());
		
		
		Edificio cole2 = new Colegio(dir1, 30, 4, 2000, 18, 3);
		System.out.println(cole2.toString());
		
		cole1.saludaColegio();
		//cole2.saludaColegio();  //No podriamos utilizar este metodo al ser la referencia tipo "Edificio"
		
		//---------------------------------------
		//Prueba de la clase Edificio
		//---------------------------------------
		Guarderia guarde = new Guarderia(dir1, 10, 1, 500, 4, 2, 100);
		
		System.out.println(guarde);
		
	}

}
