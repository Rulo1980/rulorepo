package AE4202324;

import java.util.Scanner;

public class AE4202324 {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int numero1;

		int numero2;

		int resultado;

		System.out.println("Escribe el primer numero: ");
		numero1 = teclado.nextInt();
		System.out.println("Escribe el segundo numero: ");
		numero2 = teclado.nextInt();

		resultado = numero1 + numero2;

		System.out.println("La suma es: " + resultado);

		resultado = numero1 - numero2;

		System.out.println("La resta es: " + resultado);

		resultado = numero1 * numero2;

		System.out.println("El producto es: " + resultado);

		resultado = numero1 / numero2;

		System.out.println("El cociente es: " + resultado);

	}
}
