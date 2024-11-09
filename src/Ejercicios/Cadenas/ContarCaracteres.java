package Ejercicios.Cadenas;

import java.util.Scanner;

public class ContarCaracteres {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String texto;
		int longitud;
		System.out.println("Bienvenido(a) favor ingrese una palabra o frase, a continuación:");
		do {
			texto = sc.nextLine();

			if (texto.isEmpty()) {
				System.err.println("Error: No has ingresado texto alguno, intente nuevamente");
			} else {
				longitud = texto.length();
				System.out.println("El texto ingresado tiene un total de: " + longitud + " caracteres.");
				break;
			}

		} while (true);
		sc.close();

	}
}
