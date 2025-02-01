package Ejercicios.Cadenas;

import java.util.Scanner;

public class InvertirOrden {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String entrada, invertido = "";
		int orden;

		while (true) {
			System.out.println("Ingrese texto o cifra a invertir:");
			entrada = sc.nextLine();
			if (entrada.trim().isEmpty()) {
				System.err.println("Ingreso no válido, intente nuevamente");
				continue;
			}
			break;
		}

		for (orden = entrada.length() - 1; orden >= 0; orden--) {
			invertido = invertido + entrada.charAt(orden);
		}

		System.out.println(invertido);

	}
}
