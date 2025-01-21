package EjerciciosArrays.ArreglosMultidimensional;

import java.util.Scanner;

public class CalculadoraGeometricaArray {

    static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String[] opciones = {"Calcular área", "Calcular Perímetro", "Conversión de unidades"};
		String[] nombreFiguras = {"Cuadrado", "Rectángulo", "Triángulo", "Círculo", "Trapecio", "Rombo", "Polígono Regular", "Octágono"};
		String[] opcionConversiones = {"Longitud", "Área", "Ángulo"};
		String[][] nombreUnidades = {{"Kilómetro", "Metro", "Centímetro", "Milímetro"}, {"Cuadrado"}, {"Grados", "Radianes"}};
		String[][] simbUnidades = {{"km", "m", "cm", "mm"}, {"km²", "m²", "cm²"}, {"°", "Rad"}};
		String[][] entradaArea = {{"lado"}, {"largo", "ancho"}, {"base", "altura"}, {"radio"}, {"base mayor", "base menor", "altura"},
						{"diagonal mayor", "diagonal menor"}, {"número de lados", "largo de cada lado"}, {"lado"}};
		String[][] entradaPerimetro = {{"lado"}, {"largo", "ancho"}, {"lado 1", "lado 2", "lado 3"}, {"radio"},
						{"base mayor", "base menor", "lado derecho", "lado izquierdo"}, {"lado"}, {"Número de lados", "Largo de cada lado"}, {"lado"}};
		double[][] factoresConversionLongitudes = {{1000.0, 100000.0, 1000000.0}, {0.001, 100.0, 1000.0}, {0.00001, 0.01, 10.0}, {0.000001, 0.001, 0.1}};
		double[][] factoresConversionArea = {{1000000.0, 100000000.0}, {0.000001, 10000.0}, {0.00000001, 0.0001}};
		double[][] factoresConversionAngulos = {{Math.PI / 180.0}, {180.0 / Math.PI}};
		String[][] cambioUnidades;
		double[] valores = new double[4];
		double areas, perimetros, resultado, factor;
		String[] solicitudes, unidadOrigen;
		String eleccion, solicitud, valor, simboloOrigen, unidadNombre, unidadSimbolo, unidadDestino, simboloDestino, formato;
		int opcion, figura, origen, unidadCambio, indiceCambio, destino = 0, contar, unidad, origenIndice, destinoIndice;
		boolean ingresoValido;

