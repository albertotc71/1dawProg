package ejAlumno;

/**
 * Clase Alumno, contiene la informacion y los metodos para manejarla
 * sobre un alumno
 */

public class Alumno {
	
	/**
	 * Variables de clase
	 */
	private static long idProximoAlumno = 2900114500L;  
			//Esta variable guardara el id del siguiente alumno
	
	/**
	 * Constante de clase
	 */
	public static final float SEGUROESCOLAR_MENOR = 1.12F;
	public static final float SEGUROESCOLAR_MAYOR = 10.90F;
	
	
	
	/**
	 * Variables de instancia
	 */
	private long idAlumno;  //Identificador del alumno, sera unico
	private String nombre;
	private byte edad;
	private String curso;  //1º DAW, 2ºSMR, ...
	
	
	/**
	 * Constructor
	 */
	public Alumno (String nombreAlumno, byte edadAlumno, String cursoAlumno) {
		
		//Asignaremos a las variables de instancia el valor de los parametros recibidos
		this.nombre = nombreAlumno;
		this.edad = edadAlumno;
		this.curso = cursoAlumno;
		//idProximoAlumno++;  //Incrementamos la variable de clase en 1, para asignar 
							//el numero a este alumno
		
		this.idAlumno = ++idProximoAlumno;
	}
	
	
	public Alumno (String nombreAlumno, byte edadAlumno) {
		
		this(nombreAlumno, edadAlumno, "Sin asignar");
		
		/*this.nombre = nombreAlumno;
		this.edad = edadAlumno;
		this.curso = cursoAlumno;*/
	}
	
	
	/**
	 * Metodos Getter's (permiten consultar el valor de las variables de instancia)
	 */
	public long getIdAlumno() {return this.idAlumno;}
	public String getNombre() {return this.nombre;}
	public byte getEdad() {return this.edad;}
	public String getCurso() {return this.curso;}
	
	/**
	 * Metodos Setter's (permiten modificar el valor de las variables de instancia)
	 */
	public void setIdAlumno(long idAlumno) {this.idAlumno=idAlumno;}
	public void setNombre(String nombre) {this.nombre=nombre;}
	public void setEdad(byte edad) {this.edad=edad;}
	public void setCurso(String curso) {this.curso=curso;}
	
	
	/**
	 * Redefinicion del metodo toString que ya esta definido en 
	 * la clase Object
	 */
	@Override
	public String toString() {
		return 	"\n\tId Alumno: "+this.idAlumno+
				"\n\tNombre: "+this.nombre+
				"\n\tEdad: "+this.edad+
				"\n\tCurso: "+this.curso;
	}
	
	
	/**
	 * Metodo que comprueba si el alumno es mayor o menor de edad
	 * @return
	 */
	public boolean isMayorEdad() {
		
		if(this.edad>=18)
			return true;
		
		return false;
		
	}
	
	
	/**
	 * Metodo que calcula el coste de la matricula
	 * @return
	 */
	public float costeMatricula() {
		float coste = 300;
		
		if(isMayorEdad())
			coste+=SEGUROESCOLAR_MAYOR;
		else
			coste+=SEGUROESCOLAR_MENOR;
		
		return coste;
	}
	
}
