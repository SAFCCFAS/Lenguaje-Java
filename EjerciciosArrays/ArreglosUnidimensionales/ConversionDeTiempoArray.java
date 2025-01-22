package EjerciciosArrays.ArreglosUnidimensionales;

import java.util.Scanner;

public class ConversionDeTiempoArray {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		String[] unidades = {"Segundo", "Minuto", "Hora", "Día", "Año"};
		double[] segundos = {1 / 60.0, 1 / 3600.0, 1 / 86400.0, 1 / 31536000.0}; // Minutos, Horas, Días, Años
		double[] minutos = {60.0, 1 / 60.0, 1 / 1440.0, 1 / 525600.0}; // Segundos, Horas, Días, Años
		double[] horas = {3600.0, 60.0, 1 / 24.0, 1 / 8760.0}; // Segundos, Minutos, Días, Años
		double[] dias = {86400.0, 1440.0, 24.0, 1 / 365.0}; // Segundos, Minutos, Horas, Años
		double[] anos = {31536000.0, 525600.0, 8760.0, 365.0}; // Segundos, Minutos, Horas, Días
		double[] valor = new double[1];
		int contar, unidad;
		String eleccion, tiempo;
		boolean ingresoValido;
		double resultado;

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
			unidad = Integer.parseInt(eleccion);
			eleccion = unidades[unidad - 1];
			System.out.printf("Ha elegido convertir %s(s).%n", eleccion);
			while (true) {
				tiempo = unidades[unidad - 1];
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
					if (!destino.equals(unidades[unidad - 1])) {
						System.out.printf("%d. %s(s).\n", contar++, destino);
					}
				}
				break;
			}
			eleccion = sc.nextLine().trim();
			ingresoValido = !eleccion.trim().isEmpty() && eleccion.matches("[1-" + contar + "]");
			if (!ingresoValido) {
				System.err.printf("Error: La opción ingresada no es válida. Por favor, elija una opción entre 1 y %d.%n", unidades.length - 1);
				continue;
			}
		}
	}
}