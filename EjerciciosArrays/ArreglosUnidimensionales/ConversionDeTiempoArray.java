package EjerciciosArrays.ArreglosUnidimensionales;

import java.util.Scanner;

public class ConversionDeTiempoArray {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		String[] unidades = { "Segundo", "Minuto", "Hora", "Día" };
		int contar;
		String eleccion;
		while (true) {
			contar = 1;
			System.out.println("Bienvenido(a), favor elija la unidad de tiempo a convertir:");
			for (String menu : unidades) {
				System.out.printf("%d. %s(s)\n", contar++, menu);
			}
			eleccion = sc.nextLine().trim();
			break;
		}

	}

}