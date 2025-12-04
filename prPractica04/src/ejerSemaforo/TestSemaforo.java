package ejerSemaforo;

public class TestSemaforo {

	public static void main(String[] args) {
		
		
		//Clase Semaforo sin constructor
		
		//Crear varios objetos tipo Semaforo
		Semaforo miSemaforo = new Semaforo(); 
		Semaforo semaforoDeMiCalle = new Semaforo(); 
		Semaforo otroSemaforo = new Semaforo(); 
		
		//Modificar el color de dos de los semaforos
		miSemaforo.setColor("Rojo"); 
		otroSemaforo.setColor("Verde"); 
		
		//Mostrando el color de dos semaforos
		System.out.println(otroSemaforo.getColor()); 
		System.out.println(semaforoDeMiCalle.getColor()); 
		
		//Prueba del metodo get
		if (miSemaforo.getColor().equals("Rojo")) 
			System.out.println("No pasar");
		
		//Prueba del metodo PuedoPasar
		if (miSemaforo.puedoPasar() == true) 
			System.out.println("Puedes pasar"); 
		else 
			System.out.println("No puedes pasar"); 
		
		System.out.println("\n"+miSemaforo.toString()); 
		System.out.println("\n"+otroSemaforo.toString()); 
		System.out.println("\n"+semaforoDeMiCalle.toString());
		
		
		
		
	}

}
