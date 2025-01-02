package Ejercicios.Calculadoras;

import java.util.Scanner;

public class CalculadoraGeometrica_v1 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String figura, categoria, medidaOrigen, medidaDestino, simbMed, eleccion, entrada;
		int opc, fig, contar, origen, unidad, destino;
		double valor = 0, valor1 = 0, valor2 = 0, valor3 = 0, area, perimetro, conversion;

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
						System.out.println("Favor elija la figura a calcular área:\n1. Cuadrado.\n2. Rectángulo.\n3. Triángulo.\n4. Círculo.\n5. Trapecio.");
						System.out.println("6. Rombo.\n7. Polígono regular.\n8. Octágono.\n9. Regresa menú anterior");
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
										if (fig == 3) {
											System.out.printf("%s del %s:%n", contar == 0 ? "base" : "altura", figura);
										} else {
											System.out.printf("%s del %s:%n", contar == 0 ? "base mayor" : contar == 1 ? "base menor" : "altura", figura);
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
						return; // en este punto teniendo en cuenta el nivel de conocimiento es preferible usar return en lugar de break.
					}
				}
				case 2 -> {
					while (true) {
						System.out.println("Favor elija la figura a calcular perímetro:\n1. Cuadrado.\n2. Rectángulo.\n3. Triángulo.\n4. Círculo.\n5. Trapecio.");
						System.out.println("6. Rombo.\n7. Polígono regular.\n8. Octágono.\n9. Regresa menú anterior");
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
										default -> System.out.printf("Longitud del lado del %s:%n", figura);
									}
									entrada = sc.nextLine().trim();
									if (entrada.isEmpty() || !entrada.matches("\\d+(\\.\\d+)?") || Double.parseDouble(entrada) <= 0) {
										System.err.println("Error: Ingreso no válido, favor ingrese un número mayor a 0.");
										continue;
									}
									valor = Double.parseDouble(entrada);
									perimetro = switch (fig) {
										case 1 -> (4 * valor);
										case 4 -> (2 * Math.PI * valor);
										default -> (8 * valor);
									};
									System.out.printf("El perímetro del %s es: %.2f%n", figura, perimetro);
									break;
								}
							}
							case 2, 6, 7 -> {
								for (contar = 0; contar < (fig == 2 ? 2 : fig == 6 ? 1 : 2); contar++) {
									while (true) {
										System.out.print("Favor, ingrese ");
										switch (fig) {
											case 2 -> System.out.printf("%s del %s:%n", contar == 0 ? "largo" : "ancho", figura);
											case 6 -> System.out.printf("longitud del largo del %s", figura);
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
								perimetro = switch (fig) {
									case 2 -> (2 * (valor + valor1));
									case 6 -> (valor * 4);
									default -> (valor * valor1);
								};
								System.out.printf("El perímetro del %s es: %.2f%n", figura, perimetro);
							}
							case 3, 5 -> {
								for (contar = 0; contar < (fig == 3 ? 3 : 4); contar++) {
									while (true) {
										System.out.print("Favor, ingrese ");
										if (fig == 3) {
											System.out.printf("lado %d del %s:%n", contar + 1, figura);
										} else {
											System.out.print("longitud ");
											if (contar == 0) {
												System.out.printf("de la base %s del %s:%n", contar == 0 ? "mayor" : "menor", figura);
											} else {
												System.out.printf("del lado %s del %s:%n", contar == 1 ? "derecho" : "izquierdo", figura);
											}
										}
										entrada = sc.nextLine().trim();
										if (entrada.isEmpty() || !entrada.matches("\\d+(\\.\\d+)?") || Double.parseDouble(entrada) <= 0) {
											System.err.println("Error: Ingreso no válido, favor ingrese un número mayor a 0.");
											continue;
										}
										switch (contar) {
											case 0 -> valor = Double.parseDouble(entrada);
											case 1 -> valor1 = Double.parseDouble(entrada);
											case 2 -> valor2 = Double.parseDouble(entrada);
											default -> valor3 = Double.parseDouble(entrada);
										}
										break;
									}
								}
								perimetro = switch (fig) {
									case 3 -> (valor + valor1 + valor2);
									default -> (valor + valor1 + valor2 + valor3);
								};
								System.out.printf("El perímetro del %s es: %.2f%n", figura, perimetro);
							}
						}
						return;
					}
				}
				case 3 -> {
					while (true) {
						System.out.println("Favor elija la categoría de unidad a convertir:\n1. Longitud (km, m, cm, mm).\n2. Área (km², m², cm²).");
						System.out.println("3. Ángulos (Grados a Radianes, Radianes a Grados).\n4. Regresar al menú principal.");
						eleccion = sc.nextLine().trim();
						if (eleccion.trim().isEmpty() || !eleccion.matches("[1-4]")) {
							System.err.println("Error: Opción o ingreso no válido, favor use las opciones dentro del rango.");
							continue;
						} else if (eleccion.equals("4")) {
							System.out.println("Regresando al menú anterior...");
							break;
						}
						origen = Integer.parseInt(eleccion);
						categoria = switch (origen) {
							case 1 -> "Longitud";
							case 2 -> "Área";
							default -> "Ángulos";
						};
						System.out.println("Usted a elegido " + categoria);
						switch (origen) {
							case 1 -> {
								while (true) {
									System.out.println("Favor indique la unidad a convertir:\n1. Kilómetro (km).\n2. Metro (m).\n3. Centímetro (cm).");
									System.out.println("4. Milímetro (mm).\n5. Regresar al menú anterior.");
									eleccion = sc.nextLine().trim();
									if (eleccion.trim().isEmpty() || !eleccion.matches("[1-5]")) {
										System.err.println("Error: Opción o ingreso no válido, favor use las opciones dentro del rango.");
										continue;
									} else if (eleccion.equals("5")) {
										System.out.println("Regresando al menú anterior...");
										break;
									}
									unidad = Integer.parseInt(eleccion);
									medidaOrigen = switch (unidad) {
										case 1 -> "Kilómetro";
										case 2 -> "Metro";
										case 3 -> "Centímetro";
										default -> "Milímetro";
									};
									simbMed = switch (unidad) {
										case 1 -> "km";
										case 2 -> "m";
										case 3 -> "cm";
										default -> "mm";
									};
									while (true) {
										System.out.printf("Favor, ingrese la %s en %s (%s):%n", categoria, medidaOrigen, simbMed);
										entrada = sc.nextLine().trim();
										if (entrada.isEmpty() || !entrada.matches("\\d+(\\.\\d+)?")) {
											System.err.println("Error: Ingreso no válido, favor ingrese un número.");
											continue;
										} else if (entrada.equals("0")) {
											System.err.println("Error: Ingreso no válido, favor ingrese un número mayor a 0.");
											continue;
										}
										valor = Double.parseDouble(entrada);
										break;
									}
									System.out.println("Favor, indique la unidad a de destino:");
									switch (unidad) {
										case 1 -> System.out.println("1. Metro (m).\n2. Centímetro (cm).\n3. Milímetro (mm).");
										case 2 -> System.out.println("1. Kilómetro (km).\n2. Centímetro (cm).\n3. Milímetro (mm).");
										case 3 -> System.out.println("1. Kilómetro (km).\n2. Metro (m).\n3. Milímetro (mm).");
										default -> System.out.println("1. Kilómetro (km).\n2. Metro (m).\n3. Centímetro (cm).");
									}
									eleccion = sc.nextLine().trim();
									if (eleccion.isEmpty() || !eleccion.matches("[1-3]")) {
										System.err.println("Error: Opción o ingreso no válido, favor use las opciones dentro del rango.");
										continue;
									}
									destino = Integer.parseInt(eleccion);

									medidaDestino = switch (unidad) {
										case 1 -> destino == 1 ? "Metro" : destino == 2 ? "Centímetro" : "Milímetro"; // De Kilómetro a otras
										case 2 -> destino == 1 ? "Kilómetro" : destino == 2 ? "Centímetro" : "Milímetro"; // De Metro a otras
										case 3 -> destino == 1 ? "Kilómetro" : destino == 2 ? "Metro" : "Milímetro"; // De Centímetro a otras
										default -> destino == 1 ? "Kilómetro" : destino == 2 ? "Metro" : "Centímetro"; // De Milímetro a otras
									};

									conversion = switch (destino) {
										case 1 -> destino == 1 ? valor * 1000 : destino == 2 ? valor * 100000 : valor * 1000000;
										case 2 -> destino == 1 ? valor / 1000 : destino == 2 ? valor * 100 : valor * 1000;
										case 3 -> destino == 1 ? valor / 100000 : destino == 2 ? valor / 100 : valor * 10;
										default -> destino == 1 ? valor / 1000000 : destino == 2 ? valor / 1000 : valor / 10;
									};
									System.out.printf("%.2f %s a %s es: %.3f%n", valor, simbMed, medidaDestino, conversion);
									return;
								}
							}
							case 2 -> {
								while (true) {
									System.out.println("Favor indique la unidad a convertir:\n1. Kilómetro cuadrado (km²).\n2. Metro cuadrado (m²).");
									System.out.println("3. Centímetro cuadrado (cm²).\n4. Regresar al menú anterior.");
									eleccion = sc.nextLine().trim();
									if (eleccion.trim().isEmpty() || !eleccion.matches("[1-4]")) {
										System.err.println("Error: Opción o ingreso no válido, favor use las opciones dentro del rango.");
										continue;
									} else if (eleccion.equals("4")) {
										System.out.println("Regresando al menú anterior...");
										break;
									}
									unidad = Integer.parseInt(eleccion);
									medidaOrigen = switch (unidad) {
										case 1 -> "Kilómetro cuadrado";
										case 2 -> "Metro cuadrado";
										default -> "Centímetro cuadrado";
									};
									simbMed = switch (unidad) {
										case 1 -> "km²";
										case 2 -> "m²";
										default -> "cm²";
									};
									while (true) {
										System.out.printf("Favor, ingrese el %s en %s (%s):%n", categoria, medidaOrigen, simbMed);
										entrada = sc.nextLine().trim();
										if (entrada.isEmpty() || !entrada.matches("\\d+(\\.\\d+)?")) {
											System.err.println("Error: Ingreso no válido, favor ingrese un número.");
											continue;
										} else if (entrada.equals("0")) {
											System.err.println("Error: Ingreso no válido, favor ingrese un número mayor a 0.");
											continue;
										}
										valor = Double.parseDouble(entrada);
										break;
									}
									System.out.println("Favor, indique la unidad a de destino:");
									switch (unidad) {
										case 1 -> System.out.println("1. Metro cuadrado (m²).\n2. Centímetro cuadrado (cm²).");
										case 2 -> System.out.println("1. Kilómetro cuadrado (km²).\n2. Centímetro cuadrado (cm²).");
										default -> System.out.println("1. Kilómetro cuadrado (km²).\n2. Metro cuadrado (m²).");
									}
									eleccion = sc.nextLine().trim();
									if (eleccion.isEmpty() || !eleccion.matches("[1-2]")) {
										System.err.println("Error: Opción o ingreso no válido, favor use las opciones dentro del rango.");
										continue;
									}
									destino = Integer.parseInt(eleccion);

									medidaDestino = switch (unidad) {
										case 1 -> medidaDestino = destino == 1 ? "Metro cuadrado" : "Centímetro cuadrado";
										case 2 -> medidaDestino = destino == 2 ? "Kilómetro cuadrado" : "Centímetro cuadrado";
										default -> medidaDestino = destino == 3 ? "Kilómetro cuadrado" : "Metro cuadrado";
									};
									conversion = switch (destino) {
										case 1 -> destino == 1 ? valor * 1_000_000 : valor * 10_000_000;
										case 2 -> destino == 2 ? valor * 1_000_000 : valor * 10_000;
										default -> destino == 3 ? valor * 10_000_000 : valor * 10_000;
									};
									System.out.printf("%.2f %s a %s es: %.2f%n", valor, simbMed, medidaDestino, conversion);
								}
								return;
							}
							case 3 -> {
								while (true) {
									System.out.println("Favor indique la unidad a convertir:\n1. Grados.\n2. Radianes.\n3. Regresar al menú anterior.");
									eleccion = sc.nextLine().trim();
									if (eleccion.trim().isEmpty() || !eleccion.matches("[1-3]")) {
										System.err.println("Error: Opción o ingreso no válido, favor use las opciones dentro del rango.");
										continue;
									} else if (eleccion.equals("3")) {
										System.out.println("Regresando al menú anterior...");
										break;
									}
									unidad = Integer.parseInt(eleccion);
									medidaOrigen = (unidad == 1) ? "Grados" : "Radianes";
									simbMed = (unidad == 1) ? "°" : "rad";
									while (true) {
										System.out.printf("Favor, ingrese el valor en %s (%s):%n", medidaOrigen, simbMed);
										entrada = sc.nextLine().trim();
										if (entrada.isEmpty() || !entrada.matches("\\d+(\\.\\d+)?")) {
											System.err.println("Error: Ingreso no válido, favor ingrese un número.");
											continue;
										} else if (entrada.equals("0")) {
											System.err.println("Error: Ingreso no válido, favor ingrese un número mayor a 0.");
											continue;
										}
										valor = Double.parseDouble(entrada);
										break;
									}
									if (unidad == 1) {
										medidaDestino = "Radianes";
									} else {
										medidaDestino = "Grados";
									}
									System.out.printf("Pasando a %s...%n", medidaDestino);
									if (unidad == 1) {
										conversion = Math.toRadians(valor);
										System.out.printf("%.2f %s a Radianes (rad) es: %.2f%n", valor, simbMed, conversion);
									} else {
										conversion = Math.toDegrees(valor);
										System.out.printf("%.2f %s a Grados (°) es: %.2f%n", valor, simbMed, conversion);
									}
								}
								return;
							}
						}
					}
				}
			}
		}
	}
}