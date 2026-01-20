package arrayObjetos;


import java.util.Arrays;

public class TestAlumno {

	public static void main(String[] args) {
		
		Alumno [] clase = new Alumno[3];
		
		clase[0] = new Alumno("Juan", "Moreno", "Lopez", 20);
		clase[1] = new Alumno("Ana", "Martin", "Garcia", 19);
		clase[2] = new Alumno("Antonio", "Gil", "Gonzalez", 22);
		
		System.out.println(Arrays.toString(clase));
		
		Alumno [] clase2 = {new Alumno("Juan", "Moreno", "Lopez", 20),
							new Alumno("Ana", "Martin", "Garcia", 19),
							new Alumno("Antonio", "Gil", "Gonzalez", 22),
							new Alumno("Maria", "Gil", "Gonzalez", 22),
							new Alumno("Ana", "Martin", "Garcia", 19),
		};
		System.out.println(Arrays.toString(clase2));
		
		Alumno [] clase3 = {new Alumno("Juan", "Moreno", "Lopez", 20),
				new Alumno("Ana", "Martin", "Garcia", 19),
				new Alumno("Antonio", "Gil", "Gonzilez", 22),
				new Alumno("Maria", "Gil", "Gonzilez", 22),
				new Alumno("Ana", "Martin", "Garcia", 19),
		};
		
		
		//Recorrer el array 3 con indices mostrando el nombre del alumno en mayuscula y su edad
		for(int i=0;i<clase3.length;i++) {
			System.out.println(clase3[i]);
			System.out.println(clase3[i].getNombre().toUpperCase() + ", "+clase3[i].getEdad());
		}
		
		
		//Recorrer el array con foreach
		
		for(Alumno elem : clase3) {
			System.out.println(elem+" ");
		}
		
		
		
		//Comparar arrays de objetos
		System.out.println("Comparacion clase y clase2 "+Arrays.equals(clase3, clase2));
		System.out.println("Comparacion clase2 y clase3 "+Arrays.equals(clase2, clase3));
		
		
		//Ordenar el array por el orden natural (Comparable)
		Arrays.sort(clase2);
		System.out.println(Arrays.toString(clase2));
		
		
		//Ordenar el array por el orden alternativo
		Arrays.sort(clase3,new OrdenAlternativo());
		System.out.println(Arrays.toString(clase3));
		
	}

}


