package EjerciciosArrays.ArreglosUnidimensionales;

import java.util.Scanner;

public class TablaDeMultiplicarArray {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String entrada, mensajeBienvenida = " Bienvenido(a), favor ingrese número a mostrar tabla de operaciones ";
		int[] resultados = new int[12];
		int contar, valor;
		boolean ingresoValido;


		while (true) {

			for (contar=0;contar<mensajeBienvenida.length()+2;contar++){
				System.out.print("*");
			}
			System.out.println();
			System.out.printf("*%s*\n", mensajeBienvenida);
			for (contar=0;contar<mensajeBienvenida.length()+2;contar++){
				System.out.print("*");
			}
			System.out.println();
			entrada = sc.nextLine().trim();
			ingresoValido = !entrada.trim().isEmpty() && entrada.matches("\\d+");
			if (!ingresoValido || Integer.parseInt(entrada) <= 0) {
				System.err.println("Error: Entrada no válida. Ingrese un número mayor que 0.");
				continue;
			}
			valor = Integer.parseInt(entrada);

			System.out.println("Tabla de multiplicar del " + valor + ":");

			for (contar = 0; contar < resultados.length; contar++) {
				resultados[contar] = valor * (contar + 1);
				System.out.printf("%d x %d: %d\n", valor, contar + 1, resultados[contar]);
			}

			break;
		}
	}

}