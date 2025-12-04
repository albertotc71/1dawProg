package ejerSemaforo;

public class TestSemaforo2 {

	public static void main(String[] args) {
		
		
		//Crear varios objetos tipo Semaforo
		Semaforo2 miSemaforo = new Semaforo2("Verde"); 
		Semaforo2 semaforoDeMiCalle = new Semaforo2("Amarillo"); 
		Semaforo2 otroSemaforo = new Semaforo2("Violeta"); 
		
		
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
