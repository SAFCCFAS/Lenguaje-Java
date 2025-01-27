package EjerciciosArrays.ArreglosUnidimensionales;

import java.util.Scanner;

public class TablaDeOperaciones {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String[] mensajes = {"Bienvenido(a), favor ingrese número a mostrar tabla de operaciones", "Tabla de operaciones del valor"};
		String[] errorMensaje = {"Error: No se permiten entradas vacías. Intente de nuevo.", "Error: Entrada no numérica. Intente de nuevo.",
				"Error: El número debe ser mayor que 0. Intente de nuevo."};
		String[] operaciones = {"Suma", "Resta", "Multiplicación", "División"};
		int[] suma = new int[12];
		int[] resta = new int[12];
		int[] multiplicacion = new int[12];
		double[] division = new double[12];
		String entrada, marco;
		int contar, valor, longitudMarco, sumar, restar, multiplicar;
		double dividir;
		boolean ingresoValido;

		longitudMarco = mensajes[0].length();
		marco = "*".repeat(longitudMarco + 2);
		System.out.printf("%s\n*%s*\n%s\n", marco, mensajes[0], marco);

		while (true) {
			System.out.print("> ");
			entrada = sc.nextLine();
			ingresoValido = !entrada.trim().isEmpty() && entrada.matches("-?\\d+");
			if (!ingresoValido || Integer.parseInt(entrada) <= 0) {
				System.err.println(entrada.isEmpty() ? errorMensaje[0] : !entrada.matches("-?\\d+") ? errorMensaje[1] : errorMensaje[2]);
				continue;
			}
			valor = Integer.parseInt(entrada);
			break;
		}

		mensajes[1] = mensajes[1].replace("valor", String.valueOf(valor));
		longitudMarco = mensajes[1].length();
		marco = "*".repeat(longitudMarco + 2);
		System.out.printf("%s\n*%s*\n", marco, mensajes[1]);

		for (String operacionBorde : operaciones) {
			longitudMarco = operacionBorde.length();
			marco = "*".repeat(longitudMarco + 4);
			System.out.printf("%s", marco);
		}
		System.out.println();
		System.out.printf("|Número ");
		for (String operacion : operaciones) {
			System.out.printf("|%-3s ", operacion);
		}
		System.out.println("|");
		for (String operacionBorde : operaciones) {
			longitudMarco = operacionBorde.length();
			marco = "*".repeat(longitudMarco + 4);
			System.out.printf("%s", marco);
		}
		System.out.println();

		for (contar = 1; contar <= 12; contar++) {
			sumar = suma[contar - 1] = valor + contar;
			restar = resta[contar - 1] = valor - contar;
			multiplicar = multiplicacion[contar - 1] = valor * contar;
			dividir = division[contar - 1] = (double) valor / contar;

			System.out.printf("|%-7d|%-5d|%-6d|%-15d|%-9.2f|\n", contar, sumar, restar, multiplicar, dividir);
		}
		for (String operacionBorde : operaciones) {
			longitudMarco = operacionBorde.length();
			marco = "*".repeat(longitudMarco + 4);
			System.out.printf("%s", marco);
		}
		System.out.println();
	}
}