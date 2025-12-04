package ejInterfaces;


public interface InterfazA {

	// Definición de una constante, por defecto en las interfaces
	// son public static final
	int VARIA = 100;
	
	// Definir un m�todo de esta interfaz
	void metodoInterfazA();
	
	default void metodoInterfazANuevo() {
		System.out.println("Hola mundo");
	}
	
	default public void metodoInterfazA2() {
		System.out.println("Hola");
	}
	
}
