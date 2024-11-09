package Ejercicios;

import java.util.Scanner;

public class ContarCaracteres {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String texto;
		int longitud;
		do {
			System.out.println("Bienvenido(a) favor ingrese una palabra o frase, a continuación:");
			texto = sc.nextLine();

			longitud = texto.length();

			if (texto.isEmpty()) {
				System.err.println("Error: No has ingresado texto alguno, intente nuevamente");
			}else{
				System.out.println("El texto ingresado tiene un total de: " + longitud + " caracteres.");
				break;
			}

		} while (true);

	}
}