		while (true) {
			contar = 1;
			System.out.println("Bienvenido(a), favor elija la opción a utilizar:");
			for (String menu : opciones) {
				System.out.printf("%d. %s.\n", contar++, menu);
			}
			System.out.printf("%d. Salir.\n", contar);
			eleccion = sc.nextLine().trim();
			ingresoValido = !eleccion.trim().isEmpty() && eleccion.matches("[1-" + contar + "]");
			if (!ingresoValido) {
				System.err.printf("Error: La opción ingresada no es válida. Por favor, elija una opción entre 1 y %d.%n", opciones.length + 1);
				continue;
			} else if (Integer.parseInt(eleccion) == contar) {
				System.out.println("¡Gracias por usar el programa, hasta la próxima!");
				break;
			}
			opcion = Integer.parseInt(eleccion);
			eleccion = opciones[opcion - 1];
			System.out.printf("Usted a ha elegido: %s\n", eleccion);
			switch (opcion) {
				case 1, 2 -> {
					while (true) {
						contar = 1;
						solicitud = opciones[opcion - 1];
						System.out.printf("Favor elija la figura a %s\n", solicitud);
						for (String figuras : nombreFiguras) {
							System.out.printf("%d. %s.\n", contar++, figuras);
						}
						System.out.printf("%d. Regresar al menú anterior.\n", contar);
						eleccion = sc.nextLine().trim();
						ingresoValido = !eleccion.trim().isEmpty() && eleccion.matches("[1-" + contar + "]");
						if (!ingresoValido) {
							System.err.printf("Error: La opción ingresada no es válida. Por favor, elija una opción entre 1 y %d.%n", nombreFiguras.length + 1);
							continue;
						} else if (Integer.parseInt(eleccion) == contar) {
							System.out.println("Regresando al menú anterior...");
							break;
						}
						figura = Integer.parseInt(eleccion);
						eleccion = nombreFiguras[figura - 1];
						System.out.printf("Usted a ha elegido: %s\n", eleccion);
						solicitudes = opcion == 1 ? entradaArea[figura - 1] : entradaPerimetro[figura - 1];
						contar = 0;
						for (String entrada : solicitudes) {
							solicitud = entrada;
							while (true) {
								System.out.printf("Favor, ingrese %s del %s:\n", solicitud, eleccion);
								valor = sc.nextLine().trim();
								ingresoValido = !valor.trim().isEmpty() && valor.matches("\\d+(\\.\\d+)?");
								if (!ingresoValido || Double.parseDouble(valor) <= 0) {
									System.err.println("Error: Entrada no válida. Ingrese un número mayor que 0.");
									continue;
								}
								break;
							}
							valores[contar] = Double.parseDouble(valor);
							contar++;
						}
						areas = switch (figura) {
							case 1 -> Math.pow(valores[0], 2);
							case 2 -> valores[0] * valores[1];
							case 3, 6 -> (valores[0] * valores[1]) / 2;
							case 4 -> Math.PI * Math.pow(valores[0], 2);
							case 5 -> ((valores[0] + valores[1]) / 2) * valores[2];
							case 7 -> (valores[0] * Math.pow(valores[1], 2)) / (4 * Math.tan(Math.PI / valores[0]));
							default -> (2 + 4 / Math.sqrt(2)) * Math.pow(valores[0], 2);
						};

						perimetros = switch (figura) {
							case 1, 6 -> valores[0] * 4;
							case 2 -> 2 * (valores[0] + valores[1]);
							case 3 -> valores[0] + valores[1] + valores[2];
							case 4 -> 2 * Math.PI * valores[0];
							case 5 -> valores[0] + valores[1] + valores[2] + valores[3];
							case 7 -> valores[0] * valores[1];
							default -> valores[0] * 8;
						};
						System.out.printf("El %s del %s es: %.2f%n", opcion == 1 ? "área" : "perímetro", eleccion, opcion == 1 ? areas : perimetros);
						return;
					}
				}
				default -> {
					while (true) {
						opcion = 1;
						System.out.println("Favor elija la categoría de unidad a utilizar:");
						for (String categoria : opcionConversiones) {
							System.out.printf("%d. %s (", opcion++, categoria);
							contar = 0;
							for (String simbolos : simbUnidades[opcion - 2]) {
								System.out.printf("%s", simbolos);
								if (++contar < simbUnidades[opcion - 2].length) {
									System.out.print(", ");
								}
							}
							System.out.println(").");
						}
						System.out.printf("%d. Regresar al menú anterior.%n", opcion);
						eleccion = sc.nextLine().trim();
						ingresoValido = !eleccion.trim().isEmpty() && eleccion.matches("[1-" + opcion + "]");
						if (!ingresoValido) {
							System.err.printf("Error: La opción ingresada no es válida. Por favor, elija una opción entre 1 y %d.%n", opcionConversiones.length + 1);
							continue;
						} else if (Integer.parseInt(eleccion) == opcion) {
							System.out.println("Regresando al menú anterior...");
							break;
						}
						opcion = Integer.parseInt(eleccion);
						eleccion = opcionConversiones[opcion - 1];
						System.out.printf("Usted a elegido: %s.%n", eleccion);
						while (true) {
							solicitud = opcionConversiones[opcion - 1];
							System.out.printf("Favor indique la unidad de %s a usar:\n", solicitud);
							unidad = 1;
							contar = 0;
							unidadOrigen = opcion == 1 ? nombreUnidades[opcion - 1] : nombreUnidades[opcion - 2];
							for (String unidades : unidadOrigen) {
								if (contar < simbUnidades[opcion - 1].length) {
									simboloOrigen = simbUnidades[opcion - 1][contar];
									if (opcion == 1) {
										System.out.printf("%d. %s (%s).%n", unidad++, unidades, simboloOrigen);
									} else if (opcion == 2 && !unidades.equals("Milímetro")) {
										System.out.printf("%d. %s %s (%s).%n", unidad++, unidades, nombreUnidades[opcion - 1][0], simboloOrigen);
									} else {
										unidadOrigen = nombreUnidades[opcion - 1];
										for (String angulos : unidadOrigen) {
											if (contar < simbUnidades[opcion - 1].length) {
												simboloOrigen = simbUnidades[opcion - 1][contar];
												System.out.printf("%d. %s (%s).%n", unidad++, angulos, simboloOrigen);
											}
											contar++;
										}
									}
									contar++;
								}
							}
							System.out.printf("%d. Regresar al menú anterior.%n", unidad);
							eleccion = sc.nextLine().trim();
							ingresoValido = !eleccion.trim().isEmpty() && eleccion.matches("[1-" + unidad + "]");
							if (!ingresoValido) {
								System.err.printf("Error: La opción ingresada no es válida. Por favor, elija una opción entre 1 y %d.%n", unidad);
								continue;
							} else if (Integer.parseInt(eleccion) == unidad) {
								System.out.println("Regresando al menú anterior...");
								break;
							}
							origen = Integer.parseInt(eleccion);
							eleccion = opcion == 2 ? nombreUnidades[opcion - 2][origen - 1] : nombreUnidades[opcion - 1][origen - 1];
							simboloOrigen = simbUnidades[opcion - 1][origen - 1];
							if (opcion == 2 && !eleccion.equals("Milímetro")) {
								eleccion += " " + nombreUnidades[opcion - 1][0];
							}
							System.out.printf("Usted ha elegido: %s (%s) %n", eleccion, simboloOrigen);
							while (true) {
								System.out.printf("ingrese %s en %s (%s):%n", solicitud, eleccion, simboloOrigen);
								valor = sc.nextLine().trim();
								ingresoValido = !valor.trim().isEmpty() && valor.matches("\\d+(\\.\\d+)?");
								if (!ingresoValido || Double.parseDouble(valor) <= 0) {
									System.err.println("Error: Entrada no válida. Ingrese un número mayor que 0.");
									continue;
								}
								valores[0] = Double.parseDouble(valor);
								break;
							}

							if (opcion <= 2) {
								System.out.println("Favor, elija unidad de destino:");
								unidadCambio = opcion == 1 ? nombreUnidades[opcion - 1].length : nombreUnidades[opcion - 2].length;
								cambioUnidades = new String[unidadCambio - 1][2];
								unidad = 1;
								indiceCambio = 0;
								for (contar = 0; contar < unidadCambio; contar++) {
									if (contar != (origen - 1)) {
										unidadNombre = opcion == 1 ? nombreUnidades[opcion - 1][contar] : nombreUnidades[opcion - 2][contar];
										unidadSimbolo = contar < simbUnidades[opcion - 1].length ? simbUnidades[opcion - 1][contar] : "";
										cambioUnidades[indiceCambio][0] = unidadNombre;
										cambioUnidades[indiceCambio][1] = unidadSimbolo;
										if (opcion == 1) {
											System.out.printf("%d. %s (%s).%n", unidad++, unidadNombre, unidadSimbolo);
										} else if (!unidadNombre.equals("Milímetro")) {
											System.out.printf("%d. %s %s (%s).%n", unidad++, unidadNombre, nombreUnidades[opcion - 1][0], unidadSimbolo);
										}
										indiceCambio++;
									}
								}
								eleccion = sc.nextLine().trim();
								ingresoValido = !eleccion.trim().isEmpty() && eleccion.matches("\\d+");
								if (!ingresoValido || !(Integer.parseInt(eleccion) >= 1 && Integer.parseInt(eleccion) <= unidad - 1)) {
									System.err.printf("Error: La opción ingresada no es válida. Por favor, elija una opción entre 1 y %d.%n", unidad - 1);
									continue;
								}
								destino = Integer.parseInt(eleccion);
								unidadDestino = cambioUnidades[destino - 1][0];
								simboloDestino = cambioUnidades[destino - 1][1];
								unidadDestino = opcion == 2 ? unidadDestino + " " + nombreUnidades[opcion - 1][0] : unidadDestino;
								System.out.printf("Usted ha seleccionado convertir a: %s (%s).%n", unidadDestino, simboloDestino);
							} else {
								unidadDestino = origen == 1 ? nombreUnidades[opcion - 1][1] : nombreUnidades[opcion - 1][0];
								simboloDestino = origen == 1 ? simbUnidades[opcion - 1][1] : simbUnidades[opcion - 1][0];
							}

							origenIndice = origen - 1;
							destinoIndice = destino - 1;

							factor = switch (opcion) {
								case 1 -> factoresConversionLongitudes[origenIndice][destinoIndice];
								case 2 -> factoresConversionArea[origenIndice][destinoIndice];
								default -> factoresConversionAngulos[origenIndice][0];
							};

							resultado = valores[0] * factor;
							System.out.printf("Convirtiendo %.2f de %s a %s...%n", valores[0], unidadOrigen[origen - 1], unidadDestino);
							contar = (factor >= 1) ? 2 : 6;
							formato = "%." + contar + "f";
							System.out.printf("Conversión exitosa. %s en %s sería ", opcionConversiones[opcion - 1], unidadDestino);
							System.out.printf(formato + " (%s).%n", resultado, simboloDestino);

							return;
						}
					}
				}
			}
		}
	}
}
