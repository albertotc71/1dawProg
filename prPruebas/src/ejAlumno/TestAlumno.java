package ejAlumno;

public class TestAlumno {

	public static void main(String[] args) {
		
		//Crear varios alumnos
		Alumno a1 = new Alumno("Pepe", (byte)18, "1ºDAW");
		Alumno a2 = new Alumno("Maria", (byte)16, "4ºESO B");
		Alumno a3 = new Alumno("Juan Carlos", (byte)22, "2º DAW");
		
		System.out.println("Alumno 1: "+a1.toString());
		System.out.println("Alumno 2: "+a2.toString());
		System.out.println("Alumno 3: "+a3);
		
		System.out.println("El alumno 2 se llama: "+a2.getNombre());
		
		a2.setNombre("Ana Maria");
		
		System.out.println("El alumno 2 se llama: "+a2.getNombre());
		
		System.out.println(a1.isMayorEdad()?"Es mayor de edad":"Es menor de edad");
		
		System.out.println("El alumno "+a2.getNombre()+
							" pagara por su matricula: "+a2.costeMatricula()+" €");
		
	}

}

