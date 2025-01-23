package EjerciciosArrays.ArreglosUnidimensionales;

import java.util.Scanner;

public class ConversionDeTiempoArray {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		String[] unidades = {"Segundo", "Minuto", "Hora", "Día", "Año"};
		double[] segundos = {1 / 60.0, 1 / 3600.0, 86400.0, 31536000.0}; // Minutos, Horas, Días, Años
		double[] minutos = {60.0, 1 / 60.0, 1 / 1440.0, 1 / 525600.0}; // Segundos, Horas, Días, Años
		double[] horas = {3600.0, 60.0, 1 / 24.0, 1 / 8760.0}; // Segundos, Minutos, Días, Años
		double[] dias = {86400.0, 1440.0, 24.0, 1 / 365.0}; // Segundos, Minutos, Horas, Años
		double[] anos = {31536000.0, 525600.0, 8760.0, 365.0}; // Segundos, Minutos, Horas, Días
		double[] valor = new double[1];
		int contar, unidadOrigen, unidadDdestino, destinoIndice;
		String eleccion, tiempo, nombreOrigen, nombreDestino, formato;
		boolean ingresoValido;
		double resultado, factor;

		while (true) {
			contar = 1;
			System.out.println("Bienvenido(a), favor elija la unidad de tiempo a convertir:");
			for (String menu : unidades) {
				System.out.printf("%d. %s(s).\n", contar++, menu);
			}
			System.out.printf("%d. Salir.\n", contar);
			eleccion = sc.nextLine().trim();
			ingresoValido = !eleccion.trim().isEmpty() && eleccion.matches("[1-" + contar + "]");
			if (!ingresoValido) {
				System.err.printf("Error: La opción ingresada no es válida. Por favor, elija una opción entre 1 y %d.%n", unidades.length + 1);
				continue;
			} else if (Integer.parseInt(eleccion) == contar) {
				System.out.println("¡Gracias por usar el programa, hasta la próxima!");
				break;
			}
			unidadOrigen = Integer.parseInt(eleccion);
			nombreOrigen = unidades[unidadOrigen - 1];
			System.out.printf("Ha elegido convertir %s(s).%n", nombreOrigen);
			while (true) {
				tiempo = unidades[unidadOrigen - 1];
				System.out.printf("Favor cantidad de tiempo en %s(s):\n", tiempo);
				tiempo = sc.nextLine().trim();
				ingresoValido = !tiempo.trim().isEmpty() && tiempo.matches("\\d+(\\.\\d+)?");
				if (!ingresoValido || Double.parseDouble(tiempo) <= 0) {
					System.err.println("Error: Entrada no válida. Ingrese un número mayor que 0.");
					continue;
				}
				break;
			}
			valor[0] = Double.parseDouble(tiempo);
			while (true) {
				contar = 1;
				System.out.println("Favor elija unidad de destino:");
				for (String destino : unidades) {
					if (!destino.equals(unidades[unidadOrigen - 1])) {
						System.out.printf("%d. %s(s).\n", contar++, destino);
					}
				}
				System.out.printf("%d. Regresar al menú anterior.\n", contar);
				eleccion = sc.nextLine().trim();
				ingresoValido = !eleccion.trim().isEmpty() && eleccion.matches("[1-" + contar + "]");
				if (!ingresoValido) {
					System.err.printf("Error: La opción ingresada no es válida. Por favor, elija una opción entre 1 y %d.%n", unidades.length);
					continue;
				}
				unidadDdestino = Integer.parseInt(eleccion);
				break;
			}

			nombreDestino = unidades[unidadDdestino];
			destinoIndice = unidadDdestino - 1;

			factor = switch (unidadOrigen) {
				case 1 -> segundos[destinoIndice];  // Segundos
				case 2 -> minutos[destinoIndice];   // Minutos
				case 3 -> horas[destinoIndice];     // Horas
				case 4 -> dias[destinoIndice];      // Días
				default -> anos[destinoIndice];      // Años
			};

			resultado = valor[0] * factor;

			contar = (factor <= 1) ? 2 : 6;
			formato = "%." + contar + "f";

			System.out.printf("%.1f %s(s) equivale a " + formato + " %s(s)\n", valor[0], nombreOrigen, resultado, nombreDestino);
		}
	}
}