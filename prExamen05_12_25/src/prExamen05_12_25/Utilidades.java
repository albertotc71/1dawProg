package prExamen05_12_25;

public class Utilidades {
	
	/**
	 * Metodo de clase que formatea la duracion en horas y minutos
	 * @param minutosTotales
	 * @return
	 */
	public static String formateaDuracion (int minutosTotales) {
		int min, horas;
		if(minutosTotales<60) {
			min = minutosTotales;
			return min+" minutos";
		}
		horas = minutosTotales/60;
		min = (minutosTotales%60);
		
		return horas+" horas y "+min+" minutos";
	}
	
	
	/**
	 * Metodo de clase que nos permite calcular el precio total tras aplicar un descuento 
	 * @param precioBase
	 * @param tasaConversion
	 * @return
	 */
	public static double calcularDescuento(double precioBase, double tasaConversion) {
		
		return precioBase-(precioBase*tasaConversion/100.0f);
		
	}
	
	
	/**
	 * Metodo de clase que nos permite convertir una cantidad de euros a otra divisa
	 * @param cantidadEuros
	 * @param tasaConversion
	 * @return
	 */
	public static float convertirMoneda(double cantidadEuros, double tasaConversion) {
		
		return (float) (cantidadEuros*tasaConversion);
	}
	
}
