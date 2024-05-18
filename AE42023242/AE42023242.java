package AE42023242;

/**
 * @author Raul San Juan
 * @version 1.1
 */

import java.util.Scanner;

public class AE42023242 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		/**
		 * Declaramos las variables numero1 y numero2
		 */
		int numero1;

		int numero2;

		/**
		 * La variable resultado se va inicializando en funcion de los metodos que se
		 * ejecuten
		 */
		int resultado;

		/**
		 * Inicializamos las variables.
		 * 
		 * No hemos sacado el metodo de pedir las variables ya que no genera confusion
		 * al leer el programa.
		 */
		System.out.println("Escribe el primer numero: ");
		numero1 = teclado.nextInt();
		System.out.println("Escribe el segundo numero: ");
		numero2 = teclado.nextInt();

		suma(numero1, numero2);

		resta(numero1, numero2);

		multiplicar(numero1, numero2);

		division(numero1, numero2);

	}

	/**
	 * Operacion division.
	 * 
	 * @param numero1
	 * @param numero2
	 */
	public static void division(int numero1, int numero2) {
		int resultado;

		resultado = numero1 / numero2;

		System.out.println("El cociente es: " + resultado);
	}

	/**
	 * Operacion multiplicacion.
	 * 
	 * @param numero1
	 * @param numero2
	 */
	public static void multiplicar(int numero1, int numero2) {
		int resultado;

		resultado = numero1 * numero2;

		System.out.println("El producto es: " + resultado);
	}

	/**
	 * Operacion resta.
	 * 
	 * @param numero1
	 * @param numero2
	 */
	public static void resta(int numero1, int numero2) {
		int resultado;
		resultado = numero1 - numero2;

		System.out.println("La resta es: " + resultado);
	}

	/**
	 * Operacion suma.
	 * 
	 * @param numero1
	 * @param numero2
	 */
	public static void suma(int numero1, int numero2) {
		int resultado;
		resultado = numero1 + numero2;

		System.out.println("La suma es: " + resultado);
	}
}
