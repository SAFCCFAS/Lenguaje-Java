package Ejercicios.Calculadoras;

import java.util.Scanner;

public class CalculadoraGeometrica_v1 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String figura, categoria, medida, medidaDestino, simbMed, eleccion, entrada;
		int opc, fig, contar, origen, unidad, destino;
		double valor = 0, valor1 = 0, valor2 = 0, valor3 = 0, area, perimetro, conversion = 0;

		while (true) { // repetir el menú hasta que se ingrese la opción correcta
			System.out.println("Bienvenido(a) favor indicar que desea realizar:\n1. Calcular área. \n2. Calcular perímetro.\n3. Conversión de unidades.");
			System.out.println("4. Salir.");
			eleccion = sc.nextLine().trim();
			if (eleccion.trim().isEmpty() || !eleccion.matches("[1-4]")) {
				System.err.println("Error: Opción o ingreso no válido, favor use las opciones dentro del rango.");
				continue;
			} else if (eleccion.equals("4")) {
				System.out.println("¡Hasta la próxima!");
				break;
			}
			opc = Integer.parseInt(eleccion);

			switch (opc) {
				case 1 -> {
					while (true) {
						System.out.println("Favor elija la figura a calcular área:");
						System.out.println("1. Cuadrado.\n2. Rectángulo.\n3. Triángulo.\n4. Círculo.\n5. Trapecio.\n6. Rombo.\n7. Polígono regular.");
						System.out.println("8. Octágono.\n9. Regresa menú anterior");
						eleccion = sc.nextLine().trim();
						if (eleccion.trim().isEmpty() || !eleccion.matches("[1-9]")) {
							System.err.println("Error: Opción o ingreso no válido, favor use las opciones dentro del rango.");
							continue;
						} else if (eleccion.equals("9")) {
							System.out.println("Regresando al menú anterior...");
							break;
						}
						fig = Integer.parseInt(eleccion);
						figura = switch (fig) { // asignar nombre a la figura correspodiente.
							case 1 -> "Cuadrado";
							case 2 -> "Rectángulo";
							case 3 -> "Triángulo";
							case 4 -> "Círculo";
							case 5 -> "Trapecio";
							case 6 -> "Rombo";
							case 7 -> "Polígono regular";
							default -> "Octágono";
						};
						System.out.println("Usted a elegido " + figura);

						switch (fig) {
							case 1, 4, 8 -> {
								while (true) {
									System.out.print("Favor, ingrese ");
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
									area = switch (fig) {
										case 1 -> Math.pow(valor, 2);
										case 4 -> (Math.PI * Math.pow(valor, 2));
										default -> ((2 + 4 / Math.sqrt(2)) * Math.pow(valor, 2));
									};
									System.out.printf("El área del %s es: %.2f%n", figura, area);
									break;
								}
							}
							case 2, 6, 7 -> {
								for (contar = 0; contar < 2; contar++) {
									while (true) {
										System.out.print("Favor, ingrese ");
										switch (fig) {
											case 2 -> System.out.printf("%s %s:%n", contar == 0 ? "largo" : "ancho", figura);
											case 6 -> System.out.printf("diagonal %d del %s:%n", contar + 1, figura);
											default -> System.out.printf("%s del %s:%n", contar == 0 ? "número de lados" : "largo de cada largo", figura);
										}
										entrada = sc.nextLine().trim();
										if (entrada.isEmpty() || !entrada.matches("\\d+(\\.\\d+)?") || Double.parseDouble(entrada) <= 0) {
											System.err.println("Error: Ingreso no válido, favor ingrese un número mayor a 0.");
											continue;
										}
										if (contar == 0) {
											valor = Double.parseDouble(entrada);
										} else if (contar == 1) {
											valor1 = Double.parseDouble(entrada);
										}
										break;
									}
								}
								area = switch (fig) {
									case 2 -> (valor * valor1);
									case 6 -> ((valor * valor1) / 2);
									default -> ((valor * Math.pow(valor1, 2)) / (4 * Math.tan(Math.PI / valor)));
								};
								System.out.printf("El área del %s es: %.2f%n", figura, area);
							}
							case 3, 5 -> {
								for (contar = 0; contar < (fig == 3 ? 2 : 3); contar++) {
									while (true) {
										System.out.print("Favor, ingrese ");
										switch (fig) {
											case 3 -> System.out.printf("%s del %s:%n", contar == 0 ? "base" : "altura", figura);
											default -> System.out.printf("%s del %s:%n", contar == 0 ? "base mayor" : contar == 1 ? "base menor" : "altura", figura);
										}
										entrada = sc.nextLine().trim();
										if (entrada.isEmpty() || !entrada.matches("\\d+(\\.\\d+)?") || Double.parseDouble(entrada) <= 0) {
											System.err.println("Error: Ingreso no válido, favor ingrese un número mayor a 0.");
											continue;
										}
										switch (contar) {
											case 0 -> valor = Double.parseDouble(entrada);
											case 1 -> valor1 = Double.parseDouble(entrada);
											default -> valor2 = Double.parseDouble(entrada);
										}
										break;
									}
								}
								area = switch (fig) {
									case 3 -> ((valor * valor1) / 2);
									default -> (((valor + valor1) / 2) * valor2);
								};
								System.out.printf("El área del %s es: %.2f%n", figura, area);
							}
						}
						return;
					}
				}
				case 2 ->{
					while (true) { 
						System.out.println("Favor elija la figura a calcular perímetro:");
						System.out.println("1. Cuadrado.\n2. Rectángulo.\n3. Triángulo.\n4. Círculo.\n5. Trapecio.\n6. Rombo.\n7. Polígono regular.");
						System.out.println("8. Octágono.\n9. Regresa menú anterior");
						eleccion = sc.nextLine().trim();
						if (eleccion.trim().isEmpty() || !eleccion.matches("[1-9]")) {
							System.err.println("Error: Opción o ingreso no válido, favor use las opciones dentro del rango.");
							continue;
						} else if (eleccion.equals("9")) {
							System.out.println("Regresando al menú anterior...");
							break;
						}
						fig = Integer.parseInt(eleccion);
						figura = switch (fig) { // asignar nombre a la figura correspodiente.
							case 1 -> "Cuadrado";
							case 2 -> "Rectángulo";
							case 3 -> "Triángulo";
							case 4 -> "Círculo";
							case 5 -> "Trapecio";
							case 6 -> "Rombo";
							case 7 -> "Polígono regular";
							default -> "Octágono";
						};
						System.out.println("Usted a elegido " + figura);
						
					}
				}
			}
		}
	}
}
