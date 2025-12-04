package prPractica03;

/**
 * Libreria de metodos matematicos
 * @author Alberto Torres
 */

public class LibreriaMatematica {
	
	
	/**
	 * Metodo que comprueba si un numero es primo o no
	 * @param num
	 * @return
	 */
	public static boolean esPrimo(int num) {
		
		boolean primo = true;
		
		if(num>1) {
			for(int cont=2;cont<=num/2;cont++) {
				if(num%cont==0 && primo==true)
					primo=false;
			}
		}
		
		return primo;
	}
	
	
	/**
	 * Metodo que calcula el factorial de un numero n, recibido como parametro
	 *   Factorial(0) = 1
	 *   Factorial(n) = n x (n-1) x (n-2) x .... 1
	 * @param num --> parametro al que se calculara el factoral
	 * @return --> valor devuelto por el metodo, en este caso el factorial calculado
	 * 			--> si num es negativo, vamos a devolver -1
	 */
	public static long factorial (int num) {
		
		//Variables locales al metodo
		long fact=1;
		
		if(num<0) {
			return -1;
		}            
		else {			
			for(int cont=2;cont<=num;cont++) {
				fact*=cont;
			}
		}
		return fact;
	}
	
	/**
	 * Metodo que calcula dos numeros combinatorios "a sobre b"
	 * Se debe cumplir a ≥ b, a ≥ 0 y b ≥ 0
	 * @param a
	 * @param b
	 * @return el calculo del resultado o -1 si no se cumplen las condiciones anteriores
	 */
	public static double combinatorio (int a, int b) {
		
		//Se debe cumplir a ≥ b, a ≥ 0 y b ≥ 0 para poder realizar el calculo
		
		if((a<b)||(a<0)||(b<0)) {
			return -1;
		}
		return (double)factorial(a)/(factorial(b)*factorial(a-b));
	}
	
	/**
	 * Metodo privado para sumar los divisores de un numero
	 * @param num
	 * @return
	 */
	private static int sumaDiv(int num) {
		int suma=1;
		for(int cont=2;cont<=num/2;cont++) {
			if(num%cont==0)
				suma=suma+cont;
		}
	
		return suma;
	}
	
	/**
	 * Metodo para comprobar si un numero es perfecto
	 * @param num
	 * @return
	 */
	public static boolean perfecto(int num) {
		if(num==sumaDiv(num))
			return true;
		return false;
		
		//return num == sumaDiv(num);
	}
	
	
	/**
	 * Metodo que comprueba si dos numeros son amigos
	 * @param num1
	 * @param num2
	 * @return
	 */
	public static boolean isAmigos(int num1, int num2) {
		if((sumaDiv(num1)==num2)&&(sumaDiv(num2)==num1))
			return true;
		return false;
	}
	
	
	/**
	 * Metodo que comprueba si dos numeros son primos entre si
	 * @param num1
	 * @param num2
	 * @return
	 */
	public static boolean primosEntre(int num1, int num2) {
		boolean primoEntre=true;
		int cont=2, menor=1;
		if(num2<num1)
			menor=num2;
		else
			menor=num1;
		while((primoEntre)&&(cont<=menor)) {
			if((num1%cont==0)&&(num2%cont==0))
				primoEntre=false;
			cont++;
		}
		return primoEntre;
	}
	
	/**
	 * Metodo que calcula la funcion de Euler
	 * @param num
	 * @return
	 */
	public static int euler (int num) {
		int euler=0;
		for(int cont=1;cont<num;cont++) {
			if(primosEntre(num, cont))
				euler++;
		}
		return euler;
	}
	
	
	/**
	 * Metodo que calcula el maximo comun divisor de dos numeros
	 * @param num1
	 * @param num2
	 * @return
	 */
	public static int mcd(int num1, int num2) {
		int mcd=1;
		for(int cont=2;cont<=Math.min(num1, num2);cont++) {
			if((num1%cont==0)&&(num2%cont==0))
				mcd=cont;
		}
		return mcd;
	}
	
	
	/**
	 * Metodo que calcula el maximo comun divisor de forma recursiva
	 * @param num1
	 * @param num2
	 * @return
	 */
	public static int mcdR(int num1, int num2) {
		int mcd=1;
		if(num1==num2)
			mcd=num1;
		else if(num1>num2)
			mcd=mcdR(num1-num2, num2);
		else
			mcd=mcdR(num1, num2-num1);
		
		return mcd;
	}
	
	
	/**
	 * Metodo que calcula el fibonacci de un numero
	 * @param num
	 * @return
	 */
	public static int fibonacci (int num) {
		int aux1=1, aux2=1,fib=1;
		for (int cont=2; cont<=num;cont++) {
			fib=aux1+aux2;
			aux1=aux2;
			aux2=fib;
		}
		return fib;
	}
	
	/**
	 * Metodo que calcula el fibonacci de un numero de forma recursiva
	 * @param num
	 * @return
	 */
	public static int fibonacciR(int num) {
		if(num==0||num==1)
			return 1;
		return fibonacciR(num-1)+fibonacciR(num-2);
	}
	
	
	/**
	 * Metodo que calcula la potencia de un numero
	 * @param num
	 * @param exp
	 * @return
	 */
	public static int potencia(int num, int exp) {
		if (exp == 0) 
			return 1;
		else if (exp<0)
			return -1;
		else 
			return num * potencia(num, exp-1);
		
	}
	
	/**
	 * Metodo que calcula la suma de la serie de fibonacci
	 * @param num
	 * @return
	 */
	public static int sumaFibonacci(int num) {
		if(num==0)
			return 1;
		
		return fibonacciR(num)+sumaFibonacci(num-1);
	}
}
