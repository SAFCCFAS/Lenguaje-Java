package EjerciciosArrays.ArreglosUnidimensionales;

import java.util.Scanner;

public class TablaDeOperaciones {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String[] mensajes = {"Bienvenido(a), favor ingrese número a mostrar tabla de operaciones", "Tabla de operaciones del valor"};
		String[] errorMensaje = {"Error: No se permiten entradas vacías. Intente de nuevo.", "Error: Entrada no numérica. Intente de nuevo.",
				"Error: El número debe ser mayor que 0. Intente de nuevo."};
		int[] suma = new int[12];
		int[] resta = new int[12];
		int[] multiplicacion = new int[12];
		double[] division = new double[12];
		String entrada;
		int contar, valor;
		boolean ingresoValido;

		for (contar = 0; contar < mensajes[0].length() + 2; contar++) {
			System.out.print("*");
		}
		System.out.println();
		System.out.printf("*%s*\n", mensajes[0]);
		for (contar = 0; contar < mensajes[0].length() + 2; contar++) {
			System.out.print("*");
		}
		System.out.println();
		while (true) {
			System.out.print("> ");

			entrada = sc.nextLine().trim();
			ingresoValido = !entrada.isEmpty() && entrada.matches("-?\\d+");
			if (!ingresoValido || Integer.parseInt(entrada) <= 0) {
				System.err.println(entrada.isEmpty() ? errorMensaje[0] : !entrada.matches("-?\\d+") ? errorMensaje[1] : errorMensaje[2]);
				continue;
			}
			valor = Integer.parseInt(entrada);
			break;
		}
		for (contar = 0; contar < mensajes[1].length() - 2; contar++) {
			System.out.print("*");
		}
		System.out.println();
		System.out.printf("*%s*\n", mensajes[1] = mensajes[1].replace("valor", String.valueOf(valor)));
		for (contar = 0; contar < mensajes[1].length() + 2; contar++) {
			System.out.print("*");
		}
		System.out.println();

	}
}