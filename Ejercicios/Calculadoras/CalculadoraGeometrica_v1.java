package Ejercicios.Calculadoras;

import java.util.Scanner;

public class CalculadoraGeometrica_v1 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String figura, categoria, medida, simbMed, eleccion, entrada;
		int opc, fig, contar, origen, unidad, destino;
		double valor = 0, valor1 = 0, valor2 = 0, valor3 = 0, resultado;

		while (true) {
			System.out.println("Bienvenido(a), favor elija la opción de utilizar:");
			System.out.println("1. Calcular área. \n2. Calcular perímetro.\n3. Conversión de unidades.\n4. Salir.");
			eleccion = sc.nextLine().trim();
			if (eleccion.trim().isEmpty() || !eleccion.matches("[1-4]")) {
				System.err.println("Error: Opción o ingreso no válido, favor use las opciones dentro del rango.");
				continue;
			} else if (Integer.parseInt(eleccion) == 4) {
				System.out.println("¡Hasta la próxima!");
				break;
			}
			opc = Integer.parseInt(eleccion);
			switch (opc) {
				case 1 -> {
					while (true) {
						System.out.println("Favor, elija la figura a calcular area:\n1. Cuadrado.\n2. Rectángulo.\n3. Triángulo.\n4. Círculo.\n5. Trapecio.");
						System.out.println("6. Rombo.\n7. Polígono regular.\n8. Octágono.\n9. Regresa menú anterior");
						eleccion = sc.nextLine().trim();
						if (eleccion.trim().isEmpty() || !eleccion.matches("[1-9]")) {
							System.err.println("Error: Opción o ingreso no válido, favor use las opciones dentro del rango.");
							continue;
						} else if (Integer.parseInt(eleccion) == 9) {
							System.out.println("Regresando al menú anterior...");
							break;
						}
						fig = Integer.parseInt(eleccion);
						figura = switch (fig) {
							case 1 -> "Cuadrado";
							case 2 -> "Rectángulo";
							case 3 -> "Triángulo";
							case 4 -> "Círculo";
							case 5 -> "Trapecio";
							case 6 -> "Rombo";
							case 7 -> "Polígono regular";
							default -> "Octágono";
						};
						System.out.printf("Usted a elegido: %s%n", figura);
						while (true) {
							System.out.print("Favor, ingrese ");
							switch (fig) {
								case 1, 4, 8 -> {
									switch (fig) {
										case 1 -> System.out.printf("lado del %s:%n", figura);
										case 4 -> System.out.printf("radio del %s:%n", figura);
										default -> System.out.printf("longitud del lado del %s:%n", figura);
									}
									entrada = sc.nextLine().trim();
									if (entrada.isEmpty() || !entrada.matches("\\d+(\\.\\d+)?") || Double.parseDouble(entrada) <= 0) {
										System.err.println("Error: Ingreso no válido, favor ingrese un número mayor a 0.");
										continue;
									}
									valor = Double.parseDouble(entrada);

								}
							}
							return; // en este punto es mejor terminar el programa para no hacer el código más complejo.
						}
					}
				}
			}
		}
	}
}