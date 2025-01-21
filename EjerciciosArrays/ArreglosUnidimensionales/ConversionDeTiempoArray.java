package EjerciciosArrays.ArreglosUnidimensionales;

import java.util.Scanner;

public class ConversionDeTiempoArray {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		String[] unidades = {"Segundo", "Minuto", "Hora", "Día", "Año"};
		int contar,unidad;
		String eleccion;
		boolean ingresoValido;

		while (true) {
			contar = 1;
			System.out.println("Bienvenido(a), favor elija la unidad de tiempo a convertir:");
			for (String menu : unidades) {
				System.out.printf("%d. %s(s).\n", contar++, menu);
			}
			System.out.printf("%d. Salir.\n", contar);
			eleccion = sc.nextLine().trim();
			ingresoValido = !eleccion.trim().isEmpty() && eleccion.matches("[1-" + contar + "]");
			if (!ingresoValido){
				System.err.printf("Error: La opción ingresada no es válida. Por favor, elija una opción entre 1 y %d.%n", unidades.length + 1);
				continue;
			} else if (Integer.parseInt(eleccion) == contar) {
				System.out.println("¡Gracias por usar el programa, hasta la próxima!");
				break;
			}
			unidad=Integer.parseInt(eleccion);
			eleccion = unidades[unidad-1];
			System.out.printf("Ha elegido convertir %s(s).%n", eleccion);
		}
	}
}